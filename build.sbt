name := "p5-scalajs"

version := "0.0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq()

enablePlugins(ScalaJSPlugin)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8", // yes, this is 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xfuture",
  "-Xlint",
  "-Yno-adapted-args",
  // "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import" // 2.11 only
)
