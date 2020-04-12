package com.codebud7

import com.codebud7.core.domainvalue.CaseStatus.*
import com.codebud7.web.apiClient
import com.neovisionaries.i18n.CountryCode.DE

fun main() {

    println("Hi.")

    apiClient {

        val countries = getCountries()
        println("all countries and their ISO codes: $countries")

        val countrySummary = getCountrySummary(DE)
        println("a [country] summary: $countrySummary")

        val countrySummaryByCaseStatus = getCountrySummaryByCaseStatus(DE, confirmed)
        println("a [country] summary per region sorted by confirmed cases: $countrySummaryByCaseStatus")

        val confirmedCases = getCasesPerRegionByCaseStatus(confirmed)
        println("global cases per region sorted by confirmed cases: $confirmedCases")

        val recoveredCases = getCasesPerRegionByCaseStatus(recovered)
        println("global cases per region sorted by recovered cases: $recoveredCases")

        val deaths = getCasesPerRegionByCaseStatus(deaths)
        println("global cases per region sorted by death toll: $deaths")

        val casesPerDay = getCasesPerDay()
        println("global cases per day: $casesPerDay")

        val updatesPerDay = getUpdatesPerDay("4-11-2020")
        println("detail of updates in a [date] (e.g. /api/daily/4-11-2020): $updatesPerDay")
    }

    println("Stay healthy.")
}
