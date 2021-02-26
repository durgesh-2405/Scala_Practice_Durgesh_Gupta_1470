//Calculator
package com.knoldus

class Calculator {
  def addition(addend1:Int, addend2:Int):Int = addend1 + addend2

  def subtraction(minuend:Int, subtrahend:Int):Int = minuend - subtrahend

  def multiplication(multiplier:Int, multiplicand:Int):Long = multiplier * multiplicand

  //This method is for Division if the denominator/divisor is zero it will print the message and also return the value zero
  def division(dividend:Int , divisor:Int):Double = {
    var result = 0
    if(divisor != 0){
      result = dividend/divisor
    }
    else{
      print("Divisor can't be zero")
    }
    result
  }


  //In this method there is a loop through which the the value multiply itself until the loop's iteration does npt equal to power
  def power(value:Int , power:Int):Long = {
    var result = 1
    var temporary_variable = power
    while(temporary_variable > 0){
      result = result*value
      temporary_variable = temporary_variable - 1
    }
    result
  }

  //It will return always positive value.
  def absolute(value: Int):Int = Math.abs(value)

  // Method to return modulus of two numbers

  def modulus(number_1: Int , number_2: Int): Int = number_1 % number_2

  //Return maximum value from the given two
  def maximum(number_1:Int,number_2:Int):Int={
    var result = 0

    if(number_1 > number_2){
      result = number_1
    }
    else{
      result = number_2
    }

    result
  }



  //Return minimum value from the given two
  def minimum(number_1:Int,number_2:Int):Int={
    var result = 0

    if(number_1 < number_2){
      result = number_1
    }
    else{
      result = number_2
    }

    result
  }

}
