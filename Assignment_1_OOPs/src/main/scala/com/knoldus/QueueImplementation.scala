//OOPs Assignment-1 by Durgesh Gupta
package com.knoldus


import com.knoldus.DoubleQueue.DoubleQueueApi
import com.knoldus.SquareQueue.SquareQueueApi

/*Creating main class of  Queue Implementation to implement the Double Queue
* Square queue class by creating the object of both the classes of Double Queue
* and Square Queue
* */

object QueueImplementation extends App {


  val input_1= 50
  val input_2= 60
  val input_3= 70
  val input_4= 80
  val input_5= 6
  val input_6= 7
  val input_7= 8
  val input_8= 9

  /*Implementing Double Queue operations..
  * By creating the object of DoubleQueueApi Class*/

  val doubleQueue = new DoubleQueueApi()

  print("Implementing Double queue \n")
  doubleQueue.enqueue(input_1)
  doubleQueue.enqueue(input_2)
  doubleQueue.enqueue(input_3)
  doubleQueue.enqueue(input_4)
  print(doubleQueue.getQueue + "\n")
  doubleQueue.dequeue
  print(doubleQueue.getQueue + "\n")
  doubleQueue.dequeue
  print(doubleQueue.getQueue + "\n")

  /*Implementing Square Queue operations
  * by creating object of Square QueueApi class*/

  val squareQueue = new SquareQueueApi()

  print("Implementing Square queue: \n")
  squareQueue.enqueue(input_5)
  squareQueue.enqueue(input_6)
  squareQueue.enqueue(input_7)
  squareQueue.enqueue(input_8)
  print(squareQueue.getQueue + "\n")
  squareQueue.dequeue
  print(squareQueue.getQueue + "\n")
  squareQueue.dequeue
  print(squareQueue.getQueue + "\n")

}
