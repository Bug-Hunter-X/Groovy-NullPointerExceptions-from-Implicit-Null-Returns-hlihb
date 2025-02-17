```groovy
def myMethod(param) {
  if (param == null) {
    return "" // Return an empty string instead of null 
  }
  // ...rest of your method
}

def anotherMethod(){
  def result = myMethod(null)
  println result.toUpperCase() //Works fine now
}

//Alternative Solution using the Elvis Operator
def myMethodElvis(param) {
  param ?: "" //Return empty string if param is null, else return param 
}

def anotherMethodElvis(){
  def result = myMethodElvis(null)
  println result.toUpperCase() //Works fine now
}
```