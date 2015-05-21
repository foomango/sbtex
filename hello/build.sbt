val scalacOptions = taskKey[Seq[String]]("Options for the Scala compiler.")
val checksums = settingKey[Seq[String]]("The list of checksums to generate and to verify for dependencies.")

lazy val myhello = taskKey[Unit]("An example task")

lazy val root = (project in file(".")).
    settings(
        myhello := { println("Hello!") },
        name := "hello",
        version := "1.0",
        organization := name.value,
        scalaVersion := "2.11.4"
    )

