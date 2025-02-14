plugins {
    kotlin("jvm")
    id("jps-compatible")
}

sourceSets {
    "main" { java.srcDirs("main") }
}

dependencies {
    implementation(projectTests(":native:swift:sir-analysis-api"))
    implementation(projectTests(":native:swift:sir-compiler-bridge"))
    implementation(projectTests(":generators:test-generator"))
    runtimeOnly(projectTests(":analysis:analysis-test-framework"))
    runtimeOnly(libs.junit.jupiter.api)
}

val generateTests by generator("org.jetbrains.kotlin.generators.tests.native.swift.sir.GenerateSirTestsKt")