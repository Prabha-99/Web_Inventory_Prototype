
import { ApiProperty } from '@nestjs/swagger';


export class User {
  

  @ApiProperty()
  userID: number | undefined;

  @ApiProperty()
  userFName: String | undefined;

  @ApiProperty()
  userLName: String | undefined;

  @ApiProperty()
  email: String | undefined;

  @ApiProperty()
  userRole:String | undefined;

  // additional properties and methods can be defined here
}
