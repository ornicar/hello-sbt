import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.11.12"
    )),
    name := "Hello SBT",
    libraryDependencies += scalaTest % Test
  )
