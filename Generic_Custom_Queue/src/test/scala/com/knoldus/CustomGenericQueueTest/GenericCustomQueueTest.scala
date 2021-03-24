//Generic Custom Queue Author - Durgesh Gupta
package com.knoldus.CustomGenericQueueTest

import com.knoldus.CustomGenericQueueApi.GenericCustomQueueApi
import org.scalatest.flatspec.AnyFlatSpec

class GenericCustomQueueTest extends AnyFlatSpec{
  /* Here are writing the unit test cases to test the different methods of generic custom Integer
  * type queue*/
  val customIntQueueTest = new GenericCustomQueueApi[Int]

  "isEmpty method of Int queue " should "be valid for empty queue." in {
    val result = customIntQueueTest.isEmpty(List())
    assert(result == "Empty Queue...")
  }

  "Enqueue method on empty Integer type custom queue " should "be valid " in {
    val intQueueOne = customIntQueueTest.enQueue(List(),0)
    assert(intQueueOne == List(0))
  }

  "Enqueue method on Int type non empty custom generic queue " should " be valid " in {
    val intQueueOne = customIntQueueTest.enQueue(List(0,1,2),3)
    assert(intQueueOne == List(0,1,2,3))
  }

  "Enqueue method " should "be invalid " in {
    val intQueueOne = customIntQueueTest.enQueue(List(0,1,2),3)
    assert(intQueueOne != List(0))

  }

  it should "not dequeue item from an empty Integer custom generic queue" in {
    assertThrows[NoSuchElementException]{
      customIntQueueTest.deQueue(List())
    }
  }

  "Dequeue method of Integer type custom queue " should " be valid " in {
    val intQueueOne = customIntQueueTest.enQueue(List(0,1,2),3)
    val result = customIntQueueTest.deQueue(intQueueOne)
    assert(result == List(1,2,3))
  }

  "Dequeue method of Integer type custom queue " should " be invalid " in {
    val intQueueOne = customIntQueueTest.enQueue(List(0,1,2),3)
    val result = customIntQueueTest.deQueue(intQueueOne)
    assert(result != List(0,1,2,3))
  }


  "isEmpty should for non empty queue" should "be valid" in {
    val intQueueTest = customIntQueueTest.enQueue(List(0,1,2),3)
    val result = customIntQueueTest.isEmpty(intQueueTest)
    assert(result=="Queue is not empty...")
  }


  "Size of queue method of Integer type custom queue" should "be valid for empty queue" in {
    val result = customIntQueueTest.sizeOfQueue(List())
    assert(result == 0)
  }

  "Size of queue method of Integer type custom queue" should "be valid for non-empty queue" in {
    val result = customIntQueueTest.sizeOfQueue(List(0,1,2,3))
    assert(result == 4)
  }

  "Size of queue method of Integer type custom queue" should "be invalid for non-empty queue" in {
    val result = customIntQueueTest.sizeOfQueue(List(0,1,2,3))
    assert(result != 3)
  }

  "topElementOfQueue method " should "be valid for empty Integer custom generic queue" in {
    val result = customIntQueueTest.topElementOfQueue(List())
    assert(result == List())
  }

  "topElementOfQueue method " should "be valid for non empty Integer custom generic queue" in {
    val result = customIntQueueTest.topElementOfQueue(List(0,1,2,3))
    assert(result == List(0))
  }

  "topElementOfQueue method " should "be invalid for non empty Integer custom generic queue" in {
    val result = customIntQueueTest.topElementOfQueue(List(0,1,2,3))
    assert(result != List(1))
  }

  /* Here are writing the unit test cases to test the different methods of generic custom Char
  * type queue*/

  val customCharQueueTest = new GenericCustomQueueApi[Char]

  "isEmpty method of Char type queue " should "be valid for empty queue." in {
    val result = customCharQueueTest.isEmpty(List())
    assert(result == "Empty Queue...")
  }

  "Enqueue method on empty Char type custom queue " should "be valid " in {
    val charQueueOne = customCharQueueTest.enQueue(List(),'D')
    assert(charQueueOne == List('D'))
  }

  "Enqueue method on Char type non empty custom generic queue " should " be valid " in {
    val charQueueOne = customCharQueueTest.enQueue(List('D','u','r','g','e','s'),'h')
    assert(charQueueOne == List('D','u','r','g','e','s','h'))
  }

