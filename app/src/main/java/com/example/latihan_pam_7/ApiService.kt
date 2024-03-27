package com.example.latihan_pam_7

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getUsers(): Call<ApiResponse>
}