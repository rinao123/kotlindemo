package com.rinao.demo.kotlindemo.gateway.common

data class Response internal constructor(val code: Int, val data: Map<String, Any>?, val message: String) {

    companion object {
        fun success(data: Map<String, Any>): Response {
            return Response(0, data, "")
        }

        fun fail(code: Int, message: String): Response {
            return Response(code, null, message)
        }
    }
}