  "Enqueue method for char type " should "be invalid " in {
    val charQueueOne = customCharQueueTest.enQueue(List('D','u','r','g','e','s'),'h')
    assert(charQueueOne != List('e','s'))

  }

  it should "not dequeue item from an empty Char custom generic queue" in {
    assertThrows[NoSuchElementException]{
      customCharQueueTest.deQueue(List())
    }
  }

  "Dequeue method of Char type custom queue " should " be valid " in {
    val charQueueOne = customCharQueueTest.enQueue(List('D','u','r','g','e','s'),'h')
    val result = customCharQueueTest.deQueue(charQueueOne)
    assert(result == List('u','r','g','e','s','h'))
  }

  "Dequeue method of Char type custom queue " should " be invalid " in {
    val charQueueOne = customCharQueueTest.enQueue(List('D','u','r','g','e','s'),'h')
    val result = customCharQueueTest.deQueue(charQueueOne)
    assert(result != List('D','u','r','g','e','s'))
  }


  "isEmpty should for non empty char type custom queue" should "be valid" in {
    val charQueueOne = customCharQueueTest.enQueue(List('D','u','r','g','e','s'),'h')
    val result = customCharQueueTest.isEmpty(charQueueOne)
    assert(result=="Queue is not empty...")
  }


  "Size of queue method of char type custom queue" should "be valid for empty queue" in {
    val result = customCharQueueTest.sizeOfQueue(List())
    assert(result == 0)
  }

  "Size of queue method of char type custom queue" should "be valid for non-empty queue" in {
    val result = customCharQueueTest.sizeOfQueue(List('D','u','r','g','e','s','h'))
    assert(result == 7)
  }

  "Size of queue method of char type custom queue" should "be invalid for non-empty queue" in {
    val result = customCharQueueTest.sizeOfQueue(List('D','u','r','g','e','s'))
    assert(result != 3)
  }

  "topElementOfQueue method " should "be valid for empty Char custom generic queue" in {
    val result = customCharQueueTest.topElementOfQueue(List())
    assert(result == List())
  }

  "topElementOfQueue method " should "be valid for non empty  Char custom generic queue" in {
    val result = customCharQueueTest.topElementOfQueue(List('D','u','r','g','e','s'))
    assert(result == List('D'))
  }

  "topElementOfQueue method " should "be invalid for non empty Char custom generic queue" in {
    val result = customCharQueueTest.topElementOfQueue(List('D','u','r','g','e','s'))
    assert(result != List('u'))
  }

  /* Here are writing the unit test cases to test the different methods of generic custom Double
  * type queue*/


  val customDoubleQueueTest = new GenericCustomQueueApi[Double]

  "isEmpty method of Double queue " should "be valid for empty queue." in {
    val result = customDoubleQueueTest.isEmpty(List())
    assert(result == "Empty Queue...")
  }

  "Enqueue method on empty Double type custom queue " should "be valid " in {
    val doubleQueueTest = customDoubleQueueTest.enQueue(List(),0.0)
    assert(doubleQueueTest == List(0.0))
  }

  "Enqueue method on Double type non empty custom generic queue " should " be valid " in {
    val doubleQueueTest = customDoubleQueueTest.enQueue(List(0.0,1.1,2.2),3.3)
    assert(doubleQueueTest == List(0.0,1.1,2.2,3.3))
  }

  "Enqueue method for Double type queue " should "be invalid " in {
    val doubleQueueTest = customDoubleQueueTest.enQueue(List(0.0,1.1,2.2),3.3)
    assert(doubleQueueTest != List(1.1))

  }

  it should "not dequeue item from an empty Double custom generic queue" in {
    assertThrows[NoSuchElementException]{
      customDoubleQueueTest.deQueue(List())
    }
  }

  "Dequeue method of Double type custom queue " should " be valid " in {
    val doubleQueueOne = customDoubleQueueTest.enQueue(List(0.0,1.1,2.2),3.3)
    val result = customDoubleQueueTest.deQueue(doubleQueueOne)
    assert(result == List(1.1,2.2,3.3))
  }

