//Assignment-1 by Durgesh Gupta
package com.knoldus.TableTest

import com.knoldus.Table.TableApi
import org.scalatest.flatspec.AnyFlatSpec

/* In this class TableTest extending the AnyFlatSpec.
* We have defined unit test cases to test the method of createTable of TableApi class
* */

class TableTest extends AnyFlatSpec{

  val one = 1
  val two = 2
  val three = 3
  val four = 4
  val five = 5
  val six = 6
  val seven = 7
  val eight = 8
  val nine = 9
  val ten = 10
  val twelve = 12
  val fourteen = 14
  val sixteen = 16
  val eighteen = 18
  val twenty =  20
  val table_1= List(one,two,three,four,five, six,seven,eight,nine,ten)
  val table_2= List(two,four,six,eight,ten,twelve,fourteen,sixteen,eighteen,twenty)

  val tableImplementationTest = new TableApi()
  /* Unit test cases are defined to test the output table returned by createTable method of TableApi */
  "The table of [1] " should "be valid " in {
    val expectedTable = tableImplementationTest.createTable(inputlist = List(one))
    assert(expectedTable == Map(one -> table_1)
    )
  }

  "The table of [1,2] " should "be valid " in {
    val expectedTable = tableImplementationTest.createTable(inputlist = List(one,two))
    assert(expectedTable == Map(one -> table_1, two -> table_2)
    )
  }

  "The table of [1,2] " should "be invalid " in {
    val expectedTable = tableImplementationTest.createTable(inputlist = List(one,two))
    assert(expectedTable != Map(one -> table_2, two -> table_1)
    )
  }

}
