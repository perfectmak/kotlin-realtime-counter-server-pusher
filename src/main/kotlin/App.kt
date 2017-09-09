
external fun require(module: String): dynamic

@JsModule("pusher")
external class Pusher(config: Any) {
    fun trigger(channel: String, event: String, data: Any)
}


val express = require("express")

val pusherConfig  = object {
    val appId = "YOUR_PUSHER_APP_ID"
    val key = "YOUR_PUSHER_KEY"
    val secret = "YOUR_PUSHER_SECRET"
    val cluster = "YOUR_PUSHER_APP_CLUSTER"
    val encrypted = true
}

val clickChannel = "click-channel"
val clickEvent = "click-event"
var currentClickCount = 0

fun main(args: Array<String>) {
    val app = express()
    val pusher = Pusher(pusherConfig)
    
    app.get("/counts", { _, res ->
        res.json(ClickCount(currentClickCount))
    })

    app.post("/clicks", { _, res ->
        currentClickCount++
        // broadcast new ClickCount
        pusher.trigger(clickChannel, clickEvent, ClickCount(currentClickCount))
        res.status(200).send()
    })
    
    app.listen(9999, {
        println("Listening on port 9999")
    })
}