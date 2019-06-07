name := """hello-moduled-play"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val core = (project in file("./modules/core"))
lazy val root = (project in file("."))
    .enablePlugins(PlayJava)
    .dependsOn(core)
    .aggregate(core)

scalaVersion := "2.12.8"

libraryDependencies += guice
