package com.codebud7.core.domainobject

import com.neovisionaries.i18n.CountryCode

class CasesPerRegion : ArrayList<CasesPerRegionItem>()

data class CasesPerRegionItem(
    val active: Int,
    val admin2: Any,
    val combinedKey: String,
    val confirmed: Int,
    val countryRegion: String,
    val deaths: Int,
    val fips: Any,
    val incidentRate: Double,
    val iso2: CountryCode,
    val iso3: String,
    val lastUpdate: Long,
    val lat: Double,
    val long: Double,
    val peopleHospitalized: Any,
    val peopleTested: Any,
    val provinceState: String,
    val recovered: Int,
    val uid: Int
)
