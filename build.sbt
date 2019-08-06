name := "akka-grocery-crawler"

version := "0.0.1"

scalaVersion := "2.12.8"

lazy val akkaHttpVersion = "10.1.3"
lazy val akkaVersion = "2.5.13"

resolvers += "jitpack" at "https://jitpack.io"

mainClass in (Compile, run) := Some("me.mbcu.crawler.Start")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
  "com.typesafe.play" %% "play-json"            % "2.6.9",
  "com.typesafe.play" %% "play"                 % "2.6.13",
  "javax.inject" % "javax.inject" % "1",
  "com.typesafe.play" %% "play-functional" % "2.6.9",
  "com.beachape.filemanagement" %% "schwatcher" % "0.3.2",
  "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
  "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"            % "3.0.1"         % Test,
  "org.mockito"       % "mockito-core"          % "2.19.1"         % Test
)

libraryDependencies += "io.monix" %% "monix" % "3.0.0-RC3"
excludeDependencies += "commons-logging" % "commons-logging"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"
libraryDependencies += "com.github.inmyth" % "scala-mylogging" % "26b5b2c"
libraryDependencies += "com.typesafe.play" %% "play-json-joda" % "2.6.9"
libraryDependencies += "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.0.0-M1"
libraryDependencies += "com.typesafe.play" %% "play-ws-standalone-json" % "2.0.0-M1"
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "2.1.0"