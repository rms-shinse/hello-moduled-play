name := """hello-moduled-play"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val core = (project in file("./modules/core"))
lazy val app = (project in file("./modules/app"))
lazy val root = (project in file("."))
    .enablePlugins(PlayJava)
    .dependsOn(core, app)
    .aggregate(core, app)

scalaVersion := "2.12.8"

libraryDependencies += guice
