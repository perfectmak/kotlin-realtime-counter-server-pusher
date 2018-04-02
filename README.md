# Realtime Counter (Kotlin Nodejs Server)
This is a realtime server for broadcasting click events. It is implemented in Kotlin (compiled to Javascript) and uses Pusher for its realtime feature. You can find a client android application that responds to the realtime click events [here](https://github.com/perfectmak/kotlin-realtime-counter-pusher).

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
You need to have the following before you can setup and test this project on your local machine:
- [A free Pusher account](https://pusher.com)
- [Node.js](https://nodejs.org/en/download/) version 5 or greater
- [Gradle](https://gradle.org/install/)

### Installation
1. Create an app on Pusher and copy your app's id, key, and secret.
2. Clone this repository and `cd` into it.
4. Execute `npm install` to download dependencies.
5. Update src/main/kotlin/realtimecounter/App.kt with your Pusher Credentials.
6. Execute `gradle build` to build the project and javascript files.
7. Then execute `node build/app.js` to start the realtime server.
6. The server is now accessible at `http://localhost:9999`. You install the accompanying android app [here](https://github.com/perfectmak/kotlin-realtime-counter-pusher) to interact with this server.

## Built With

* [Kotlin](https://kotlinlang.org/) - Static Typed programming language
* [Pusher](https://pusher.com/) - APIs to enable devs building realtime features
