package com.kdroid.kmmdemo

import platform.Foundation.NSUUID


actual fun randomUUID(): String = NSUUID().UUIDString()
