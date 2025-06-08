plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    iosArm64 {
        binaries.framework {
            baseName = "shared"
            isStatic = true
            binaryOption("bundleId", "eu.krzdabrowski.cmpkoinbug.umbrellaios")

            export(project(":core"))
            export(project(":basic-feature-a"))
            export(project(":basic-feature-b"))
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(project(":core"))
            api(project(":basic-feature-a"))
            api(project(":basic-feature-b"))
        }
    }
}
