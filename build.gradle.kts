
plugins {
    id("maven-publish")
    id("net.fabricmc.fabric-loom-remap") version "1.14-SNAPSHOT"
    id ("org.jetbrains.kotlin.jvm") version "2.2.21"
}

base {
    version = project.property("mod_version") as String
    group = project.property("maven_group") as String
    archivesName = project.property("archives_base_name") as String
}

fabricApi{
    configureDataGeneration{
        client = true
    }
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Jitpack"
            url = uri("https://jitpack.io")
        }
        maven {
            name = "modrinth"
            url = uri("https://api.modrinth.com/maven")
        }
    }
}



dependencies {
    // To change the versions see the gradle.properties file
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")

    modImplementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabric_version")}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.property("fabric_kotlin_version")}")

}
tasks.processResources {

    val modVersion = providers.gradleProperty("mod_version")
    val minecraftVersion = providers.gradleProperty("minecraft_version")
    val fabricVersion = providers.gradleProperty("fabric_version")
    val loaderVersion = providers.gradleProperty("loader_version")
    val fabricKotlinVersion = providers.gradleProperty("fabric_kotlin_version")



    inputs.property("mod_version", modVersion)
    inputs.property("minecraft_version",minecraftVersion)
    inputs.property("fabric_version", fabricVersion)
    inputs.property("loader_version",loaderVersion)
    inputs.property("fabric_kotlin_version", fabricKotlinVersion)


    filesMatching("fabric.mod.json") {
        expand(
            mapOf(
                "mod_version" to modVersion.get(),
                "minecraft_version" to minecraftVersion.get(),
                "fabric_version" to fabricVersion.get(),
                "loader_version" to loaderVersion.get(),
                "fabric_kotlin_version" to fabricKotlinVersion.get(),
            )
        )

    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release = 21
}


java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        suppressWarnings = true
        jvmToolchain(21)
        freeCompilerArgs.add("-XXLanguage:+ExplicitBackingFields")
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}


tasks.jar {
    inputs.property("archivesName", base.archivesName.get())
    from("LICENSE") {
        rename { "${it}_${inputs.properties["archivesName"]}" }
    }
}
