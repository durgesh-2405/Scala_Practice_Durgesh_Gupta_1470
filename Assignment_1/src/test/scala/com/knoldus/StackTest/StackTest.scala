//Assignment-1 by Durgesh Gupta
package com.knoldus.StackTest

import com.knoldus.Stack.StackApi
import org.scalatest.flatspec.AnyFlatSpec
/* In this class StackTest which extends AnyFlatSpec we have
* developed the unit test cases to test the various operation of stack.
* To test the methods of stack we have created an object of StackApi.*/

class StackTest extends AnyFlatSpec{
  val input_1 = 5
  val input_2 = 10
  val input_3 = "Sample"
  val input_4 = 'a'
  val input_5 = 97.65
  val stackTestImplementation = new StackApi()

  "The stack is empty" should "be valid " in {
    val result = stackTestImplementation.isEmpty
    assert(result)
  }

  "Pop operation will give Underflow condition " should "and valid " in {
    val result = stackTestImplementation.pop()
    assert(result == "Underflow condition")
  }

  "5 should be pushed and " should "be valid " in {
    val result = stackTestImplementation.push(input_1)
    assert(result == "Item is pushed")
  }

  "10 should be pushed and " should "be valid " in {
    val result = stackTestImplementation.push(input_2)
    assert(result == "Item is pushed")
  }

  "Sample should be pushed and " should "be valid " in {
    val result = stackTestImplementation.push(input_3)
    assert(result == "Item is pushed")
  }

  "a should be pushed and " should "be valid " in {
    val result = stackTestImplementation.push(input_4)
    assert(result == "Item is pushed")
  }

  "97.65 should be pushed and " should "be valid " in {
    val result = stackTestImplementation.push(input_5)
    assert(result == "Item is pushed")
  }

  "Stack display " should "be valid " in {
    val result = stackTestImplementation.displayStack()
    assert(result== "List(97.65, a, Sample, 10, 5)")

  }

  "Pop operation will give 97.65 " should "be valid " in {
    val result = stackTestImplementation.pop()
    assert(result == "Item at top is popped.")
  }

  "Top element of the stack " should "be valid for a " in {
    val result = stackTestImplementation.topElementOfStack
    assert(result == 'a')
  }

  "The size of stack " should "be valid for 4" in {
    val result = stackTestImplementation.size
    assert(result == 4)
  }

}
