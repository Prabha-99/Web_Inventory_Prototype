import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit{

  users:any;

  constructor(private http:HttpClient) { }


  ngOnInit(){
    let response= this.http.get("http://localhost:8080/api/tables/allUsers"); //Here
    response.subscribe((data)=>this.users=data);
 }

}
