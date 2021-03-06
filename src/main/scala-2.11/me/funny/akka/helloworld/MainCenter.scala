package me.funny.akka.helloworld

import akka.actor.{Props, Actor}

/**
  * Created by amos.zhou on 2016/3/3.
  */
class MainCenter extends Actor {

  override def preStart(): Unit = {
    // create the greeter actor
    val greeter = context.actorOf(Props[Greeter], "greeter")
    // tell it to perform the greeting
    greeter ! Greeter.Greet
  }

  override def receive: Receive = {
    case Greeter.Done => context.stop(self)
  }
}
