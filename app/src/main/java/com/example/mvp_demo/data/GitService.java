package com.example.mvp_demo.data;

import com.google.gson.JsonObject;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GitService {

    @GET("lukemi")
    Observable<JsonObject> getProfile();
}
