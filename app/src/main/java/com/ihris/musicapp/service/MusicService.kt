package com.ihris.musicapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/5267ba7d-ca5c-4e29-bbcb-6035e0b300c7")
    fun listMusics() : Call<MusicDto>
}