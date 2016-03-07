package me.funny.akka.Swap

import akka.actor.Actor

/**
  * Created by amos.zhou on 2016/3/7.
  */
class HotSwapActor extends Actor {

  import context._

  def angry: Receive = {
    case "foo" => sender() ! " I am already hungry ?"
    case "bar" => become(happy)
  }

  def happy: Receive = {
    case "bar" => sender() ! "I am already happy :-"
    case "foo" => become(angry)
  }

  override def receive: Receive = {
    case "foo" => become(angry)
    case "bar" => become(happy)
  }


}
