import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { users } from './users.model';


@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private apiURL="http://localhost:8080/api/tables/field1/{field1}" //The API URL(Endpoint)

  constructor(private http:HttpClient) { }

  getDataByField1(field1: string): Observable<users[]> {
    return this.http.get<users[]>(`${this.apiURL}/${field1}`);
  }

}
