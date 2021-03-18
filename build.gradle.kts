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
    id("com.diffplug.spotless") version "5.11.0"
    id("com.github.ben-manes.versions") version "0.38.0"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
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

spotless {
    kotlinGradle {
        ktlint()
    }
}
