//Reverse of String by Durgesh Gupta
package com.knoldus

import scala.annotation.tailrec
/*Here we are creating a tail recursion method which will reverse the string*/
class ReverseApi {
  def reverseOfString(string: String): String={
    val listOfCharOfString = string.toList
    @tailrec
    def reverse(listOfCharOfString: List[Char], reversedCharList: List[Char]): List[Char]= listOfCharOfString match {
      case Nil => reversedCharList
      case headOfCharList :: tailOfCharList =>  reverse(tailOfCharList, headOfCharList :: reversedCharList)
    }
    reverse(listOfCharOfString, Nil).mkString

  }
}
