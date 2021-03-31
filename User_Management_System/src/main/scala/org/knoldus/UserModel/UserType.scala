//User Management System, Author- Durgesh Gupta
package org.knoldus.UserModel

sealed trait UserType

object UserType {
  case object ADMIN extends UserType
  case object CUSTOMER extends UserType

}
