@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package x

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*

// NOTE THIS FILE IS AUTO-GENERATED

fun checkEx(errCode: Int, fname: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge0(errCode, fname?.getPointer(memScope).rawValue)
    }
}

@SymbolName("x_kniBridge0")
private external fun kniBridge0(p0: Int, p1: NativePtr): Int
