import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    maven("https://maven.blamejared.com") {
        name = "BlameJared"
    }
}

dependencies {
    gradleApi()
    implementation(group = "com.blamejared", name = "gradle-mod-utils", version = "1.0.3")
    implementation(group = "net.darkhax.curseforgegradle", name = "CurseForgeGradle", version = "1.1.16")
    implementation(group = "com.modrinth.minotaur", name = "Minotaur", version = "2.+")
    implementation(group = "com.diluv.schoomp", name= "Schoomp", version="1.2.6")
}

gradlePlugin {
    plugins {
        create("default") {
            id = "com.blamejared.searchables.default"
            implementationClass = "com.blamejared.searchables.gradle.DefaultPlugin"
        }
        create("loader") {
            id = "com.blamejared.searchables.loader"
            implementationClass = "com.blamejared.searchables.gradle.LoaderPlugin"
        }
    }
}
