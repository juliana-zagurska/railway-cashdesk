import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

export class TicketService {


  private baseUrl: string = 'localhost://localhost:8090/api/v1/ticket';

  constructor(private http: HttpClient) {
  }

  getFirstTicket(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

}
