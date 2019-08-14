package com.github.lknny.test.apply

/**
  *
  *
  *
  * Created by ${ lknny@163.com } on 2019/8/14.
  */
class Person(s:String){
  private var name=s

  def printName:Unit={
    print(name)
  }
}



object Person {
  def apply(name:String):Person={
    new Person(name)
  }

}

object test{
  def main(args: Array[String]): Unit = {
    var person=Person("liukun")
    person.printName
  }
}
