name := "funny-akka"

version := "1.0"

scalaVersion := "2.11.7"


resolvers ++=
  Seq("repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Spray Repository" at "http://repo.spray.io",
    "Spray Nightlies" at "http://nightlies.spray.io/")

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.2"
libraryDependencies += "io.spray" % "spray-can_2.11" % "1.3.3"
libraryDependencies += "io.spray" % "spray-routing_2.11" % "1.3.3"
libraryDependencies += "io.spray" % "spray-json_2.11" % "1.3.2"
libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.11" % "2.4.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.6"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.2" % "test"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"
