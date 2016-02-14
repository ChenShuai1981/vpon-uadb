organization := "com.vpon"

name := "vpon-uadb"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "vpon maven" at "http://192.168.101.29:8081/artifactory/vpon-maven/"
)

crossPaths := false

publishTo := {
  val artifactory = "http://192.168.101.29:8081/artifactory/vpon-"
  if (isSnapshot.value)
    Some("Vpon snapshots" at artifactory + "snapshot")
  else
    Some("Vpon releases" at artifactory + "release")
}

publishMavenStyle := true

credentials += Credentials(Path("/") / "home" / "devadm" / ".ivy2" / ".credentials")
