import { Component } from '@angular/core';
import{FormControl, FormGroup} from '@angular/forms';
import { Media } from './media';
import {ServicoService} from './servico.service'


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  media: Media[] = [];
 
  form: FormGroup = new FormGroup({
    valorUm : new FormControl(''),
    valorDois : new FormControl('')
  })

  form1: FormGroup = new FormGroup({
    cnpj : new FormControl(''),
   
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
    console.log(this.form1.value)
  }
}
