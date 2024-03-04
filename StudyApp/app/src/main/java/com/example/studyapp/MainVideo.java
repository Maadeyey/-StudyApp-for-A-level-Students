package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubePlayerView;

import java.util.Vector;

public class MainVideo extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideo = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(  this ));

        youtubeVideo.add(new YouTubeVideos("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Kp6uup02CDc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideo.add(new YouTubeVideos("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PwqRBrAK9RM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideo.add(new YouTubeVideos("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/d64219dEwXk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideo.add(new YouTubeVideos("<iframe width = \"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vwAJ8ByQH2U\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideo);

        recyclerView.setAdapter(videoAdapter);

    }


}
