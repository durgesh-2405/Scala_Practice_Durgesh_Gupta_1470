//Assignment-1 by Durgesh Gupta
package com.knoldus.QueueTest

import com.knoldus.Queue.QueueApi
import org.scalatest.flatspec.AnyFlatSpec
/* In this class QueueTest which extends AnyFlatSpec we have
* developed the unit test cases to test the various operation of queue.
* To test the methods of queue we have created an object of QueueApi.*/

class QueueTest extends AnyFlatSpec{
  val input_1 = 5
  val input_2 = 10
  val input_3 = "Sample"
  val input_4 = 'a'
  val input_5 = 97.65
  val queueTestImplementation = new QueueApi()


  "The queue is empty" should "be valid " in {
    val result = queueTestImplementation.isEmpty
    assert(result)
  }

  "Pop operation will give Underflow condition " should "and valid " in {
    val result = queueTestImplementation.dequeue()
    assert(result == "Empty Queue....")
  }

  "5 should be enqueued and " should "be valid " in {
    val result = queueTestImplementation.enqueue(input_1)
    assert(result == "Item is enqueued")
  }

  "10 should be enqueued and " should "be valid " in {
    val result = queueTestImplementation.enqueue(input_2)
    assert(result == "Item is enqueued")
  }

  "Sample should be enqueued and " should "be valid " in {
    val result = queueTestImplementation.enqueue(input_3)
    assert(result == "Item is enqueued")
  }

  "a should be enqueued and " should "be valid " in {
    val result = queueTestImplementation.enqueue(input_4)
    assert(result == "Item is enqueued")
  }

  "97.65 should be pushed and " should "be valid " in {
    val result = queueTestImplementation.enqueue(input_5)
    assert(result == "Item is enqueued")
  }

  "Queue display " should "be valid " in {
    val result = queueTestImplementation.displayQueue()
    assert(result== "List(5, 10, Sample, a, 97.65)")

  }

  "Dequeue operation will give 97.65 and " should "be valid " in {
    val result = queueTestImplementation.dequeue()
    assert(result == "Item is dequeued.")
  }

  "Top element of the stack " should "be valid for a " in {
    val result = queueTestImplementation.topElementOfQueue
    assert(result == "Sample")
  }

  "The size of stack " should "be valid for 4" in {
    val result = queueTestImplementation.size
    assert(result == 4)
  }


}
