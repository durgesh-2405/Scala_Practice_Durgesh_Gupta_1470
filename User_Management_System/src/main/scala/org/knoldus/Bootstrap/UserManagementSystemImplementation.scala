//User Management System, Author- Durgesh Gupta
package org.knoldus.Bootstrap

import org.knoldus.DataAccessObject.DataAccessObject
import org.knoldus.UserDataRepository.UserDataRepository
import org.knoldus.UserModel.{UserData, UserType}
import org.knoldus.UserValidation.UserValidation

import java.sql.{Connection, DriverManager}


object UserManagementSystemImplementation extends App{

  val userDataRepository: DataAccessObject[UserData] = new UserDataRepository
  val validationOperation = new UserValidation(userDataRepository)
  val adminUser = UserData(1, "Durgesh",UserType.ADMIN)
  val customerUser = UserData(2,"Saurabh",UserType.CUSTOMER)

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Durgesh"
  val password = "Durgesh@2405"

  var connection: Connection = _
  /* Inserting the data of admin.
   */
  print(validationOperation.addUser(adminUser) + "\n")
  /* Inserting the data of customer.
   */
  print(validationOperation.addUser(customerUser) + "\n")
  // Fetching the list of user.
  validationOperation.getListOfUser
  // Fetching user using id.
  validationOperation.getUserName(1)
  print("\n Updating Name: \n")
  if(validationOperation.updateUsername(1,"Durgesh Gupta")) {
    print("Name Updated Successfully.. \n")
  }
  else{
    print("Unable to update Name")
  }
  // Deleting a user data.
  validationOperation.deleteUser(2)

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
  } catch {
    case e: Throwable=> e.printStackTrace
  }
  connection.close()
}




