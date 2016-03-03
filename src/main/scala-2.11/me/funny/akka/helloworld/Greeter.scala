package me.funny.akka.helloworld

import akka.actor.Actor

/**
  * Created by amos.zhou on 2016/3/3.
  */
class Greeter extends Actor {
  override def receive: Receive = {
    case Greeter.Greet =>
      println("Hello world")
      sender() ! Greeter.Done
    case _ => println("unknown message")
  }
}

object Greeter {

  case object Greet

  case object Done

}