package com.example.pandas

class Circle(x:Int, y: Int, private val circumference:Int, color: String) : Shape(x = x, y=y, color){

 fun circleInfo(){
  println("Coordinates of the circle are, x = $x, y= $y, and the circumference = $circumference, and the color is $color")

 }

}