package me.funny.akka.construct

import akka.actor.{Props, ActorSystem}

/**
  * Created by amos.zhou on 2016/3/4.
  */
object Demo2 extends App {


  val system = ActorSystem("Demo2")

  val actor2  = system.actorOf(Props(classOf[Actor2],"AnyString"),"actor2")

  actor2 ! "test"
  actor2 ! "other"

}
