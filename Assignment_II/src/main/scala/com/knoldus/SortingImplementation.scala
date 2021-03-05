//Sorting of List by Durgesh Gupta
package com.knoldus
import scala.io.StdIn.readInt
import scala.collection.immutable.List

/* Here we are creating implementation of the quicksort method*/

object SortingImplementation extends App {
  try {
    print("Enter the number of elements in the array")
    val sizeOfArray: Int = readInt()
    print("Enter " + sizeOfArray + " elements: \n")
    val inputArray = List.fill(sizeOfArray) {
      readInt()
    }

    print("List before sorting: " + inputArray)

    if (inputArray.isEmpty) {
      print("Array is Empty")
    }
    else if (inputArray.length == 1) {
      print("Array after sorting: " + inputArray)

    }
    else{
      val sortingApi= new SortingApi()
      print("Array after sorting: " + sortingApi.quickSort(inputArray))
    }

  }
  catch {
    case _: NumberFormatException => print("Enter a valid Input")
  }

}

