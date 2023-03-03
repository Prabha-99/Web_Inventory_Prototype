import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdduserService {

  constructor(private http: HttpClient) { }

  submitData(data: any) {
    const url = 'http://localhost:8080/api/tables/addUser';
    return this.http.post(url, data);
  }
}
