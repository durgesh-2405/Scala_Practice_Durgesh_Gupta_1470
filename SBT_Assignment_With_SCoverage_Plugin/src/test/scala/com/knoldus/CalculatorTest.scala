//Calculator
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec{
  val number_1=20
  val number_2=30
  val number_3=40
  val number_4=5
  val number_5=2
  val number_6 = 10
  val negative_number_1: Int = -10
  val negative_number_2: Int = -20
  val negative_number_3: Int = -30
  val negative_number_4: Int = -40
  val negative_number_5: Int = -5
  val negative_number_6: Int = -2
  val negative_number_7: Int = -100
  val negative_number_8: Int = -4

  /* Here we are writing the unit cases to test the addition method defined in the
  * Calculator class*/

  "The addition of 20 and 30" should "give 50" in {
    val sum = new Calculator()
    val result= sum.addition(number_1,number_2)
    assert(result==50)
  }


  "The addition of -10 and -20" should "be valid and give -30" in {
    val sum = new Calculator()
    val result = sum.addition(negative_number_1,negative_number_2)
    assert(result== negative_number_3)
  }
  "The addition of -30 and 20" should "be valid and give -10" in {
    val sum = new Calculator()
    val result = sum.addition(negative_number_3,number_1)
    assert(result== negative_number_1)
  }
  "The addition of 20 and -10 " should "be valid give 10" in {
    val sum = new Calculator()
    val result = sum.addition(number_1,negative_number_1)
    assert(result== number_6)
  }
  "The addition " should "be invalid" in {
    val sum = new Calculator()
    val result = sum.addition(negative_number_3, number_1)
    assert(result != number_6)
  }

  /* Here we are writing the unit cases to test the subtraction method defined in the
 * Calculator class*/

  "The subtraction of 20 and 30" should "be valid and give -30" in {
    val sub = new Calculator()
    val result= sub.subtraction(number_1,number_2)
    assert(result== negative_number_1)
  }

  "The subtraction of -30 and -10 " should "be valid and give -20" in {
    val sub = new Calculator()
    val result= sub.subtraction(negative_number_3,negative_number_1)
    assert(result== negative_number_2)
  }

  "The subtraction of -30 and 10 " should "be valid and give -40" in {
    val sub = new Calculator()
    val result= sub.subtraction(negative_number_3,number_6)
    assert(result== negative_number_4)
  }

  "The subtraction of 20 and -10 " should "be valid and give 30" in {
    val sub = new Calculator()
    val result= sub.subtraction(number_1,negative_number_1)
    assert(result== number_2)
  }

  "The subtraction of 20 and -10 " should "be not valid" in {
    val sub = new Calculator()
    val result= sub.subtraction(number_1,negative_number_1)
    assert(result!= negative_number_3)
  }
  /* Here we are writing the unit cases to test the multiplication method defined in the
* Calculator class*/

  "The multiplication of 20 and 5" should "give 100" in {
    val mul = new Calculator()
    val result= mul.multiplication(number_1,number_4)
    assert(result==100)
  }

  "The multiplication of -20 and 5" should "give -100" in {
    val mul = new Calculator()
    val result= mul.multiplication(negative_number_2,number_4)
    assert(result== negative_number_7)
  }
  "The multiplication of 5 and -20" should "give -100" in {
    val mul = new Calculator()
    val result= mul.multiplication(number_4,negative_number_2)
    assert(result== negative_number_7)
  }

  "The multiplication" should "be invalid" in {
    val mul = new Calculator()
    val result= mul.multiplication(number_4,negative_number_2)
    assert(result!=100)
  }

  /* Here we are writing the unit cases to test the division method defined in the
* Calculator class*/

  "The division of 20 and 5" should "be valid and give 4" in {
    val div = new Calculator()
    val result= div.division(number_1,number_4)
    assert(result== 4)
  }

  "The division of -20 and -5" should "be valid and give 4" in {
    val div = new Calculator()
    val result= div.division(negative_number_2, negative_number_5)
    assert(result== 4)
  }

  "The division of -20 and 5" should "be valid and give -4" in {
    val div = new Calculator()
    val result= div.division(negative_number_2, number_4)
    assert(result== negative_number_8)
  }

  "The division of 20 and -5" should "be valid and give -4" in {
    val div = new Calculator()
    val result= div.division(number_1, negative_number_5)
    assert(result== negative_number_8)
  }

  "The division of 0 and 20" should "be valid give 0" in {
    val div = new Calculator()
    val result= div.division(0,number_1)
    assert(result== 0)
  }
  "The division of -20 and -5" should "be invalid" in {
    val div = new Calculator()
    val result= div.division(negative_number_2, negative_number_5)
    assert(result!= negative_number_8)
  }

  /* Here we are writing the unit cases to test the both methods to calculate power
  defined in the Calculator class*/

  "5 raise to power 2" should "give 25" in {
    val pow = new Calculator()
    val result= pow.power(number_4,number_5)
    assert(result==25)
  }

  "-5 raise to power -2" should " be valid" in {
    val pow = new Calculator()
    val result= pow.powerForNegativeValues(negative_number_5, negative_number_6)
    assert(result== 0.04)
  }

  "-5 raise to power 2" should " be valid" in {
    val pow = new Calculator()
    val result= pow.power(negative_number_5, number_5)
    assert(result== 25)
  }
  "5 raise to power -2" should " be valid" in {
    val pow = new Calculator()
    val result= pow.powerForNegativeValues(number_4, negative_number_6)
    assert(result== 0.04)
  }

  "5 raise to power -2" should " be invalid" in {
    val pow = new Calculator()
    val result= pow.powerForNegativeValues(number_4, negative_number_6)
    assert(result!= -0.04)
  }

  /* Here we are writing the unit cases to test the Absolute method defined
  in the Calculator class*/

  "Absolute value of 20" should "give 20" in {
    val abs = new Calculator()
    val result= abs.absolute(number_1)
    assert(result==20)
  }

  "Absolute value of -20" should "be valid " in {
    val abs = new Calculator()
    val result= abs.absolute(negative_number_2)
    assert(result==20)
  }

  "Absolute value of -20" should "be invalid " in {
    val abs = new Calculator()
    val result= abs.absolute(negative_number_2)
    assert(result!= negative_number_2)
  }
  /* Here we are writing the unit cases to test the modulus method
  defined in the Calculator class*/

  "The modulus of 30 and 20" should "be valid and give 10" in {
    val mod = new Calculator()
    val result= mod.modulus(number_2,number_1)
    assert(result==10)
  }

  "The modulus of -30 and -20" should "be valid and give -10" in {
    val mod = new Calculator()
    val result= mod.modulus(negative_number_3, negative_number_2)
    assert(result== negative_number_1)
  }
  "The modulus of -30 and 20" should "be valid and give -10" in {
    val mod = new Calculator()
    val result= mod.modulus(negative_number_3,number_1)
    assert(result== negative_number_1)
  }

  "The modulus of 30 and -20" should "be valid and give 10" in {
    val mod = new Calculator()
    val result= mod.modulus(number_2,negative_number_2)
    assert(result==10)
  }

  "The modulus of 0 and 20" should "be invalid and give 0 " in {
    val mod = new Calculator()
    val result= mod.modulus(0,number_1)
    assert(result==0)
  }
  "The modulus of 20 and -30" should "be invalid" in {
    val mod = new Calculator()
    val result= mod.modulus(number_1,negative_number_3)
    assert(result!=10)
  }
  /* Here we are writing the unit cases to test the Maximum method
  defined in the Calculator class*/

  "The Maximum of 40 and 30" should "be valid" in {
    val max = new Calculator()
    val result= max.maximum(number_3,number_2)
    assert(result==40)
  }
  "The Maximum of -30 and -20" should "be valid " in {
    val max = new Calculator()
    val result= max.maximum(negative_number_3,negative_number_2)
    assert(result== negative_number_2)
  }

  "The Maximum of 30 and -20" should "be valid " in {
    val max = new Calculator()
    val result= max.maximum(number_2,negative_number_2)
    assert(result== number_2)
  }
  "The Maximum of -30 and 20" should "be valid " in {
    val max = new Calculator()
    val result= max.maximum(negative_number_3,number_1)
    assert(result== number_1)
  }

  "The Maximum of -30 and 20" should "be invalid " in {
    val max = new Calculator()
    val result= max.maximum(negative_number_3,number_1)
    assert(result!= negative_number_3)
  }

  /* Here we are writing the unit cases to test the minimum method
  defined in the Calculator class*/

  "The Minimum of 5 and 2" should "give 2" in {
    val min = new Calculator()
    val result= min.minimum(number_4,number_5)
    assert(result==2)
  }

  "The Minimum of -30 and -20" should "be valid " in {
    val min = new Calculator()
    val result= min.minimum(negative_number_3,negative_number_2)
    assert(result== negative_number_3)
  }

  "The Minimum of 30 and -20" should "be valid " in {
    val min = new Calculator()
    val result= min.minimum(number_2,negative_number_2)
    assert(result== negative_number_2)
  }
  "The Minimum of -30 and 20" should "be valid " in {
    val min = new Calculator()
    val result= min.minimum(negative_number_3,number_1)
    assert(result== negative_number_3)
  }

  "The Minimum of -30 and 20" should "be invalid " in {
    val min = new Calculator()
    val result= min.minimum(negative_number_3,number_1)
    assert(result!= number_1)
  }

}
