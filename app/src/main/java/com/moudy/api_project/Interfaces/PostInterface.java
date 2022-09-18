package com.moudy.api_project.Interfaces;


import com.moudy.api_project.Data.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Call<List<PostModel>> getpost();
}

