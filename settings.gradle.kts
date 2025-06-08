@file:Suppress("UnstableApiUsage")

include(":app")
include(":basic-feature-a")
include(":basic-feature-b")
include(":core")
include(":umbrella-ios")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

buildCache {
    local {
        isEnabled = true
        directory = File(rootDir, "build-cache")
    }
}
