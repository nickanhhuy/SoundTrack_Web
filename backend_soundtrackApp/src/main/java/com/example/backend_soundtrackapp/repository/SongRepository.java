package com.example.backend_soundtrackapp.repository;

import com.example.backend_soundtrackapp.model.Song;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
}
