plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = deps.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.memosample"
        minSdk = deps.versions.minSdk.get().toInt()
        targetSdk = deps.versions.targetSdk.get().toInt()
        versionCode = deps.versions.targetSdk.get().toInt()
        versionName = deps.versions.targetSdk.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        kotlinCompilerExtensionVersion = deps.versions.compose.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(deps.androidx.core)
    implementation(deps.androidx.appcompat)
    implementation(deps.android.material)
    implementation(deps.bundles.androidx.compose)
    implementation(deps.androidx.lifecycle.runtime)
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:1.0.1"
//    debugImplementation "androidx.compose.ui:ui-tooling:1.0.1"
}