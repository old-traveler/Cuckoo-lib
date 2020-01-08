package com.hyc.cuckoo_lib

import android.app.Activity

/**
 * @author: 贺宇成
 * @date: 2019-12-23 15:56
 * @desc:
 */
interface OnPermissionRefuseListener {

  fun onPermissionRefuse(
    activity: Activity,
    methodName: String,
    grant: List<String>,
    refuse: List<String>?
  ): Boolean

}