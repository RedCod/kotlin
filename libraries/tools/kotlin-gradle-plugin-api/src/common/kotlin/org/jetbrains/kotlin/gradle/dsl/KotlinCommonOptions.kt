// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

interface KotlinCommonOptions : org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions {
    override val options: org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptions

    private val kotlin.String?.apiVersionCompilerOption get() = if (this != null) org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion(this) else null

    private val org.jetbrains.kotlin.gradle.dsl.KotlinVersion?.apiVersionKotlinOption get() = this?.version

    /**
     * Allow using declarations from only the specified version of bundled libraries.
     * Possible values: "1.4 (deprecated)", "1.5 (deprecated)", "1.6 (deprecated)", "1.7", "1.8", "1.9", "2.0", "2.1 (experimental)"
     * Default value: null
     */
    var apiVersion: kotlin.String?
        get() = options.apiVersion.orNull.apiVersionKotlinOption
        set(value) = options.apiVersion.set(value.apiVersionCompilerOption)

    private val kotlin.String?.languageVersionCompilerOption get() = if (this != null) org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion(this) else null

    private val org.jetbrains.kotlin.gradle.dsl.KotlinVersion?.languageVersionKotlinOption get() = this?.version

    /**
     * Provide source compatibility with the specified version of Kotlin.
     * Possible values: "1.4 (deprecated)", "1.5 (deprecated)", "1.6 (deprecated)", "1.7", "1.8", "1.9", "2.0", "2.1 (experimental)"
     * Default value: null
     */
    var languageVersion: kotlin.String?
        get() = options.languageVersion.orNull.languageVersionKotlinOption
        set(value) = options.languageVersion.set(value.languageVersionCompilerOption)

    /**
     * Compile using the experimental K2 compiler pipeline. No compatibility guarantees are provided yet.
     * Default value: false
     */
    @Deprecated(message = "Compiler flag -Xuse-k2 is deprecated; please use language version 2.0 instead", level = DeprecationLevel.WARNING)
    var useK2: kotlin.Boolean
        get() = options.useK2.get()
        set(value) = options.useK2.set(value)
}
