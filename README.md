## SplitWisely 

📚 Android Application named Spliwisely and inspired by SplitWise, written in Kotlin, following best practices using Jetpack.

Android Components Architecture in a Modular Word is a sample project that presents a list of NFT, for development using [Kotlin](https://kotlinlang.org/) and the latest tech stack.


## Table of Contents

-   [Design](https://github.com/mjalijani/NeolineStudioInterView#design)
-   [Architecture](https://github.com/mjalijani/NeolineStudioInterView#architecture)
-   [Tech-stack](https://github.com/mjalijani/NeolineStudioInterView#tech-stack)
-   [Backend](https://github.com/mjalijani/NeolineStudioInterView#backend)
-   [Best practices](https://github.com/mjalijani/NeolineStudioInterView#best-practices)
-   [Author](https://github.com/mjalijani/NeolineStudioInterView#authors)

## Design

-   [Use compose]()


| Groups                                                                 | Activity                                                                  | Friends                                       |
|--------------------------------------------------------------------------|------------------------------------------------------------------------------|--------------------------------------------------------|
|  |  |  |



## Architecture

The architecture of the application is based, applied, and strictly complies with each of the following 5 points:

-   A single-activity architecture, using the [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started) to manage fragment operations.
-   [Android architecture components](https://developer.android.com/topic/libraries/architecture/), part of Android Jetpack for give to project a robust design, testable and maintainable.
-   Pattern [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) facilitating a [separation](https://en.wikipedia.org/wiki/Separation_of_concerns) of development of the graphical user interface.
-   [S.O.L.I.D](https://en.wikipedia.org/wiki/SOLID) design principles intended to make software designs more understandable, flexible and maintainable.
-   [Modular app architecture](https://proandroiddev.com/build-a-modular-android-app-architecture-25342d99de82) allows to be developed features in isolation, independently from other features.

## Tech-stack

This project takes advantage of many popular libraries, plugins, and tools of the Android ecosystem.

### Dependencies

-   [Jetpack](https://developer.android.com/jetpack):
    -   [Android KTX](https://developer.android.com/kotlin/ktx.html) - Provide concise, idiomatic Kotlin to Jetpack and Android platform APIs.
    -   [AndroidX](https://developer.android.com/jetpack/androidx) - major improvement to the original Android [Support Library](https://developer.android.com/topic/libraries/support-library/index), which is no longer maintained.
    -   [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
    -   [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services.
    -   [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - designed to store and manage UI-related data in a lifecycle-conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations.
-   [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - managing background threads with simplified code and reducing the need for callbacks.
-   [Dagger2](https://dagger.dev/) - dependency injector for replacement of all FactoryFactory classes.
-   [Retrofit](https://square.github.io/retrofit/) - type-safe HTTP client.


## Backend
The data is received remotely from the server and then displayed in the application (Not Implemented yet).

```properties
#SERVER

BASE_URL = "/"

Routes = ["", ""]
```

### Best practices

Avoid reinventing the wheel by following these guidelines:

-   [Google best practices](https://developer.android.com/distribute/best-practices)
-   [Android development best practices](https://github.com/futurice/android-best-practices)


## Author

<a href="https://www.linkedin.com/in/mohamad-alijani/" target="_blank">
  <img src="https://avatars.githubusercontent.com/u/21081719?v=4" width="70" align="left">
</a>

**Mohammad Javad Alijani**

[![Linkedin](https://img.shields.io/badge/-linkedin-grey?logo=linkedin)](https://www.linkedin.com/in/mohamad-alijani/)
