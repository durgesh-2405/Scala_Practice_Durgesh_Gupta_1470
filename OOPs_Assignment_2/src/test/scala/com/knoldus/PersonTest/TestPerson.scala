//OOPs Assignment-2 by Durgesh Gupta
package com.knoldus.PersonTest

import com.knoldus.PersonApi.Person
import org.scalatest.flatspec.AnyFlatSpec

/* Here we are defining the unit test cases to test the Person class
* which extended the Ordered Trait to compare the two objects of the person.
* */

class TestPerson extends AnyFlatSpec{


  "The comparison" should "be valid when both Person's name are same but Person1 age is greater than Person2 age" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne > personTwo
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  "The comparison" should "not be valid when both Person's name are same but Person1's age is greater than Person2 age" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne > personTwo
    val expectedResult = true
    assert(actualResult != expectedResult)
  }


  "The comparison" should "be valid when both Person's name are same but Person1's age is smaller than Person2  age" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne < personTwo
    val expectedResult = true
    assert(actualResult === expectedResult)
  }


  "The comparison" should "not be valid when both Person's name are same but Person1's age is smaller than Person2 age" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne < personTwo
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  "The comparison" should "be valid when both Person's name are of different length and length of Person1's name is greater than Person2 " in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne >= personTwo
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The comparison" should "not be valid when both Person's name are of different length and length of Person1's name is greater than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne >= personTwo
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  "The comparison" should "be valid when both Person's name are of different length, Person1's name is smaller than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne <= personTwo
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  "The comparison" should "not be valid when both Person's name are of different length, Person1's name is smaller than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne <= personTwo
    val expectedResult = true
    assert(actualResult != expectedResult)
  }


}
