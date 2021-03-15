//OOPs Assignment-1 by Durgesh Gupta
package com.knoldus.QueueTest

//import DoubleQueue.DoubleQueueApi
import com.knoldus.DoubleQueue.DoubleQueueApi
import com.knoldus.SquareQueue.SquareQueueApi
import org.scalatest.flatspec.AnyFlatSpec

/* Here we are writing unit test cases to test the operations of Queue..*/
class TestQueue extends AnyFlatSpec{

  /*Defining unit test cases for Double queue..
  * Firstly we crete the object of the Double queue class defined in the Queue api.
  * Then we will call the different methods of the queue defined in the queue trait and
  * we call the overridden method of enqueue to test it.
  * */

  val doubleQueueTest = new DoubleQueueApi()
/*
  "The dequeue method of DoubleQueue" should "be valid when queue is empty" in {
    val actualResult = doubleQueueTest.dequeue
    val expectedResult = "Empty Queue.."
    assert(actualResult === expectedResult)
  }*/

  "The enqueue method of DoubleQueue" should "be valid" in {
    val actualResult = doubleQueueTest.enqueue(2)
    val expectedResult = "Item enqueued.."
    assert(actualResult === expectedResult)
  }



  "The enqueue method of DoubleQueue" should "not be valid" in {
    val actualResult = doubleQueueTest.enqueue(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }
  doubleQueueTest.enqueue(3)
  doubleQueueTest.enqueue(1)



  "The dequeue method in DoubleQueue" should "be valid " in {
    val actualResult = doubleQueueTest.dequeue
    val expectedResult = "Item dequeued.."
    assert(actualResult == expectedResult)
  }


  "The getQueue method in DoubleQueue" should "be valid " in {
    val actualResult = doubleQueueTest.getQueue
    val expectedResult = List(2.0,4.0,2.0)
    assert(actualResult == expectedResult)
  }

  /*Defining unit test cases for Double queue..
* Firstly we crete the object of the Square queue class defined in the Queue api.
* Then we will call the different methods of the queue defined in the queue trait and
* we call the overridden method of enqueue to test it.
* */

  val squareQueueTest = new SquareQueueApi

  "The enqueue method of SquareQueue" should "be valid" in {
    val actualResult = squareQueueTest.enqueue(2)
    val expectedResult = "Item enqueued.."
    assert(actualResult === expectedResult)
  }



  "The enqueue method of SquareQueue" should "not be valid" in {
    val actualResult = squareQueueTest.enqueue(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }
  squareQueueTest.enqueue(3)
  squareQueueTest.enqueue(1)



  "The dequeue method in SquareQueue" should "be valid " in {
    val actualResult = squareQueueTest.dequeue
    val expectedResult = "Item dequeued.."
    assert(actualResult == expectedResult)
  }


  "The getQueue method in SquareQueue" should "be valid " in {
    val actualResult = squareQueueTest.getQueue
    val expectedResult = List(1.0,4.0,1.0)
    assert(actualResult == expectedResult)
  }


}
