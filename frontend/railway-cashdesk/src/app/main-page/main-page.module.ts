import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MainPageRoutingModule} from './main-page.routing';
import {RouterModule} from "@angular/router";
import {MainPageComponent} from "./main-page.component";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  exports: [
    MainPageComponent
  ],
  declarations: [
    MainPageComponent
  ],
  imports: [
    CommonModule,
    MainPageRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule
  ]
})
export class MainPageModule { }
