plugins {
    kotlin("jvm") version "2.4.0"
}

group = "org.anomalydevv"
version = "1.0-SNAPSHOT"

val gdxVersion = "1.12.1"
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")

    testImplementation(kotlin("test"))
}

kotlin { jvmToolchain(21) }
tasks.test {
    useJUnitPlatform()
}