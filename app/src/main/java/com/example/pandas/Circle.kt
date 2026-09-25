package com.example.pandas

class Circle(x:Int, y: Int, private val circumference:Int) : Shape(x = x, y=y){

 fun circleInfo(){
  println("Coordinates of the circle are, x = $x, y= $y, and the circumference = $circumference")

 }

}