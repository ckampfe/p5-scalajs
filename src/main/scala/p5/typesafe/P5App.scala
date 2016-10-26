package p5.typesafe

import p5.p5Global

import scala.scalajs.js.JSApp

/**
  * Created by fred on 23/10/2016.
  */
trait State

trait P5App[E] extends JSApp {

  private var local_state: E = initState

  def main(): Unit = {

    p5Global.setup = () => {
      setup(local_state)
      ()
    }
    p5Global.draw = () => {
      draw(local_state)
      ()
    }

  }

  def initState: E

  def setup(state: E): Any

  def draw(state: E): Any

  def updateState(s: E): E = {
    local_state = s
    s
  }

  def state = local_state

}
