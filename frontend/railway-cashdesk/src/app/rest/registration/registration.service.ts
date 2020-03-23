import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RegistrationDto} from "./registration.dto";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  private baseUrl: string = `http://localhost:8090/api/v1/registration`;

  constructor(private http: HttpClient) {}

  saveUser(registrationDto:RegistrationDto):Observable<any> {
    return this.http.post(this.baseUrl, registrationDto);
  }
}
