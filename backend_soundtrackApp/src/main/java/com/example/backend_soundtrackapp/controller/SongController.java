package com.example.backend_soundtrackapp.controller;

import com.example.backend_soundtrackapp.model.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {

    @GetMapping("/songs")
    public List<Song> getSongs() {

    }
}
