package com.github.lknny.test.loop

import scala.util.control.Breaks._

/**
  *
  *
  *
  * Created by ${ lknny@163.com } on 2019/8/9.
  */
object TestFor {

  def main(args: Array[String]): Unit = {

    //1-10
    var a = 0
    breakable {
      for (a <- 1 to 10) {
        if (a == 10) {
          println(a)
          break
        }
        print(a + ",")
      }
    }


    //print 1-10
    for (a <- 1 to 10) {
      print(a + ",")
    }
    println()


    //print 1-10
    for (a <- 1 until 11) {
      print(a + ",")
    }
    println()


    //打印list集合
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (a <- list) {
      print(a + ",")
    }
    println()

    //带有if条件的for
    for (a <- list if a != 2; if a != 3) {
      print(a + ",")
    }
    println()

    //yield将for循环返回值存储到变量,注意是花括号
    var b = for {a <- list if a != 7} yield a
    for (a <- b) {
      print(a + ",")
    }
    println()

    //打印1-10
    var c=0
    do{
      c+=1
      print(c+",")
    } while(c<11)

  }

}
