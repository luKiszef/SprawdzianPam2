plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.sprawdzianpam2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.sprawdzianpam2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    dependencies {
        implementation ("androidx.core:core-ktx:1.12.0")
        implementation ("androidx.activity:activity-compose:1.7.2")
        implementation ("androidx.compose.ui:ui:1.6.0")
        implementation ("androidx.compose.material:material:1.6.0")
        implementation ("androidx.compose.ui:ui-tooling:1.6.0")
        implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    }

}