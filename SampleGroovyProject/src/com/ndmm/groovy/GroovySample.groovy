package com.ndmm.groovy

class GroovySample {
def foo(str)
{
  //if (str != null) { return str.reverse() }
  str?.reverse()
}

}
