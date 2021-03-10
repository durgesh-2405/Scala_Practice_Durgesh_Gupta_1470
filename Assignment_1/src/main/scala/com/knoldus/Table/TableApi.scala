//Assignment-1 by Durgesh Gupta

package com.knoldus.Table
/* In this class TableApi we have defined a method to find the table of given elements of input list.
* */


class TableApi {
  def createTable(inputlist: List[Int]): Map[Int, List[Int]]  = {
    val listOfTable = for (elementOFList <- inputlist) yield {
      val elementsOfTable = for (tableIteration <- 1 to 10) yield
        elementOFList * tableIteration
      elementsOfTable.toList
    }
    val tableList = (inputlist zip listOfTable).toMap
    tableList
  }
}
