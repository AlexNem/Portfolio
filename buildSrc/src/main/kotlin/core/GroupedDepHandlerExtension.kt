package core

import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addAndroidComposeDependencies(){
    androidComposeDependencies.forEach {
        add("implementation",it)
    }
}


fun DependencyHandler.addAndroLifeCycleDependencies(){
    androidxLifeCycleDependencies.forEach {
        add("implementation",it)
    }
}


fun DependencyHandler.addCoroutinesAndroidDependencies(){
    coroutinesAndroidDependencies.forEach {
        add("implementation",it)
    }
}

//fun DependencyHandler.addCoilImageLoadingDependencies(){
//    coilImageLoadingDependencies.forEach {
//        add("implementation",it)
//    }
//}

fun DependencyHandler.addNetworkDependencies(configurationName:String = "implementation"){
    networkDependencies.forEach {
        add(configurationName,it)
    }
}

fun DependencyHandler.addKoinDependencies() {
    add("implementation", Dependencies.koin)
}


fun DependencyHandler.addTimberDependencies(configurationName:String = "implementation"){
    add(configurationName, Dependencies.timber)
}

fun DependencyHandler.addLeakcanaryDependencies(){
    add("debugImplementation", Dependencies.leakcanary)
}

fun DependencyHandler.addAndroidTestsDependencies() {
    add("testImplementation", Dependencies.jUnit)
    add("androidTestImplementation", Dependencies.jUnitTestUi)
    add("androidTestImplementation", Dependencies.jUnitExt)
    add("androidTestImplementation", Dependencies.espresso)
    add("debugImplementation", Dependencies.composeTooling)
    add("debugImplementation", Dependencies.composeTestManifest)
}
