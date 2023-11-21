plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.android.dynamic-feature") version "8.1.2" apply false
}

extra.apply {
    set("koin_version", "3.1.5")
}