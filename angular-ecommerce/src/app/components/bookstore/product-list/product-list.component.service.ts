import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()

export class BooksService {
  apiUrl = "https://fakestoreapi.com/products"
  httpOptions = {
    Headers: new HttpHeaders({'content-type': 'application/json'})
  }

  constructor(private httpClient: HttpClient) {
    
  }

  getProducts() {
    return this.httpClient.get(this.apiUrl)
  }
}
