plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = deps.versions.compileSdk.get().toInt()
}

dependencies {
    implementation(deps.androidx.core)
    implementation(deps.androidx.appcompat)
    implementation(deps.android.material)
    implementation(deps.androidx.lifecycle.runtime)
    implementation(project(":domain"))

//    implementation 'androidx.core:core-ktx:1.6.0'
//    implementation 'androidx.appcompat:appcompat:1.3.1'
//    implementation 'com.google.android.material:material:1.4.0'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}