plugins {
    id("java-library")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

group = "com.hacken.ocherepnin.test_task"

repositories {
    mavenCentral()
}


java {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.bundles.spring.boot)
    implementation(libs.postgres)
    implementation(libs.commons.csv)
    implementation(libs.bundles.flyway)
    runtimeOnly(libs.flyway.pg)

    implementation(libs.hibernate)
    implementation(libs.springdoc)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.spring.boot.test)
}

tasks.test {
    useJUnitPlatform()
}