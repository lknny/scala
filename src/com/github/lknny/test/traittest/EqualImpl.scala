package com.github.lknny.test.traittest

/**
  *
  *
  *
  * Created by ${ lknny@163.com } on 2019/8/9.
  */
class EqualImpl extends Equal{
  override def isEqual(x: Any):Boolean= {
    if (x.isInstanceOf[Int]) {
      return x == 0
    }
    return false
  }

}

