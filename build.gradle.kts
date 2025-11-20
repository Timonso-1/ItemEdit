import dev.slne.surf.surfapi.gradle.util.withSurfApiBukkit

plugins {
    id("dev.slne.surf.surfapi.gradle.paper-plugin")
}

dependencies {
}

group = "de.timonso"
version = "1.21.10-1.0"
kotlin
surfPaperPluginApi {
    mainClass("de.timonso.itemedit.ItemEdit")
    generateLibraryLoader(false)
    authors.add("Timonso")
    description = "This plugin adds item editing features."

    surfPaperPluginApi {
        runServer {
            withSurfApiBukkit()
        }
    }
}


kotlin {
    jvmToolchain(21)
}
