
import { ApiProperty } from '@nestjs/swagger';


export class User {
  

  @ApiProperty()
  readonly userID: number | undefined;

  @ApiProperty()
  readonly userFName: String | undefined;

  @ApiProperty()
  readonly userLName: String | undefined;

  @ApiProperty()
  readonly email: String | undefined;

  @ApiProperty()
  readonly userRole: String | undefined;

  // additional properties and methods can be defined here
}
