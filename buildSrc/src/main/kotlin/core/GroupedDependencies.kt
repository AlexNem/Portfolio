package core

internal val androidComposeDependencies = listOf(
    Dependencies.coreKtx,
    Dependencies.composeMaterial,
    Dependencies.composeMaterial3,
    Dependencies.composeActivity,
    Dependencies.composeUi,
    Dependencies.composePreviewUi,
    Dependencies.composeNavigation
)

internal val androidxLifeCycleDependencies = listOf(
    Dependencies.viewModel,
    Dependencies.liveData,
    Dependencies.runtimeCompose,
    Dependencies.viewModelSaveState,
    Dependencies.lifecycleService,
)

internal val coroutinesAndroidDependencies = listOf(
    Dependencies.kotlinCoroutines,
)

internal val coinDependencies = listOf(
    Dependencies.koin
)

internal val networkDependencies = listOf(
    Dependencies.ktorCore,
    Dependencies.ktorCio,
    Dependencies.ktorLogging,
    Dependencies.ktorNegotiation,
    Dependencies.kotlinSerialization
)