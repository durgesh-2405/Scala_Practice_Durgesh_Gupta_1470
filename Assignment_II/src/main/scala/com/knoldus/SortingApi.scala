//Sorting of List by Durgesh Gupta
package com.knoldus
import scala.language.postfixOps
import scala.collection.immutable.List
class SortingApi {

  /* Here we are creating a method for quick sort */
  def quickSort (integerList: List[Int]): List[Int] = {
    if (integerList.length <= 1) {
      integerList // Check if there's either only one element or empty
    }
    else {
      val pivotElement= integerList(integerList.length/2)
      List.concat(
        quickSort(integerList filter(_ < pivotElement)),
        integerList filter (pivotElement ==),
        quickSort(integerList filter(_ > pivotElement)))
    }


  }


}
