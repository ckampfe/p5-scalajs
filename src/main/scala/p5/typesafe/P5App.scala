package p5.typesafe

import p5.facade.p5Global

import scala.scalajs.js.JSApp

/**
  * Created by fred on 23/10/2016.
  */


trait P5App extends JSApp {

  def main(): Unit = {

    p5Global.setup = () => {
      setup
      ()
    }
    p5Global.draw = () => {
      draw
      ()
    }


  }

  def setup: Any

  def draw: Any


}
