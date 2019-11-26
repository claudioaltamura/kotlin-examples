import org.gradle.api.tasks.testing.logging.TestLogEvent

buildscript {
  repositories {
    jcenter()
  }

  dependencies {
    classpath(kotlin("gradle-plugin", version = "1.3.60"))
  }
}

plugins {
  kotlin("jvm") version "1.3.60"
  eclipse
  idea
}

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("com.google.guava:guava:16.0")

  testImplementation("org.assertj:assertj-core:3.12.2")
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")

  testRuntime("org.junit.jupiter:junit-jupiter-engine:5.4.2")
  testImplementation(kotlin("test"))
  testImplementation(kotlin("test-junit"))
}

tasks {
  test {
    useJUnitPlatform()
    testLogging {
      events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
    }
  }
}
