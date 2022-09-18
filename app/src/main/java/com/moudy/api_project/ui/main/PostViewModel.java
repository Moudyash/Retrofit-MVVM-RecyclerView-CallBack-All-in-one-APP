package com.moudy.api_project.ui.main;

import android.widget.Toast;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.moudy.api_project.Data.PostModel;
import com.moudy.api_project.Interfaces.PostsClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {
    MutableLiveData<List<PostModel>> postsMutableLiveData = new MutableLiveData<>();
    MutableLiveData<String> posts = new MutableLiveData<>();

    public void getPosts() {
        PostsClient.getINSTANCE().getposts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                postsMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                posts.setValue("errr");
            }
        });
    }
}