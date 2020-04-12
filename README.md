# kovid-19-api
A Kotlin covid-19 api wrapper of data from https://github.com/mathdroid/covid-19-api

Motivation ✨
----------------
* Make covid-19 data available for JVM
* Get some experience with fuel API client
* Create some nice DSL (still in the making)

Scope 🧰️
----------------
```kotlin
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
```

Credits 🙌
----------------
- API by https://github.com/mathdroid/covid-19-api
- Images by https://lottiefiles.com/coronavirus-animations

Contribution 👩‍💻
----------------
Just create a pull request. You're welcome!

License ⚖️
----------------
Apache license 2.0 © Sebastian Puskeiler

![](wash-your-hands.gif)
