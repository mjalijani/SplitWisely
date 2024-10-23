plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.com.dagger.hilt)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
}

android {
    namespace = "com.mjalijani.splitwisely"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mjalijani.splitwisely"
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
        kotlinCompilerExtensionVersion = "1.5.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Coil
    implementation(libs.coil.compose)

    // Paging 3
    implementation(libs.androidx.paging.runtime.ktx)
    implementation(libs.androidx.paging.compose)

    // Room
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)

    //Work Manager + Hilt
    implementation(libs.androidx.hilt.work)
    kapt(libs.dagger.hilt.compiler)
    kapt(libs.androidx.hilt.compiler)

    // Dagger - Hilt
    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hilt.compiler)
    implementation(libs.dagger.nav.compose)

    // ViewModel with ktx
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // Compose viewmodel utility
    implementation(libs.androidx.lifecycle.viewmodel.compose)


    // Timber for log
    implementation(libs.timber)

    // Retrofit
    implementation(libs.retrofit2)
    implementation(libs.okhttp)

    // Retrofit with Scalar Converter
    implementation(libs.scalar.converter)

    // Kotlin Serialization
    implementation(libs.kotlin.serialization)
    implementation(libs.gson.serialization)

    // Retrofit with Jakewharton Converter
    implementation(libs.jakewharton.converter)

    // Persian Date
    implementation(libs.persian.date)

}