name := "BigData"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.0.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.3.0" % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.0.0"


