package id.wisata.service.api

import android.util.Log
import com.google.gson.GsonBuilder
import id.wisata.data.model.Place
import okhttp3.*
import java.io.IOException

class FindPlace {


    fun fetchJson(){
        println("Attempt to fetch Json")
        val API_KEY = "AIzaSyCgx5_d-qwLgUtZhPV3lm6V-u0DxBX6xxk"
        var placeName : String = ""
        val url : String = "https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input="+placeName+"&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours,geometry&key="+API_KEY

        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                Log.i("JOs", body)

                val gson = GsonBuilder().create()

                val place = gson.fromJson(body, Place::class.java)
            }
            override fun onFailure(call: Call, e: IOException) {
                Log.e("eror", "Failed to execute request")
            }
        })
    }
}