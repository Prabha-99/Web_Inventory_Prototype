import {JsonProperty} from '@nestjs/mapped-types';

export class User {
  

  @JsonProperty('userID')
  userID: number;

  @JsonProperty('userFName')
  userFName: String;

  @JsonProperty('userLName')
  userLName: String;

  @JsonProperty('email')
  email: String;

  @JsonProperty('userRole')
  userRole:String;

  // additional properties and methods can be defined here
}
