//User Management System, Author- Durgesh Gupta
package org.knoldus.DatabaseLayer

import org.knoldus.UserModel.UserData

import java.sql.{Connection, DriverManager}

trait DatabaseApi {

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Durgesh"
  val password = "Durgesh@2405"

  var connection: Connection = _

  def insertUserDataToDatabase(userDetail : UserData): Unit ={
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url,username,password)

      val statement = connection.createStatement()

      val userId = userDetail.userId
      val userName = userDetail.userName
      val userType = userDetail.userType

      statement.executeUpdate(s"INSERT INTO userdatabase.User VALUES ('$userId', $userName, $userType)")

    }
    catch {
      case e: Throwable => e.printStackTrace()
    }
    connection.close()
  }

  def selectUserDatabase(): Any ={
    try{
      Class.forName(driver)
      connection = DriverManager.getConnection(url,username,password)
      val statement = connection.createStatement()
      val queryResult = statement.executeQuery("SELECT * FROM userdatabase.User")
      print("User Data in the Database: \n")
      while(queryResult.next()){
        val userId = queryResult.getString("user_id")
        val userName = queryResult.getString("user_name")
        val userType = queryResult.getString("user_type")
        print("User Id: " + userId + "User Name: " + userName + "User Type: " + userType + "\n")

      }

    }
    catch{
      case e: Throwable => e.printStackTrace()
    }
    connection.close()

  }

  def deleteUserDataFromDatabase(userId: Int): Unit = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val userIdToBeDeleted = userId
      statement.executeUpdate(s"DELETE from userdatabase.User where userId = '$userIdToBeDeleted'")

    }
    catch{
      case e: Throwable => e.printStackTrace()
    }
    connection.close()
  }


  def updateUserDataInDatabase(userId: Int, updateName: String): Unit ={
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val userIdToBeUpdated = userId
      val updatedName =  updateName
      statement.executeUpdate(s"UPDATE userdatabase.User SET userName = '$updatedName'  where userId = '$userIdToBeUpdated'")

    }
    catch{
      case e: Throwable => e.printStackTrace()
    }
    connection.close()

  }


   def getUserNameUsingId(userId: Int): String = {
    try{
      Class.forName(driver)
      connection = DriverManager.getConnection(url,username,password)
      val statement = connection.createStatement()
      val id = userId
      val queryResult = statement.executeQuery(s"SELECT Name FROM userdatabase.User where userId = '$id'")
      print("Fetched Users Name using Id: \n")
      while(queryResult.next()){
        val userName = queryResult.getString("user_name")
        print("User Name: " + userName + "\n")

      }
      "Name Successfully Returned."

    }
    catch{
      case e: Throwable => e.printStackTrace()
        "Unable to return Name.."
    }
     finally {
       connection.close()
     }

  }



}
