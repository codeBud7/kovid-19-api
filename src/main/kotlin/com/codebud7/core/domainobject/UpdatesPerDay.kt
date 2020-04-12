package com.codebud7.core.domainobject

class UpdatesPerDay : ArrayList<UpdatesPerDayItem>()

data class UpdatesPerDayItem(
    val active: String,
    val admin2: String,
    val combinedKey: String,
    val confirmed: String,
    val countryRegion: String,
    val deaths: String,
    val fips: String,
    val lastUpdate: String,
    val lat: String,
    val long: String,
    val provinceState: String,
    val recovered: String
)
