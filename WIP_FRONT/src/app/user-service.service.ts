import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private Endpoint = 'http://localhost:8080/api/tables/allUsers';

  constructor(private http: HttpClient) { }

  getAllUsers(): Observable<User[]>{

    const headers = new HttpHeaders() //Basic Spring Security Authentication
      .set('Authorization', 'Basic ' + btoa('user:f00fa451-d738-4c73-924a-112d108a6a1d'));
      
    return this.http.get<User[]>(this.Endpoint,{headers});
  }
}
