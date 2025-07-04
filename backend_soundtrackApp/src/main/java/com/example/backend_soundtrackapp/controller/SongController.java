package com.example.backend_soundtrackapp.controller;

import com.example.backend_soundtrackapp.model.Song;
import com.example.backend_soundtrackapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class SongController {

    @Autowired
    private SongService songService;

    // get all songs
    @GetMapping("/songs")
    public List<Song> getSongs() {
        return songService.getSongs();
    }
    // add a new song to the playlist
    @PostMapping("/songs/addnewsong")
    public void addNewSong(@RequestBody Song song) {
        songService.addSongs(song);
    }
    // using PutMapping ( new knowledge) to edit or update the song information
    @PutMapping("/songs/{id}/edit")
    public void updateSong(@PathVariable int id, @RequestBody Song song) {
        songService.updateSongs(song);
    }
    // DeleteMapping for deleting the song
    @DeleteMapping("/songs/{id}/delete")
    public void deleteSong(@PathVariable int id) {
        songService.deleteSongs(id);
    }

}
