//OOPs Assignment-1 by Durgesh Gupta
//import com.knoldus.QueueTrait.QueueTrait
import com.knoldus.QueueTrait
package com.knoldus.DoubleQueue{



  class DoubleQueueApi extends QueueTrait{

    /* Overriding the enqueue method of Queue Trait to add the double of the
    element to the queue.
     */
    override def enqueue(item: Double): String = {
      if(rearOfQueue == -1 && frontOfQueue == -1){
        frontOfQueue= frontOfQueue + 1
        rearOfQueue = rearOfQueue + 1
        queue = queue ::: List(2*item)
        "Item enqueued.."
      }
      else{
        rearOfQueue = rearOfQueue + 1
        queue = queue ::: List(2*item)
        "Item enqueued.."

      }
    }

  }

}

package com.knoldus.SquareQueue{



  class SquareQueueApi extends QueueTrait{

    /* Overriding the enqueue method of Queue Trait to add the square of the
    element to the queue.
    */
    override def enqueue(item: Double): String = {
      if(rearOfQueue == -1 && frontOfQueue == -1){
        frontOfQueue= frontOfQueue + 1
        rearOfQueue = rearOfQueue + 1
        queue = queue ::: List(item * item)
        "Item enqueued.."
      }
      else{
        rearOfQueue = rearOfQueue + 1
        queue = queue ::: List(item * item)
        "Item enqueued.."

      }
    }

  }

}
