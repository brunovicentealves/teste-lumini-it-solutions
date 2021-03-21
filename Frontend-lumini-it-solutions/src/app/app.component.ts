import { Component } from '@angular/core';
import{FormControl, FormGroup, Validators} from '@angular/forms';
import { Media } from './media';
import {Endereco} from './endereco';
import {ServicoService} from './servico.service'


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  media: Media[] = [];
  endereco: Endereco[] = [];
  mensagem : string = "";
 
  form: FormGroup = new FormGroup({
    valorUm : new FormControl('',[Validators.required,Validators.minLength(1),Validators.maxLength(3),Validators.pattern('[0-9.]*')]),
    valorDois : new FormControl('',[Validators.required,Validators.minLength(1),Validators.maxLength(3),Validators.pattern('[0-9.]*')])
  })

  form1: FormGroup = new FormGroup({
    cnpj : new FormControl('',[Validators.required,Validators.minLength(14),Validators.maxLength(14),Validators.pattern('[0-9]*')]),
   
  })
  constructor( 
    private service : ServicoService
    ){
   

    }

  submit(){
    const media: Media ={... this.form.value}
    this.service.CalcularMedia(media)
    .subscribe( valorMedia =>{
      this.media.push(valorMedia)
      this.form.reset
      console.log(valorMedia)
    })

  }
  submit2(){

  this.service.EnderecoCnpj(this.form1.value.cnpj)
    .subscribe(endereco=>{
      
        this.mensagem = "Não encontrado"
      
        this.endereco.push(endereco)
      
      this.form1.reset
     
    },err =>{

      console.log(err)
    })
    

  }
}
