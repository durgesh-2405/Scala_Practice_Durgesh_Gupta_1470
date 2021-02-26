//Calculator
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec{
  val number_1=20
  val number_2=30
  val number_3=40
  val number_4=5
  val number_5=2

  "The addition of 20 and 30" should "give 50" in {
    val sum = new Calculator()
    val result= sum.addition(number_1,number_2)
    assert(result==50)
  }

  "The subtraction of 20 and 30" should "give -30" in {
    val sub = new Calculator()
    val result= sub.subtraction(number_1,number_2)
    assert(result== -10)
  }

  "The multiplication of 20 and 5" should "give 100" in {
    val mul = new Calculator()
    val result= mul.multiplication(number_1,number_4)
    assert(result==100)
  }
  "The division of 20 and 5" should "give 4" in {
    val div = new Calculator()
    val result= div.division(number_1,number_4)
    assert(result== 4)
  }
  "5 raise to power 2" should "give 25" in {
    val pow = new Calculator()
    val result= pow.power(number_4,number_5)
    assert(result==25)
  }
  "Absolute value of 20" should "give 20" in {
    val abs = new Calculator()
    val result= abs.absolute(number_1)
    assert(result==20)
  }

  "The modulus of 30 and 20" should "give 10" in {
    val mod = new Calculator()
    val result= mod.modulus(number_2,number_1)
    assert(result==10)
  }

  "The Maximum of 40 and 30" should "give 40" in {
    val max = new Calculator()
    val result= max.maximum(number_3,number_2)
    assert(result==40)
  }
  "The Minimum of 5 and 2" should "give 2" in {
    val min = new Calculator()
    val result= min.minimum(number_4,number_5)
    assert(result==2)
  }

}
