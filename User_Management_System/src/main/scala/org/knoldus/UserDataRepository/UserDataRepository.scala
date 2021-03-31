//User Management System, Author- Durgesh Gupta
package org.knoldus.UserDataRepository

import org.knoldus.DataAccessObject.DataAccessObject
import org.knoldus.DatabaseLayer.DatabaseApi
import org.knoldus.UserModel.UserData

import java.sql.{DriverManager, Statement}
import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class UserDataRepository extends DataAccessObject[UserData] with DatabaseApi{

  val userDataRepository: mutable.Map[Int, UserData] = mutable.Map()

  Class.forName(driver)
  connection = DriverManager.getConnection(url,username,password)

  /*Creating an statement to run the select query.
  */
  val statement: Statement = connection.createStatement()

  override def userCreate(userData: UserData): Boolean = {
    Try{
      userDataRepository += userData.userId -> userData
      insertUserDataToDatabase(userData)
    } match{
      case Success(value) => true
      case Failure(exception) => false
    }
  }

  override def viewUser(): List[UserData] = {
    selectUserDatabase()
    userDataRepository.values.toList
  }

  override def viewUserId(): List[Int] = userDataRepository.keySet.toList


  override def updateUser(userId: Int, userName: String): Boolean = {
    Try{
      val userData = UserData(userId, userName, userDataRepository(userId).userType )
      userDataRepository(userId) = userData

      updateUserDataInDatabase(userId, userName)
    } match {
      case Success(value) => true
      case Failure(exception) => false
    }
  }

  override def deleteUser(userId: Int): Boolean = {
    Try{
      userDataRepository -= userId
      deleteUserDataFromDatabase(userId)
    } match {
      case Success(value) => true
      case Failure(exception) => false
    }
  }

  override def getUsernameById(userId: Int): String = {
    getUserNameUsingId(userId)
    userDataRepository(userId).userName
  }



}
