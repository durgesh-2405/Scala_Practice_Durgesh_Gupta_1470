//Assignment-1 by Durgesh Gupta
package com.knoldus.Queue
/* In this class QueueApi we have created different methods to perform various operation on queue using list. */

class QueueApi {
  var queue: List[Any] = List.empty
  var frontOfQueue: Int = -1
  var rearOfQueue: Int = -1

  /* This method is defined to check the queue is empty or not.
* If the queue is empty then this will return true otherwise it will return false.
* */

  def isEmpty: Boolean = {
    if(frontOfQueue == -1 || rearOfQueue == -1) {
      true
    }
    else {
      false
    }
  }
  /* This method is defined to enqueue the item to the queue in the FIFO order.
  * The element will enqueued at the front of the list and the be value of the front and rear will be increased by one. */
  def enqueue(item: Any ): String = {
    if(rearOfQueue == -1 && frontOfQueue == -1){
      frontOfQueue = frontOfQueue + 1
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item)
      "Item is enqueued"
    }
    else{
      rearOfQueue= rearOfQueue + 1
      queue = queue ::: List(item)
      "Item is enqueued"
    }
  }
  /* This method is defined to dequeue the item from the queue in the FIFO order.
* The element will dequeued from front of the list and the be value of the front and rear will be decreased by one. */

  def dequeue(): String = {
    if(frontOfQueue == -1 && rearOfQueue == -1){
      "Empty Queue...."
    }

    else if(frontOfQueue== rearOfQueue) {
      queue = queue.drop(1)
      frontOfQueue= -1
      rearOfQueue = -1
      "Item is dequeued."
    }
    else{
      queue = queue.drop(1)
      frontOfQueue = frontOfQueue + 1
      "Item is dequeued."
    }
  }
  /* This method will be used to display the elements of the queue in FIFO order */

  def displayQueue(): String = {
    if(frontOfQueue == -1 && rearOfQueue == 1){
      "Empty Queue"
    }
    else {
      val itemsOfQueue = for (item <-queue) yield item
      itemsOfQueue.toString()
    }
  }
  /* The method will return the element at the top position of the queue will be returned. */

  def topElementOfQueue: Any = {
    if(frontOfQueue >= 0){
      queue(frontOfQueue)
    }
    else {
      "Empty Queue"
    }
  }

  /* This method will return the size of the queue.*/

  def size: Int = queue.length


}
