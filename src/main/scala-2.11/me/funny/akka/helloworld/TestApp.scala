package me.funny.akka.helloworld

import akka.actor.{Props, ActorSystem}


/**
  * Created by amos.zhou on 2016/3/4.
  */
object TestApp extends App {

  val system = ActorSystem("Demo1")
  val greeterActor = system.actorOf(Props[Greeter],"greeterActor")

  greeterActor ! Greeter.Greet
  greeterActor ! Greeter.Done
}
