package com.dotplays.myapplication;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {

    // dinh nghia http request GET, ko co tham so
    @GET("/posts")
    Call<List<Item>> getListItem();

    // http get request co tham so la a va b
    @GET("/posts")
    Call<ResponseBody> getListItem2(@Query("a") String a,
                                    @Query("b") String b);

    //  title: 'foo',
    //    body: 'bar',
    //    userId: 1,
    @POST("/posts")
    @FormUrlEncoded
    Call<ResponseBody> createUser(@Field("title") String title,
                                  @Field("body") String body,
                                  @Field("userId") String userId);

}
