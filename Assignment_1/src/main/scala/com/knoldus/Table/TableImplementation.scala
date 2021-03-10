//Assignment-1 by Durgesh Gupta
package com.knoldus.Table

import scala.io.StdIn.readInt

/* In the main function of Object class TableImplementation.
* We have taken two input 1) size of the list. 2) The elements of the list
* After that we have created an object of TableApi and called the method createTable.
* The method will return a map output key as the element of the list and value as the list containing
* the list of table of the corresponding key.*/

object TableImplementation extends App {
  print("Enter the number of elements in the list: ")
  val sizeoflist = readInt()
  val inputlist: List[Int]= List.fill(sizeoflist){
    readInt()
  }
  val tableApi= new TableApi()
  val result = tableApi.createTable(inputlist)
  for((key,value)<- result){
    print("Printing table of: " + key + "\n")
    for (elemetsOfTable <- value){
      print(elemetsOfTable + "\n")
    }
    print("")
  }
  print(result)

}
