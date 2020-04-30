package com.github.nickfirmani.rethrowingrxjavaagent

import java.lang.instrument.Instrumentation

internal object Agent {

    @JvmStatic fun premain(args: String?, instrumentation: Instrumentation) {
        Thread.setDefaultUncaughtExceptionHandler(RethrowingExceptionHandler)
    }
}
