import { Company } from './company';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';  

@Injectable({
  providedIn: 'root'
})
export class CompanyServiceService {
  private companyUr: string;
  

  constructor(private http: HttpClient) { 
    this.companyUr = 'http://localhost:8080/api/';
    

  }
 
  findAll(): Observable<any> {  
    return this.http.get(this.companyUr+'company');  
  }  
 
   save(company: any): Observable<any>{
    return this.http.post<Company>(this.companyUr+'companysave', company);
  }


}


 
  
 
 
