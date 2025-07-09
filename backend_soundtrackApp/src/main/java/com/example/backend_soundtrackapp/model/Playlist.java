package com.example.backend_soundtrackapp.model;

import javax.sound.midi.Track;
import java.util.List;

public class Playlist {
    private String title;
    private List<Track> tracks;

    public Playlist() {

    }
    public Playlist(String title, List<Track> tracks) {
        this.title = title;
        this.tracks = tracks;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Track> getTracks() {
        return tracks;
    }
    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
