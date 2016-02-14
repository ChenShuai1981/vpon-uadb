organization := "com.vpon"

name := "vpon-uadb"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "Vpon Test Artifactory" at "http://192.168.101.29:8081/artifactory/vpon-test"
)

crossPaths := false

publishTo := {
  val artifactory = "http://192.168.101.29:8081/artifactory/vpon-"
  if (isSnapshot.value)
    Some("Vpon snapshots" at artifactory + "test")
  else
    Some("Vpon releases" at artifactory + "test")
}

publishMavenStyle := true

credentials += Credentials("Artifactory Realm", "192.168.101.29", "vpon-test", "vpon-test")
//credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
//  realm=Artifactory Realm
//  host=192.168.101.29
//  user=vpon-test
//  password=vpon-test