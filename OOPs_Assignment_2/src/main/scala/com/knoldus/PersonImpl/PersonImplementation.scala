//OOPs Assignment-2 by Durgesh Gupta
package com.knoldus.PersonImpl

import com.knoldus.PersonApi.Person
/* In this we have created an object  main class Person Implementation
* in which we have created four object of Person class which we have extended the Ordered Trait
* for comparing two objects of Person.*/

object PersonImplementation extends App {
  val age1 = 24
  val age2 = 25

  //comparing the age if the names are same
  val personOne = new Person("Test", age1)
  val personTwo = new Person("Test", age2)
  print("\npersonOne('Test' , 24) < personTwo('Test' , 25) : "  + (personOne < personTwo) )

  //comparing the length of names if names are not same
  val person1 = new Person("TestAgain", age1)
  val person2 = new Person("Test", age2)
  print("\nperson1('TestAgain' , 24) <= person2('Test' , 25) : " + (person1 <= person2))


}
