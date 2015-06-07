name := """dengels.ch"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

val webJars = Seq(
  "org.webjars.bower" % "jquery" % "2.1.3",
  "org.webjars.bower" % "materialize" % "0.96.1"
)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
) ++ webJars
