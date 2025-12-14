dependencies {
    implementation(project(":subproject:domain"))

    implementation(rootProject.libs.bundles.db)
    implementation(rootProject.libs.bundles.db.migration)

    testImplementation(rootProject.libs.flyway.test)
    testImplementation(rootProject.libs.bundles.db.test)
    testImplementation(rootProject.libs.bundles.testcontainers)
}