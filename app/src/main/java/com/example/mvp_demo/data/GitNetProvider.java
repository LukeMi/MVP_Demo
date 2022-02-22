package com.example.mvp_demo.data;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitNetProvider {

    private final Retrofit retrofit;

    private final String baseUrl = "https://api.github.com/users/";

    private static GitNetProvider gitNetProvider;

    private GitNetProvider() {
        Gson gson = new Gson();
        OkHttpClient okHttpClient = new OkHttpClient
                .Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(60000, TimeUnit.SECONDS)
                .readTimeout(60000, TimeUnit.SECONDS)
                .build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static GitNetProvider getInstance() {
        if (gitNetProvider == null) {
            synchronized (GitNetProvider.class) {
                gitNetProvider = new GitNetProvider();
            }
        }
        return gitNetProvider;
    }

   public GitService createGitService() {
       return retrofit.create(GitService.class);
   }


}
