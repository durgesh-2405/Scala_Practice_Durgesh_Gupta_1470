//Assignment-1 by Durgesh Gupta
package com.knoldus.Queue


import scala.io.StdIn.{readChar, readInt, readLine}

object QueueImplementation extends App {
  print("Press 1 to enqueue the item in queue \n")
  print("Press 2 to dequeue the item from the queue \n")
  print("Press 3 to display the queue \n")
  print("Press 4 to check the queue is empty or not \n")
  print("Press 5 to get the element at the front of the queue \n")
  print("Press 6 to get the size of the queue \n")
  print("######################################################################## \n")
  val queueImplementation = new QueueApi()
  var toRepeatMenu = 'y'
  while (toRepeatMenu == 'y' || toRepeatMenu == 'Y' ) {
    print("\n Enter your choice \n")
    val inputChoice: Int = readInt()

    if(inputChoice == 1){
      print("\nEnter the item to be enqueued \n")
      val inputItem = readLine()
      print("\n" + queueImplementation.enqueue(inputItem) + "\n")

    }

    else if (inputChoice == 2) {
      print("\n" + queueImplementation.dequeue() + "\n")
    }

    else if(inputChoice == 3) {
      print("\n The Elements of stack are: \n")
      queueImplementation.displayQueue().foreach(print)
    }

    else if(inputChoice == 4) {
      val result = queueImplementation.isEmpty
      if(result) {
        print("Queue is empty")
      }
      else {
        print("Queue is not empty")
      }
    }

    else if(inputChoice == 5){
      print("\n  Front element of queue is: ")
      print(queueImplementation.topElementOfQueue)
    }

    else if(inputChoice == 6) {

      print(queueImplementation.size)

    }
    else{
      print("\n Invalid Input \n")
    }

    print("\n Do you want to continue..... Press Y else Press N \n")
    toRepeatMenu= readChar()
  }



}
