plugins {
    id("com.android.application")
}

android {
    namespace = "com.kistikhata.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kistikhata.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 7
        versionName = "7.0"
    }

    // স্থায়ী চাবি: প্রতিটা নতুন APK আগেরটার উপর সরাসরি আপডেট হবে
    signingConfigs {
        getByName("debug") {
            storeFile = file("dpz-debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
    implementation("androidx.core:core:1.13.1")
}
