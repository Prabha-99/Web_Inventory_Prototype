import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserServiceService } from '../user-service.service';


@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {

  form!: FormGroup;

  constructor(private userService: UserServiceService) { }


  ngOnInit(){
      this.form = new FormGroup({
      userid: new FormControl('', Validators.required),
      userfname: new FormControl('', Validators.required),
      userlname: new FormControl('', Validators.required),
      email: new FormControl('', [Validators.required, Validators.email]),
      user_role: new FormControl('', Validators.required)
      
    });
  }

  onSubmit(){
    const data = this.form.value;
    this.userService.submitData(data).subscribe(() => {
      console.log('Data submitted successfully');
    }, (error: any) => {
      console.error('Error submitting data:', error);
    });
  }




}
