package com.example.backend_soundtrackapp.model;

import java.util.List;

public class Playlist {
    private String title;
    private List<Song> songs;

    public Playlist() {
    }
    public Playlist(String title, List<Song> songs) {
        this.title = title;
        this.songs = songs;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Song> getTracks() {
        return songs;
    }
    public void setTracks(List<Song> songs) {
        this.songs = songs;
    }
}
