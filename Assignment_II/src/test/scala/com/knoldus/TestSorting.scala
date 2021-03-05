
//Sorting of List by Durgesh Gupta
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
/* Here we are creating unit test cases to the quick sort method */
class TestSorting extends AnyFlatSpec{
  val input_1=5
  val input_2=6
  val input_3=10
  val input_4=23
  val input_5=25
  val input_6=27
  val testArray: List[Int]= List(input_5,input_3,input_4,input_6,input_1,input_2)
  val sorting= new SortingApi()

  "Sorting " should "be valid " in {
    val result = sorting.quickSort(testArray)
    assert(result== List(input_1,input_2,input_3,input_4,input_5,input_6))
  }

  "Sorting " should "be invalid " in {
    val result = sorting.quickSort(testArray)
    assert(result!= List(input_5,input_3,input_4,input_6,input_1,input_2))
  }

}

