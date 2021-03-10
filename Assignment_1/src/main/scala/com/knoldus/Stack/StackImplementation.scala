//Assignment-1 by Durgesh Gupta
package com.knoldus.Stack

import scala.io.StdIn.{readChar, readInt, readLine}
/* In the main function of the object class of StackImplementation we have created a menu based program.
* In this, the methods of StackApi are called according to the choice entered.
* We have taken three inputs 1) toRepeatMenu 2) inputChoice 3) inputItem
*  */

object StackImplementation extends  App {
  print("Press 1 to push the element to the stack \n")
  print("Press 2 to pop the element from the stack \n")
  print("Press 3 to display the stack \n")
  print("Press 4 to check the stack is empty or not \n")
  print("Press 5 to get the top element of the stack \n")
  print("Press 6 to get the size of the stack \n")
  print("######################################################################## \n")
  val stackImplementation = new StackApi()
  var toRepeatMenu = 'y'
  while (toRepeatMenu == 'y' || toRepeatMenu == 'Y' ) {
    print("\n Enter your choice \n")
    val inputChoice: Int = readInt()

    if(inputChoice == 1){
      print("\nEnter the item to be pushed \n")
      val inputItem = readLine()
      print("\n" + stackImplementation.push(inputItem) + "\n")

    }

    else if (inputChoice == 2) {
      print("\n" + stackImplementation.pop() + "\n")
    }

    else if(inputChoice == 3) {
      print("\n The Elements of stack are: \n")
      stackImplementation.displayStack().foreach(print)
    }

    else if(inputChoice == 4) {
      val result = stackImplementation.isEmpty
      if(result) {
        print("Stack is empty")
      }
      else {
        print("Stack is not empty")
      }
    }

    else if(inputChoice == 5){
      print("\n  Top element in the stack is: ")
      print(stackImplementation.topElementOfStack)
    }

    else if(inputChoice == 6) {

      print(stackImplementation.size)

    }
    else{
      print("\n Invalid Input \n")
    }

    print("\n Do you want to continue..... Press Y else Press N \n")
    toRepeatMenu= readChar()
  }


}
