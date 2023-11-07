package core

internal object Dependencies {
    //Ktx
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    //Compose
    const val composeMaterial = "androidx.compose.material:material:${Versions.materialVersion}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.composeNavigationVersion}"
    const val composePreviewUi = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    //Material
    const val material = "com.google.android.material:material:${Versions.material}"
    //DI
    const val koin = "io.insert-koin:koin-androidx-compose:${Versions.koin_version}"
    //MVI Kotlin
    const val mviKotlin = "com.arkivanov.mvikotlin:mvikotlin:${Versions.mviKotlin_version}"
    const val mviKotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:${Versions.mviKotlin_version}"
    const val mviKotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:${Versions.mviKotlin_version}"
    const val mviKotlinTimeTravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:${Versions.mviKotlin_version}"
    const val mviKotlinCoroutines = "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:${Versions.mviKotlin_version}"
    //ViewModel
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleVersion}"
    const val viewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val runtimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.runtimeComposeVersion}"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycleVersion}"
    //Test
    const val jUnit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val jUnitExt = "androidx.test.ext:junit:${Versions.jUnitExtVersion}"
    const val jUnitTestUi = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    //Coroutines
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    //Memory Management
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanaryVersion}"
    //Logger
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
}