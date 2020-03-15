import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyListComponent } from './company-list/company-list.component';
import { CompanyFormComponent } from './company-form/company-form.component';
import { FormsModule } from '@angular/forms';

const routes: Routes = [
  { path: 'company', component: CompanyListComponent },
  { path: 'companysave', component: CompanyFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes),

  FormsModule ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
