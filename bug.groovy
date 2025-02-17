```groovy
def myMethod(param) {
  if (param == null) {
    return null // This will cause issues with certain method calls
  }
  // ...rest of your method
}

// Example of issue
def anotherMethod(){
  def result = myMethod(null)
  println result.toUpperCase() //NullPointerException if result is null
}
```