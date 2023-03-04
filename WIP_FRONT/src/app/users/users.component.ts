import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { UserServiceService } from '../user-service.service';



@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit{

  users: User[] = [];

  constructor(private userService: UserServiceService) { }

  ngOnInit(): void {
    this.userService.getAllUsers()
      .subscribe(users => {
        this.users = users;
      });

  }

  onDelete(userId: number): void {
    this.userService.deleteUser(userId).subscribe(() => {
        console.log(`User with ID ${userId} has been deleted.`);
    });
}

}
