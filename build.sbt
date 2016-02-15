organization := "com.vpon"

name := "vpon-uadb"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "maven main" at "http://192.168.101.29:8081/artifactory/maven-main/"
)

crossPaths := false
