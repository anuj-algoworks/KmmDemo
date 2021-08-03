plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.5.20")
    implementation ("androidx.core:core-ktx:1.3.2")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")

}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.kdroid.kmmdemo.android"
        minSdkVersion(21)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures{
        viewBinding = true
    }
}