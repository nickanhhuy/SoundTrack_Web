package com.example.backend_soundtrackapp.service;

import com.example.backend_soundtrackapp.model.Song;
import com.example.backend_soundtrackapp.model.Playlist;
import com.example.backend_soundtrackapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> getSongs() {
        return songRepository.findAll();
    }
    public void addSongs(Song song){
        songRepository.save(song);
    }

    public void updateSongs(Song song){
        songRepository.save(song);
    }
    public void deleteSongs(Integer id) {
        songRepository.deleteById(id);
    }

}
