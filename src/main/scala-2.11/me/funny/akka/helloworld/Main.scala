package me.funny.akka.helloworld

/**
  * Created by amos.zhou on 2016/3/3.
  */
object Main extends App {

  akka.Main.main(Array(classOf[MainCenter].getName))
}
