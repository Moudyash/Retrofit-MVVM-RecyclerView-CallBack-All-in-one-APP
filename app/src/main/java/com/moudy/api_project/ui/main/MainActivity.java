package com.moudy.api_project.ui.main;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.moudy.api_project.Data.PostModel;
import com.moudy.api_project.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    PostViewModel postViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);

        postViewModel.getPosts();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        final PostsAdapter adapter = new PostsAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        postViewModel.postsMutableLiveData.observe(this, new Observer<List<PostModel>>() {
            @Override
            public void onChanged(List<PostModel> postModels) {
                adapter.setList(postModels);
            }
        });

    }
}