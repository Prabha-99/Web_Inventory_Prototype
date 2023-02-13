import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent {

  users:any;

  constructor(private http: HttpClient) { }


  ngOnInit(){
    let response= this.http.get("http://localhost:8080//api/tables"); //Here
    response.subscribe((data)=>this.users=data);
 }

}
