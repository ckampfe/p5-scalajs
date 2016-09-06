package p5_scalajs.demo

import p5_scalajs.p5._

import scala.scalajs.js.JSApp

object Demo extends JSApp {
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

