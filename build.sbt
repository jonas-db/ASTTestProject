name := "Testproject"

version := "0.1"

scalaVersion := "2.12.6"

logLevel := Level.Info

libraryDependencies += "org.scalameta" %% "scalameta" % "4.0.0-M3"

addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "4.0.0-M3" cross CrossVersion.full)
scalacOptions += "-Yrangepos"