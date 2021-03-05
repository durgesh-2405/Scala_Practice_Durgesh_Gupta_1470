//Reverse of String by Durgesh Gupta
package com.knoldus


import org.scalatest.flatspec.AnyFlatSpec

/*  Here I have written the Unit Test Cases to test the Revesre method */

class TestReverse extends AnyFlatSpec{

  val reverseOfString= new ReverseApi()

  "The reverse will be valid " should "be valid for empty string " in {
    val resultString= reverseOfString.reverseOfString("")
    assert(resultString== "")
  }

  "The reverse of Durgesh " should "be valid for hsegruD" in {
    val resultString= reverseOfString.reverseOfString("Durgesh")
    assert(resultString== "hsegruD")
  }

  "The reverse of D " should "be valid for D" in {
    val resultString= reverseOfString.reverseOfString("D")
    assert(resultString== "D")
  }


  "The reverse of 0123456 " should "be valid for 6543210" in {
    val resultString= reverseOfString.reverseOfString("0123456")
    assert(resultString== "6543210")
  }

  "The reverse of Date is 03/03/2021 " should "be valid for 1202/30/30 si etaD " in {
    val resultString= reverseOfString.reverseOfString("Date is 03/03/2021")
    assert(resultString== "1202/30/30 si etaD")
  }

  "The reverse of special characters !@#$%^&* " should "be valid for *&^%$#@!" in {
    val resultString= reverseOfString.reverseOfString("!@#$%^&*")
    assert(resultString== "*&^%$#@!")
  }

  "The reverse of 03/03/2021 " should "be valid for 1202/30/30" in {
    val resultString= reverseOfString.reverseOfString("03/03/2021")
    assert(resultString== "1202/30/30")
  }

  "The reverse of Test " should "invalid for Test" in {
    val resultString= reverseOfString.reverseOfString("Test")
    assert(resultString!= "Test")
  }



}
