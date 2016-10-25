package demo

import p5.p5Global._
import p5.typesafe.P5App


case class DemoState(i: Double)

object DemoScala extends P5App[DemoState] {

  def setup(s: DemoState) = {
    // create a 400x400 black canvas
    createCanvas(400, 400)
    background(0)
    noStroke()
  }

  def draw(s: DemoState) = {
    // if the mouse is pressed,
    // draw a white circle at the x,y coordinates of the mouse
    if (mouseIsPressed) {
      println(s)
      ellipse(mouseX, mouseY, 20 + s.i, 20 + s.i)
      updateState(s.copy(i = s.i + 1))
    }

  }

  def initState: DemoState = DemoState(0)

}




