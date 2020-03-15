import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { CompanyServiceService } from '../company-service.service';

@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {
  company: Company[];
  constructor(private companyService: CompanyServiceService) { 

  }

  ngOnInit(): void {
    this.companyService.findAll().subscribe(data => {
      this.company = data;
  

});
}
}
