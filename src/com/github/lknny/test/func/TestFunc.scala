package com.github.lknny.test.func

/**
  *
  *
  *
  * Created by ${ lknny@163.com } on 2019/8/9.
  */
object TestFunc {

  class Add{
    //方法，只能定义在class内部
    def add(x:Int)=x+3
  }



  def main(args: Array[String]): Unit = {
    //函数，实际就是继承了Trait的类的对象
    var f=(x:Int)=>x+3
    println(f(3))
    println(new Add().add(3))

  }
}
