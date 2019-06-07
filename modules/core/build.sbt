name := """core"""
organization := "jp.co.rms"

version := "1.0-SNAPSHOT"

lazy val core = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
