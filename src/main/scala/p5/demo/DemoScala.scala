package p5.demo

import p5.facade.p5Global._
import p5.typesafe.P5App

object DemoScala extends P5App {

  def setup = {
    // create a 400x400 black canvas
    createCanvas(400, 400)
    background(0)
    noStroke()
  }

  def draw = {
    // if the mouse is pressed,
    // draw a white circle at the x,y coordinates of the mouse
    if (mouseIsPressed) {
      println(mouseX)
      println(mouseY)
      ellipse(mouseX, mouseY, 20, 20)
    }
  }

}




