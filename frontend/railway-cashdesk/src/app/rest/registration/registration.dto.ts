export class RegistrationDto {
  name:string;
  email:string;
  password:string;
  constructor(data?:RegistrationDto) {
    if (data) {
      this.name = data.name;
      this.email = data.email;
      this.password = data.password;
    }
  }
}
