package org.uis

import java.util.ArrayList
import kotlin.jvm.JvmStatic

object Collections {

    @JvmStatic
    fun main(args: Array<String>) {

        val list = mutableListOf("one", "two", "three", "four")

        for (item in list) {
            println(item)
        }

    }
}