//OOPs Assignment-2 by Durgesh Gupta
package com.knoldus.PersonApi

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that : Person): Int = {
    if(this.name == that.name){
      if(this.age < that.age){
        this.age - that.age
      }
      else{
        that.age - this.age
      }
    }
    else{
      if(this.name.length < that.name.length){
        this.name.length - that.name.length
      }
      else{
        this.name.length - that.name.length
      }
    }
  }


}
