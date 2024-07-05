pluginManagement {
    plugins {
        java
        id("org.springframework.boot") version "3.2.0"
        id("io.spring.dependency-management") version "1.1.4"
    }
}
rootProject.name = "hacken-test-task"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
    }

    versionCatalogs {
        create("libs") {
            version("lombok", "1.18.30")
            version("spring-boot", "3.2.0")
            version("postgres", "42.7.3")
            version("flyway", "10.15.2")
            version("hibernate", "6.5.2.Final")
            version("springdoc", "2.6.0")
            version("commons-csv", "1.11.0")

            library("lombok", "org.projectlombok", "lombok").versionRef("lombok")

            library("spring-boot-web", "org.springframework.boot", "spring-boot-starter-web").versionRef("spring-boot")
            library("spring-boot-jpa", "org.springframework.boot", "spring-boot-starter-data-jpa").versionRef("spring-boot")
            library("spring-boot-test", "org.springframework.boot", "spring-boot-starter-test").versionRef("spring-boot")
            library("spring-boot-aop", "org.springframework.boot", "spring-boot-starter-aop").versionRef("spring-boot")
            bundle("spring-boot", listOf("spring-boot-jpa", "spring-boot-web", "spring-boot-aop"))

            library("springdoc", "org.springdoc", "springdoc-openapi-starter-webmvc-ui").versionRef("springdoc")

            library("postgres", "org.postgresql", "postgresql").versionRef("postgres")

            library("flyway-core", "org.flywaydb", "flyway-core").versionRef("flyway")
            library("flyway-pg", "org.flywaydb", "flyway-database-postgresql").versionRef("flyway")
            bundle("flyway", listOf("flyway-core", "flyway-pg"))

            library("hibernate", "org.hibernate.orm", "hibernate-core").versionRef("hibernate")
            library("commons-csv", "org.apache.commons", "commons-csv").versionRef("commons-csv")


        }
    }
}
