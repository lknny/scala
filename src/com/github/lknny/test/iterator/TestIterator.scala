package com.github.lknny.test.iterator

/**
  *
  *
  *
  * Created by ${ lknny@163.com } on 2019/8/9.
  */
object TestIterator {

  def main(args: Array[String]): Unit = {

    var ita = Iterator(1, 2, 3, 4, 5)
    while (ita.hasNext) {
      print(ita.next()+",")
    }
    println()
  }
}
