package com.kstu.thesis.utils

import org.reactivestreams.Publisher

inline fun <T, R : Publisher<*>> T.reactiveLet(block: (T) -> R): R = this.let(block)