  "Dequeue method of Double type custom queue " should " be invalid " in {
    val doubleQueueTest = customDoubleQueueTest.enQueue(List(0.0,1.1,2.2),3.3)
    val result = customDoubleQueueTest.deQueue(doubleQueueTest)
    assert(result != List(0.0,1.1,2.2,3.3))
  }


  "isEmpty should for non empty double type queue" should "be valid" in {
    val doubleQueueTest = customDoubleQueueTest.enQueue(List(0.0,1.1,2.2),3.3)
    val result = customDoubleQueueTest.isEmpty(doubleQueueTest)
    assert(result=="Queue is not empty...")
  }


  "Size of queue method of double type custom queue" should "be valid for empty queue" in {
    val result = customDoubleQueueTest.sizeOfQueue(List())
    assert(result == 0)
  }

  "Size of queue method of double type custom queue" should "be valid for non-empty queue" in {
    val result = customDoubleQueueTest.sizeOfQueue(List(0.0,1.1,2.2,3.3))
    assert(result == 4)
  }

  "Size of queue method of double type custom queue" should "be invalid for non-empty queue" in {
    val result = customDoubleQueueTest.sizeOfQueue(List(0.0,1.1,2.2,3.3))
    assert(result != 3)
  }

  "topElementOfQueue method " should "be valid for empty Double custom generic queue" in {
    val result = customDoubleQueueTest.topElementOfQueue(List())
    assert(result == List())
  }

  "topElementOfQueue method " should "be valid for non empty Double custom generic queue" in {
    val result = customDoubleQueueTest.topElementOfQueue(List(0.0,1.1,2.2,3.3))
    assert(result == List(0.0))
  }

  "topElementOfQueue method " should "be invalid for non empty Double custom generic queue" in {
    val result = customDoubleQueueTest.topElementOfQueue(List(0.0,1.1,2.2,3.3))
    assert(result != List(1.1))
  }


  /* Here are writing the unit test cases to test the different methods of generic custom String
  * type queue
  * */

  val customStringQueueTest = new GenericCustomQueueApi[String]

  "isEmpty method of String type queue " should "be valid for empty queue." in {
    val result = customStringQueueTest.isEmpty(List())
    assert(result == "Empty Queue...")
  }

  "Enqueue method on empty String type custom queue " should "be valid " in {
    val stringQueueTest = customStringQueueTest.enQueue(List(),"Hello")
    assert(stringQueueTest == List("Hello"))
  }

  "Enqueue method on String type non empty custom generic queue " should " be valid " in {
    val stringQueueTest = customStringQueueTest.enQueue(List("Hello","Durgesh"),"Gupta")
    assert(stringQueueTest == List("Hello","Durgesh","Gupta"))
  }

  "Enqueue method for String type queue " should "be invalid " in {
    val stringQueueTest = customStringQueueTest.enQueue(List("Hello","Durgesh"),"Gupta")
    assert(stringQueueTest != List("Gupta"))

  }

  it should "not dequeue item from an empty String custom generic queue" in {
    assertThrows[NoSuchElementException]{
      customStringQueueTest.deQueue(List())
    }
  }

  "Dequeue method of String type custom queue " should " be valid " in {
    val stringQueueTest = customStringQueueTest.enQueue(List("Hello","Durgesh"),"Gupta")
    val result = customStringQueueTest.deQueue(stringQueueTest)
    assert(result == List("Durgesh","Gupta"))
  }

  "Dequeue method of string type custom queue " should " be invalid " in {
    val stringQueueTest = customStringQueueTest.enQueue(List("Hello","Durgesh"),"Gupta")
    val result = customStringQueueTest.deQueue(stringQueueTest)
    assert(result != List("Hello","Durgesh","Gupta"))
  }


  "isEmpty should for non empty string type queue" should "be valid" in {
    val stringQueueTest = customStringQueueTest.enQueue(List("Hello","Durgesh"),"Gupta")
    val result = customStringQueueTest.isEmpty(stringQueueTest)
    assert(result=="Queue is not empty...")
  }


  "Size of queue method of string type custom queue" should "be valid for empty queue" in {
    val result = customStringQueueTest.sizeOfQueue(List())
    assert(result == 0)
  }

