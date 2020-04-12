package com.codebud7.core.domainobject

class CasesPerDay : ArrayList<DailyCasesItem>()

data class DailyCasesItem(
    val active: Int,
    val confirmed: Confirmed,
    val deaths: Deaths,
    val deltaConfirmed: Int,
    val deltaConfirmedDetail: DeltaConfirmedDetail,
    val deltaRecovered: Int,
    val incidentRate: Double,
    val mainlandChina: Int,
    val otherLocations: Int,
    val peopleTested: Int,
    val recovered: Recovered,
    val reportDate: String,
    val totalConfirmed: Int,
    val totalRecovered: Int
)

data class Confirmed(
    val china: Int,
    val outsideChina: Int,
    val total: Int
)

data class Deaths(
    val china: Int,
    val outsideChina: Int,
    val total: Int
)

data class DeltaConfirmedDetail(
    val china: Int,
    val outsideChina: Int,
    val total: Int
)

data class Recovered(
    val china: Int,
    val outsideChina: Int,
    val total: Int
)
