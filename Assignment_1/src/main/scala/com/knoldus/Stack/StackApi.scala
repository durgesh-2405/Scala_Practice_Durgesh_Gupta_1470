//Assignment-1 by Durgesh Gupta
package com.knoldus.Stack

/* In this class StackApi we have created different methods to perform various operation on stack using list. */

class StackApi {
  var stack: List[Any] = List.empty
  var topOfStack: Int = -1
/* This method is defined to check the stack is empty or not.
* If the stack is empty then this will return true otherwise it will return false.
* */
  def isEmpty: Boolean = {
    if(topOfStack == -1) {
      true
    }
    else {
      false
    }
  }
  /* This method is defined to push the item to the stack in the LIFO order.
  * The element will pushed at the last of the list and the  value of the top will be increased by one. */
  def push(item: Any ): String = {
    topOfStack = topOfStack + 1
    stack = stack ::: List(item)
    "Item is pushed"
  }
  /* This method is defined to pop the item from the stack in the LIFO order.
 * The last element of the list will be popped and the be value of the top will be decreased by one. */
  def pop(): String = {
    if(topOfStack == -1){
      "Underflow condition"
    }
    else{
      stack = stack.dropRight(1)
      topOfStack= topOfStack-1
      "Item at top is popped."
    }
  }
  /* This method will be used to display the elements of the stack in LIFO order */

  def displayStack(): String = {
    if(topOfStack == -1){
      "Empty Stack"
    }
    else {
      val itemsOfStack = for (item <-stack) yield item
      itemsOfStack.reverse.toString()
    }
  }
  /* The method will return the element at the top position of the stack will be returned. */

  def topElementOfStack: Any = {
    if(topOfStack >= 0){
      stack(topOfStack)
    }
    else {
      "Empty Stack"
    }
  }

  /* The method will return the length of the stack */
  def size: Int = stack.length

}
