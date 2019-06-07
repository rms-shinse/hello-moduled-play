name := """core"""
organization := "jp.co.rms"

version := "1.0-SNAPSHOT"


lazy val core = (project in file("./modules/core"))

lazy val app = (project in file(".")).enablePlugins(PlayJava)
    .dependsOn(core)
    .aggregate(core)

scalaVersion := "2.12.8"

libraryDependencies += guice
