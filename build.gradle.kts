plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

defaultTasks("app")

tasks.register<JavaExec>("app") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.MainKt")

    args("arg1", "arg2", "arg3")
}

tasks.register("blah") {
    println("HI HI HI 1")
    description = "best greeting in the world"
    group = "greeting"
    doFirst {
        println("This is executed first during the execution phase.")
    }
    doLast {
        println("This is executed last during the execution phase.")
    }
    println("HI HI HI")
}
