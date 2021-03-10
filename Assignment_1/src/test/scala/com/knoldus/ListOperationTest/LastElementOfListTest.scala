//Assignment-1 by Durgesh Gupta

package com.knoldus.ListOperationTest

import com.knoldus.ListOperation.LastElementOfListApi
import org.scalatest.flatspec.AnyFlatSpec
/* In this class LastElementOfListTest extending the AnyFlatSpec.
* We have defined unit test cases to test the method of LastElementOfListApi
* */
class /* In this class LastElementOfListTest extending the AnyFlatSpec.
* We have defined unit test cases to test the method of LastElementOfListApi
* */LastElementOfListTest extends AnyFlatSpec{
  val input_1=1
  val input_2=2
  val input_3=3
  val input_4="Sample"
  val input_5='a'
  val input_6=97.666
  val input_7= "string"
  val input_8= 88.456
  val input_9= 90.4

  val lastElementOfListTest = new LastElementOfListApi()

  /* Unit test cases are defined to test the last element of the list */
  "The last element of List[1,2,3,a,97.66] " should "be valid for 97.666" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_1,input_2,input_3,input_5,input_6))
    assert(expectedLastElement==97.666)
  }

  "The last element of List[string,a,1,97.666,90.4,Sample] " should "be valid for Sample" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_7,input_5,input_1,input_6,input_9,input_4))
    assert(expectedLastElement== "Sample")
  }

  "The last element of List[1,2,3,97.666,88.456,90.4] " should "be valid for 90.4" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_1,input_2,input_3,input_6,input_8,input_9))
    assert(expectedLastElement== 90.4)
  }
  "The last element of List[a, Sample, string] " should "be valid for string" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_5,input_4,input_7))
    assert(expectedLastElement== "string")
  }
  "The last element of List[Sample, string, 88.456, a] " should "be valid for a" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_4,input_7,input_8,input_5))
    assert(expectedLastElement== 'a')
  }

  "The last element of List[1,2,3,Sample,a,97.66,string] " should "be valid for string" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_1,input_2,input_3,input_4,input_5,input_6,input_7))
    assert(expectedLastElement== "string")
  }

  "The last element of List[1,2,3,Sample,a,97.66,string] " should "be invalid for a" in {
    val expectedLastElement = lastElementOfListTest.lastElement(inputlist = List(input_1,input_2,input_3,input_4,input_5,input_6,input_7))
    assert(expectedLastElement!= 'a')
  }

}
