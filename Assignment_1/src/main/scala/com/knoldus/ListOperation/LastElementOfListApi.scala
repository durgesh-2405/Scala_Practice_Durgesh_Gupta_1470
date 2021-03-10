//Assignment-1 by Durgesh Gupta

package com.knoldus.ListOperation

import scala.collection.immutable.List
/* In this we have created a class called LastElementOfListApi.
* In this class we have defined two method. 1) lengthOfList 2) lastElement.
* */

class LastElementOfListApi {
  /* The method lengthOfList will return the length of the list using an accumulator */

  def lengthOfList(inputlist: List[Any]) : Int = inputlist match {
      case Nil => 0
      case _ :: tail =>
        val accumulator = lengthOfList(tail)
        1 + accumulator

    }
  /* The method lastElement will return the last element of the list using the index value*/
  def lastElement(inputlist: List[Any]): Any ={

    val indexOfLastElement = lengthOfList(inputlist)-1
    val lastElementOfList= inputlist(indexOfLastElement)
    lastElementOfList
  }
}
