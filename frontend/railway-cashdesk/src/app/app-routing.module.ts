import { NgModule } from '@angular/core';
import {Routes, RouterModule, Router} from '@angular/router';


const routes: Routes = [
  {
    path: '',
    loadChildren: './main-page/main-page.module#MainPageModule'
  },
  {
    path: 'login',
    loadChildren: './login/login.module#LoginModule'
  },
  {
    path: 'registration',
    loadChildren: './registration/registration.module#RegistrationModule'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}



