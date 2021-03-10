//Assignment-1 by Durgesh Gupta
package com.knoldus.ListOperation
import scala.collection.immutable.List
import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

/* In the main function we have implemented the LastElementOfList Api
* We have taken two input 1. size of the list. 2. the elements of the list.
* The we created an object of LastElementOfListApi Class.
* Using the object we called the last element method which will return the last element of the list.
*  */

object LastElementOfList extends App {
  print("Enter the number of elements of the list")
  val sizeOfList: Int = readInt()
  print("Enter " + sizeOfList + " elements: \n")
  private val inputList: List[Any] = List.fill(sizeOfList) {
    readLine()
  }
  print("The input list is: " + inputList + "\n")

  if(inputList.isEmpty) {
    print("List is Empty\n")
  }
  else {
    val lastElementOfList= new LastElementOfListApi()
    print("\nLast Element of the List is: " + lastElementOfList.lastElement(inputList))


  }


}
