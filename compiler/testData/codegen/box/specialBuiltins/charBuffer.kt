// TARGET_BACKEND: JVM
// IGNORE_CODEGEN_WITH_IR_FAKE_OVERRIDE_GENERATION: KT-63489
// MODULE: lib
// FILE: CharBuffer.java

public abstract class CharBuffer implements CharSequence {
    public final int length() {
        return 0;
    }

    public final char charAt(int index) {
        return 'K';
    }

    // The key problem here is that `get` has the same signature as kotlin.CharSequence.get but completely different semantics
    public abstract char get(int index);
    public abstract CharBuffer subSequence(int start, int end);

    public static CharBuffer impl() {
        return new CharBuffer() {
            @Override
            public char get(int index) {
                return 'O';
            }

            @Override
            public CharBuffer subSequence(int start, int end) {
                return null;
            }
        };
    }
}

// MODULE: main(lib)
// FILE: 1.kt
abstract class KCB : CharBuffer()

fun box(): String {
    val cb: CharBuffer = CharBuffer.impl()

    return cb.get(0).toString() + (cb as CharSequence).get(1).toString()
}
