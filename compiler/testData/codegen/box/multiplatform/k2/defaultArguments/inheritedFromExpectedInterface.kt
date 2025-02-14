// !LANGUAGE: +MultiPlatformProjects
// IGNORE_BACKEND_K1: JVM, JVM_IR, JS, JS_IR, JS_IR_ES6, WASM
// IGNORE_NATIVE_K1: mode=ONE_STAGE_MULTI_MODULE

// MODULE: common
// FILE: common.kt
expect interface I {
    fun f(p: String = "OK"): String
}

// MODULE: platform()()(common)
// FILE: platform.kt
actual interface I {
    actual fun f(p: String): String
}

class Impl : I {
    override fun f(p: String) = p
}

fun box() = Impl().f()
