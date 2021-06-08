import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("application")
    kotlin("jvm") version "1.3.70"
    kotlin("kapt") version "1.3.70"
    id("org.springframework.boot")
}

apply(plugin = "io.spring.dependency-management")

repositories {
    jcenter()
    mavenCentral()
    maven(url = "https://kotlin.bintray.com/kotlinx")
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
    maven(url = "https://repo.spring.io/snapshot")
    maven(url = "https://repo.spring.io/milestone")
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    api("org.springframework.boot:spring-boot-starter")
    api("net.rgielen:javafx-weaver-spring-boot-starter:1.3.0")
    api("org.springframework.boot:spring-boot-configuration-processor")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
