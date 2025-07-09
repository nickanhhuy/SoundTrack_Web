import { Injectable } from '@angular/core';
import { HttpClient, } from '@angular/common/http';
import { Observable } from 'rxjs';

// Interface model for a song and a playlist
export interface Song {
  id: number;
  title: string;
  artist: string;
  genre: string;
}
export interface Playlist {
  title: string;
  tracks: Song[];
}

// implement the service method caching the API request from backend
@Injectable({
  providedIn: 'root'
})
export class SongService {
  private apiURL = 'http://localhost:8080/api'; 
  http: HttpClient;
  constructor(http: HttpClient) {
    this.http = http;
  }
  getPlaylistByGenre(): Observable<Playlist[]> {
    return this.http.get<Playlist[]>(`${this.apiURL}/playlists/genres`);
  }
}
