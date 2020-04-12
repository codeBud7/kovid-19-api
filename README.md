# kovid-19-api
[![](https://jitpack.io/v/codeBud7/kovid-19-api.svg)](https://jitpack.io/#codeBud7/kovid-19-api)

A Kotlin covid-19 api wrapper of data from https://github.com/mathdroid/covid-19-api so that smart people like you
 can build something useful without caring much about the interface to data.

Motivation ✨
----------------
- Make covid-19 data available for JVM
- Get some experience with fuel API client
- Create some nice DSL (still in the making)

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

Install ⚙️
----------------
[![](https://jitpack.io/v/codeBud7/kovid-19-api.svg)](https://jitpack.io/#codeBud7/kovid-19-api)

You can get the latest version from JitPack.

E.g. for maven:
1. Add the JitPack repository to your build file
    ```xml
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    ```

2. Add the dependency
    ```xml
    <dependency>
        <groupId>com.github.codeBud7</groupId>
        <artifactId>kovid-19-api</artifactId>
        <version>v1.0</version>
    </dependency>
    ```

3. Create a new instance of the ApiClient and fetch data
    ```kotlin
    apiClient {
     val updatesPerDay = getUpdatesPerDay("4-11-2020")
     println("detail of updates in a [date] (e.g. /api/daily/4-11-2020): $updatesPerDay")
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

Stay healthy 😷
----------------
Wash your hands and take care of others and yourself.

![](wash-your-hands.gif)
