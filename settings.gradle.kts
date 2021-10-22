enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("deps") {
            from(files("deps.version.toml"))
        }
    }
}
rootProject.name = "Memo Sample"
include(":app")
include(":data-remote")
include(":domain")
include(":data-local")
include(":presentation")
