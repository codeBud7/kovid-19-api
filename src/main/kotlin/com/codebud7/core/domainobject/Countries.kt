package com.codebud7.core.domainobject

import com.neovisionaries.i18n.CountryCode

data class Countries(
    val countries: List<Country>
)

data class Country(
    val iso2: CountryCode,
    val iso3: String,
    val name: String
)
