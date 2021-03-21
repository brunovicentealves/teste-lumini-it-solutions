import { Injectable } from '@angular/core';
import {Media} from './media'
import {Endereco} from './endereco'
import { Observable} from 'rxjs'
import {catchError} from 'rxjs/operators'
import {HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class ServicoService {

  apiURL : string = 'http://localhost:8080';
  apiURL2 : string = 'http://localhost:8080/'
  constructor(
    private http: HttpClient
    ) {
   }

   


  CalcularMedia(media : Media) : Observable<Media>{

    return this.http.post<Media>(`${this.apiURL}/media`,media)
  }

  EnderecoCnpj(cnpj : number) : Observable<Endereco>{
   return this.http.get<Endereco>(`${this.apiURL}/endereco/${cnpj}`)
  
  }

  
}
