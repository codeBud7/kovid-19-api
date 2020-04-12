package com.codebud7.core.domainobject

class CountrySummaryPerCaseStatus : ArrayList<CountrySummaryPerCaseStatusItem>()

data class CountrySummaryPerCaseStatusItem(
    val active: Int,
    val admin2: Any,
    val combinedKey: String,
    val confirmed: Int,
    val countryRegion: String,
    val deaths: Int,
    val fips: Any,
    val incidentRate: Double,
    val iso3: String,
    val lastUpdate: Long,
    val lat: Double,
    val long: Double,
    val peopleHospitalized: Any,
    val peopleTested: Any,
    val provinceState: Any,
    val recovered: Int,
    val uid: Int
)
