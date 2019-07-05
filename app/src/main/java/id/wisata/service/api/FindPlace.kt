package id.wisata.service.api

import okhttp3.*
import java.io.IOException

class FindPlace {

    fun fetchJson(){
        println("Attempt to fetch Json")
        val API_KEY : String = "AIzaSyCgx5_d-qwLgUtZhPV3lm6V-u0DxBX6xxk"
        var url : String = "https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=Museum%20of%20Contemporary%20Art%20Australia&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours,geometry&key="+API_KEY

        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body?.string()
                println(body)
            }
            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute request")
            }
        })
    }
}