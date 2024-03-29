plugins {
    id("kangmingu.plugin.library")
    id("kangmingu.plugin.hilt")
    id("kangmingu.plugin.network")
}

android {
    namespace = "kang.min.data"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(libs.dataStore)
}