  "Size of queue method of string type custom queue" should "be valid for non-empty queue" in {
    val result = customStringQueueTest.sizeOfQueue(List("Hello","Durgesh","Gupta"))
    assert(result == 3)
  }

  "Size of queue method of string type custom queue" should "be invalid for non-empty queue" in {
    val result = customStringQueueTest.sizeOfQueue(List("Hello","Durgesh","Gupta"))
    assert(result != 2)
  }

  "topElementOfQueue method " should "be valid for empty String custom generic queue" in {
    val result = customStringQueueTest.topElementOfQueue(List())
    assert(result == List())
  }

  "topElementOfQueue method " should "be valid for non empty String custom generic queue" in {
    val result = customStringQueueTest.topElementOfQueue(List("Hello","Durgesh","Gupta"))
    assert(result == List("Hello"))
  }

  "topElementOfQueue method " should "be invalid for non empty String custom generic queue" in {
    val result = customStringQueueTest.topElementOfQueue(List("Hello","Durgesh","Gupta"))
    assert(result != List("Durgesh"))
  }

  /* Here are writing the unit test cases to test the different methods of generic custom Float
  * type queue
  * */

  val customFloatQueueTest = new GenericCustomQueueApi[Float]


  "isEmpty method of Float queue " should "be valid for empty queue." in {
    val result = customFloatQueueTest.isEmpty(List())
    assert(result == "Empty Queue...")
  }

  "Enqueue method on empty Float type custom queue " should "be valid " in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(),0.0f)
    assert(floatQueueTest == List(0.0f))
  }

  "Enqueue method on Float type non empty custom generic queue " should " be valid " in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(0.0f,1.1f,2.2f),3.3f)
    assert(floatQueueTest == List(0.0f,1.1f,2.2f,3.3f))
  }

  "Enqueue method for Float type queue " should "be invalid " in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(0.0f,1.1f,2.2f),3.3f)
    assert(floatQueueTest != List(1.1f))

  }

  it should "not dequeue item from an empty Float custom generic queue" in {
    assertThrows[NoSuchElementException]{
      customFloatQueueTest.deQueue(List())
    }
  }

  "Dequeue method of Float type custom queue " should " be valid " in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(0.0f,1.1f,2.2f),3.3f)
    val result = customFloatQueueTest.deQueue(floatQueueTest)
    assert(result == List(1.1f,2.2f,3.3f))
  }

  "Dequeue method of Float type custom queue " should " be invalid " in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(0.0f,1.1f,2.2f),3.3f)
    val result = customFloatQueueTest.deQueue(floatQueueTest)
    assert(result != List(0.0f,1.1f,2.2f,3.3f))
  }


  "isEmpty should for non empty float type queue" should "be valid" in {
    val floatQueueTest = customFloatQueueTest.enQueue(List(0.0f,1.1f,2.2f),3.3f)
    val result = customFloatQueueTest.isEmpty(floatQueueTest)
    assert(result=="Queue is not empty...")
  }


  "Size of queue method of float type custom queue" should "be valid for empty queue" in {
    val result = customFloatQueueTest.sizeOfQueue(List())
    assert(result == 0)
  }

  "Size of queue method of Float type custom queue" should "be valid for non-empty queue" in {
    val result = customFloatQueueTest.sizeOfQueue(List(0.0f,1.1f,2.2f,3.3f))
    assert(result == 4)
  }

  "Size of queue method of Float type custom queue" should "be invalid for non-empty queue" in {
    val result = customFloatQueueTest.sizeOfQueue(List(0.0f,1.1f,2.2f,3.3f))
    assert(result != 3)
  }

  "topElementOfQueue method " should "be valid for empty float custom generic queue" in {
    val result = customFloatQueueTest.topElementOfQueue(List())
    assert(result == List())
  }

  "topElementOfQueue method " should "be valid for non empty float custom generic queue" in {
    val result = customFloatQueueTest.topElementOfQueue(List(0.0f,1.1f,2.2f,3.3f))
    assert(result == List(0.0f))
  }

  "topElementOfQueue method " should "be invalid for non empty float custom generic queue" in {
    val result = customFloatQueueTest.topElementOfQueue(List(0.0f,1.1f,2.2f,3.3f))
    assert(result != List(1.1f))
  }






}
