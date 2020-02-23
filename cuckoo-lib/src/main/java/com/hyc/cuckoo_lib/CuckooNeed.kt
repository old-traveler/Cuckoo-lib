package com.hyc.cuckoo_lib

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationRetention.BINARY
import kotlin.annotation.AnnotationTarget.FUNCTION

/**
 * @author: 贺宇成
 * @date: 2019-12-18 15:43
 * @desc:
 */
@kotlin.annotation.Retention(BINARY)
@kotlin.annotation.Target(
  FUNCTION
)
annotation class CuckooNeed(
  vararg val value: String = []
)

@kotlin.annotation.Retention(RUNTIME)
@kotlin.annotation.Target(
  FUNCTION
)
annotation class CuckooMethod(
  val value: String
)