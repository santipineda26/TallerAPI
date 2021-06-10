package com.sp.tallerapi.apiManager;

import com.sp.tallerapi.modelos.Distilleri;
import com.sp.tallerapi.modelos.Whiskey;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
        String BASE_URL = "https://whiskyhunter.net/api/";


        @GET("auctions_info")
        Call<List<Whiskey>> getWhiskeys();

        @GET("distilleries_info/")
        Call<List<Distilleri>> getDistilleries();

    }
