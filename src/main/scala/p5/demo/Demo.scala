package p5.demo

import p5.facade.p5Global._

import scala.scalajs.js.JSApp

object Demo extends JSApp  {


  def main(): Unit = {

    // create a 400x400 black canvas
    setup = () => {
      createCanvas(400, 400)
      background(0)
      noStroke()
    }

    // if the mouse is pressed,
    // draw a white circle at the x,y coordinates of the mouse
    draw = () => {
      if(mouseIsPressed) {
        println(mouseX)
        println(mouseY)
        ellipse(mouseX, mouseY, 20, 20)
      }

      ()
    }

    ()
  }
}

