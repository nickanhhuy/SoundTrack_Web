package com.example.backend_soundtrackapp.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "soundtrack")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String artist;
    private String genre;


    public Song() {

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song(Integer id, String artist, String title, String genre) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }
}
