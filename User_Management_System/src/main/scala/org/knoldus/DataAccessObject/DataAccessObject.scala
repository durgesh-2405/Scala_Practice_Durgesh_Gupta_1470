//User Management System, Author- Durgesh Gupta
package org.knoldus.DataAccessObject

trait DataAccessObject[UserData] {

  def userCreate(userData: UserData): Boolean

  def updateUser(userId: Int, userName: String): Boolean

  def viewUser(): List[UserData]

  def deleteUser(userId: Int): Boolean

  def viewUserId(): List[Int]

  def getUsernameById(userId: Int): String

}
