package com.example.mvp_demo.data;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GitService {

    @GET("/lukemi")
    Observable<String> getProfile();
}
