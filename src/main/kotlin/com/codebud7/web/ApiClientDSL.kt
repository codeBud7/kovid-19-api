package com.codebud7.web

fun apiClient(lambda: ApiClient.() -> Unit) = ApiClient().apply(lambda)
