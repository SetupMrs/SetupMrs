pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral() // <-- ОСЬ ЦЬОГО НЕ ВИСТАЧАЛО! Без нього бібліотека не оновиться.
    }
}

rootProject.name = "DashboardNotes"
include(":app")