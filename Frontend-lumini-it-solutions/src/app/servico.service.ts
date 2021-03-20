import { Injectable } from '@angular/core';
import {Media} from './media'
import {Observable} from 'rxjs'
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ServicoService {

  apiURL : string = 'http://localhost:8080/media';
  constructor(
    private http: HttpClient
    ) {
   }


  CalcularMedia(media : Media) : Observable<Media>{

    return this.http.post<Media>(this.apiURL,media)

  }
}
