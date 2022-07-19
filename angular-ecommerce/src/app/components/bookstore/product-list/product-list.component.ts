import { Component, OnInit } from '@angular/core';
import {BooksService} from './product-list.component.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products:any
  bookService: BooksService

  constructor(private booksService: BooksService) { 
    this.bookService = booksService
  }

  ngOnInit(): void {
    this.products = this.bookService.getProducts().subscribe(data => {
      this.products = data
      console.log(this.products)
    })
  }

}
