package com.codebud7.web

import com.codebud7.core.domainobject.*
import com.codebud7.core.domainvalue.CaseStatus
import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import com.google.gson.Gson
import com.neovisionaries.i18n.CountryCode

class ApiClient {

    companion object {
        const val API_URL = "https://covid19.mathdro.id/api/"
        const val COUNTRIES_API_EXTENSION = "countries"
        const val DAILY_API_EXTENSION = "daily"

        const val DEFAULT_READ_TIMEOUT = 60000
    }

    private fun get(pathExtension: String): Triple<Request, Response, Result<String, FuelError>> =
        "$API_URL/$pathExtension"
            .httpGet()
            .timeoutRead(timeout = DEFAULT_READ_TIMEOUT)
            .responseString()

    fun getCountries(): Countries =
        get(COUNTRIES_API_EXTENSION)
            .let { Gson().fromJson(it.third.get(), Countries::class.java) }

    fun getCountrySummary(countryCode: CountryCode): CountrySummary =
        get("$COUNTRIES_API_EXTENSION/${countryCode.alpha2}")
            .let { Gson().fromJson(it.third.get(), CountrySummary::class.java) }

    fun getCountrySummaryByCaseStatus(countryCode: CountryCode, caseStatus: CaseStatus): CountrySummaryPerCaseStatus =
        get("$COUNTRIES_API_EXTENSION/${countryCode.alpha2}/$caseStatus")
            .let { Gson().fromJson(it.third.get(), CountrySummaryPerCaseStatus::class.java) }

    fun getCasesPerRegionByCaseStatus(caseStatus: CaseStatus): CasesPerRegion =
        get("$caseStatus")
            .let { Gson().fromJson(it.third.get(), CasesPerRegion::class.java) }

    fun getCasesPerDay(): CasesPerDay =
        get(DAILY_API_EXTENSION)
            .let { Gson().fromJson(it.third.get(), CasesPerDay::class.java) }

    fun getUpdatesPerDay(date: String): UpdatesPerDay =
        get("$DAILY_API_EXTENSION/$date")
            .let { Gson().fromJson(it.third.get(), UpdatesPerDay::class.java) }
}
