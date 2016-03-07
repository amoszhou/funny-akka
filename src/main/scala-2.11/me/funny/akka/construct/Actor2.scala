package me.funny.akka.construct

import akka.actor.Actor
import akka.event.Logging

/**
  * Created by amos.zhou on 2016/3/4.
  */
class Actor2(name: String) extends Actor {
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case "test" => log.info(s"$name received test")
    case _ => log.info(s"$name received unknown msg")
  }
}
