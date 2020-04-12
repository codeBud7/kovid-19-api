package com.codebud7.core.domainobject

data class CountrySummary(
    val confirmed: CaseStatusSummary,
    val deaths: CaseStatusSummary,
    val lastUpdate: String,
    val recovered: CaseStatusSummary
)

data class CaseStatusSummary(
    val detail: String,
    val value: Int
)
