//OOPs Assignment-1 by Durgesh Gupta
package com.knoldus

trait QueueTrait {
  var queue: List[Double] = List.empty
  var frontOfQueue: Int = -1
  var rearOfQueue: Int= -1

  /* This method is defined to enqueue the  item to the queue in FIFO Order
  *  The item will be enqueued at last of the list and the value of the front and rear will be
  * increased by one.*/

  def enqueue(item: Double): String = {
    if(rearOfQueue == -1 && frontOfQueue == -1){
      frontOfQueue= frontOfQueue + 1
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item)
      "Item enqueued.."
    }
    else{
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item)
      "Item enqueued.."

    }

  }

  /* This method is defined to dequeue the  item to the queue in FIFO Order
  * The item will be dequeued at last of the list and the value of the front and rear will be
  * decreased by one.*/

  def dequeue: Any = {
    if(frontOfQueue == -1 && rearOfQueue == -1){
      "Empty Queue..."
    }
    else if(frontOfQueue == rearOfQueue){
      queue = queue.drop(1)
      frontOfQueue = -1
      rearOfQueue = -1
      "Item dequeued.."
    }
    else{
      queue = queue.drop(1)
      frontOfQueue = frontOfQueue + 1
      "Item dequeued.."
    }
  }

  def getQueue: List[Double] = {
    queue
  }
}
