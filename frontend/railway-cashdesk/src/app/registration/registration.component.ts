import { Component, OnInit } from '@angular/core';
import {RegistrationService} from "../rest/registration/registration.service";
import {RegistrationDto} from "../rest/registration/registration.dto";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  dto: RegistrationDto = new RegistrationDto();

  constructor(private registrationServiceService: RegistrationService) { }

  ngOnInit() {
  }

  saveUser() {
    this.registrationServiceService.saveUser(this.dto).subscribe(data=>{
      console.log(data);
    })
  }


}
