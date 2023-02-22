import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private apiURL="http://localhost:8080/api/tables/allUsers" //The API URL(Endpoint)

  constructor(private http:HttpClient) { }
}
