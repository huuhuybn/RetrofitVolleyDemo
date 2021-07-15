package com.dotplays.myapplication;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.dotplays.myapplication.URLContaints.BASE_URL;

public class RetrofitInstance {

    public static Retrofit retrofit;

    public static Retrofit getInstance(Context context) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
