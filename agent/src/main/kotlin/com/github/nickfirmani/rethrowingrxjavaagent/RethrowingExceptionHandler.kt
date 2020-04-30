package com.github.nickfirmani.rethrowingrxjavaagent

internal object RethrowingExceptionHandler : Thread.UncaughtExceptionHandler {
    override fun uncaughtException(
        thread: Thread,
        throwable: Throwable
    ): Nothing = throw UncaughtException(throwable)
}

internal class UncaughtException(cause: Throwable) : Exception(cause)