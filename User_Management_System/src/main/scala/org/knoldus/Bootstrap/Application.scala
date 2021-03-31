//User Management System, Author- Durgesh Gupta

package org.knoldus.Bootstrap
import org.knoldus.DataAccessObjects.Dao
import org.knoldus.UserModels._
import org.knoldus.UserRepository.UserRepository
import org.knoldus.Validation.UserValidate

import java.sql.{Connection, DriverManager}

object Application extends App {

  val userDataRepository : Dao[User] = new UserRepository
  val validationOoperations = new UserValidate(userDataRepository)
  val userAdmin = User( 1, "Durgesh" , UserType.ADMIN)
  val userCustomer = User(2 , "Saurabh" , UserType.CUSTOMER)

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Durgesh"
  val password = "Durgesh@2405"
  var connection:Connection = _

  //Inserting user to the table
  print(s"Admin added in the Table: ${validationOoperations.addUser(userAdmin)}")
  print(s"Customer added the Table: ${validationOoperations.addUser(userCustomer)}")

  //Calling the getUser method to print the table
  validationOoperations.getUserList

  //Calling getUser method to get the name of the id[We will get Durgesh as output]
  validationOoperations.getUser(1)

  //Calling changeUserName method to update the name of particular id
  validationOoperations.changeUserName(1 , "Durgesh Gupta")
  print(s"\nUsers in the Table after Updating id 1 by Durgesh Gupta:\n ${validationOoperations.getUserList}")

  //Calling removeUser method to delete a row from the table
  validationOoperations.removeUser(1)

  print(s"\nUsers in the Table after Deleting id 1 : ${validationOoperations.getUserList}")

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
  } catch {
    case e: Throwable=> e.printStackTrace
  }
  connection.close()
}
