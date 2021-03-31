//User Management System, Author- Durgesh Gupta
package org.knoldus.UserValidation

import org.knoldus.DataAccessObject.DataAccessObject
import org.knoldus.UserModel.UserData

class UserValidation(userRepo: DataAccessObject[UserData]) {

  def addUser(userDetail: UserData): String = {
    if(userDetail.userName.nonEmpty && !userRepo.viewUserId().contains(userDetail.userId)){
      userRepo.userCreate(userDetail)
      "Data Inserted Successfully.. \n"
    }
    else{
      "Data Invalid.. \n"
    }
  }

  def getListOfUser: List[UserData] = userRepo.viewUser()

  def deleteUser(userId: Int): Boolean = {
    if(userRepo.viewUserId().contains(userId)){
      userRepo.deleteUser(userId)
      true
    }
    else{
      false
    }
  }

  def updateUsername(userId: Int, userName: String): Boolean ={
    if(userRepo.viewUserId().contains(userId)){
      userRepo.updateUser(userId,userName)
      true
    }
    else{
      false
    }
  }

  def getUserName(userId: Int): String = {
    if(userRepo.viewUserId().contains(userId)){
      userRepo.getUsernameById(userId)
    }
    else{
      "Kindly Enter Valid User Id.. "
    }

  }

  def getUserId: List[Int] = userRepo.viewUserId()



}
