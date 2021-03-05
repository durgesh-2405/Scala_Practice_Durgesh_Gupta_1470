//Reverse of String by Durgesh Gupta
package com.knoldus

import scala.io.StdIn.readLine
/* Here We are Implementing the Reverse Api Method*/

object ReverseImplementation extends App{
  print("Enter the string\n")
  val string= readLine()
  val stringlength= string.length
  if(stringlength== 0){
    print("The string is empty")
  }
  else if(stringlength== 1){
    print("The Reversed string is: " + string)
  }
  else{
    val reverseApi = new ReverseApi()
    print("The Reversed string is: " + reverseApi.reverseOfString(string))
  }
}
