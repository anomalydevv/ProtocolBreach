plugins {
    kotlin("jvm") version "2.4.0"
}

group = "org.anomalydevv"
version = "1.0-SNAPSHOT"

val gdxVersion = "1.12.1"
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
    implementation("com.github.mgsx-dev.gdx-gltf:gltf:2.3.0")

    testImplementation(kotlin("test"))
}

kotlin { jvmToolchain(21) }
tasks.test {
    useJUnitPlatform()
}