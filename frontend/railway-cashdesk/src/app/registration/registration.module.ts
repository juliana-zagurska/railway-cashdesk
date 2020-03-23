import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RegistrationRoutingModule} from "./registration.routing";
import {RouterModule} from "@angular/router";
import {RegistrationComponent} from "./registration.component";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  exports: [
    RegistrationComponent
  ],
  declarations: [
    RegistrationComponent
  ],
  imports: [
    CommonModule,
    RegistrationRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule,
  ]
})
export class RegistrationModule { }
