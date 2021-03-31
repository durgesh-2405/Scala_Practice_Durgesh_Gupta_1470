//User Management System, Author- Durgesh Gupta

package org.knoldus.UserRepository

import org.knoldus.DataAccessObjects.Dao
import org.knoldus.DatabaseLayer.DatabaseConnectionApi
import org.knoldus.UserModels.User
import scala.util.{Failure, Success, Try}
import scala.collection.mutable

class UserRepository extends Dao[User] with DatabaseConnectionApi {

  val dataRepository: mutable.Map[Int, User] = mutable.Map()

  //method to insert the data in database after validating
  override def createUser(user: User): Boolean = {
    Try { dataRepository += user.id -> user
       insertUserDatabase(user)
    } match {
      case Success(value) => true
      case Failure(exception) => false
    }
  }

  //method to list all the table
  override def getUserList: List[User] = {
    selectUser()
    dataRepository.values.toList
  }

  //method to get the name of specific id after validating
  override def getUserNameById(id: Int): String = {
    getUserNameByIdDatabase(id)
    dataRepository(id).name
  }

  //method to get the list of all id in the database after validating
  override def getUserIdList(): List[Int] = dataRepository.keySet.toList

  //method to update the name of the specific id
  override def updateUser(id: Int, new_name: String):Boolean = {
    Try {
      val user = User(id, new_name, dataRepository(id).usertype)
      dataRepository(id) = user
      updateUserDatabase(id, new_name)
    } match {
      case Failure(exception) => false
      case Success(value) =>true
    }
  }

  //method to delete the specific id from the database after validating
  override def deleteUser(id : Int):Boolean = {
    Try {
      dataRepository -= id
      deleteUserDatabase(id)
    } match {
      case Failure(exception) => false
      case Success(value) => true
    }
  }
}
