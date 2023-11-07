package core

internal val androidComposeDependencies = listOf(
    Dependencies.coreKtx,
    Dependencies.composeMaterial,
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

internal val networkDependencies = listOf<String>()