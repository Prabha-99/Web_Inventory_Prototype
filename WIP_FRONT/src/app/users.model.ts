export class users {
    userID: number;
    userFName: string;
    userLName: string;
    email: string;
    userRole: string;
  
    constructor(data: any) {
      this.userID = data.userID;
      this.userFName = data.userFName;
      this.userLName = data.userLName;
      this.email = data.email;
      this.userRole = data.userRole;
    }
  }
  