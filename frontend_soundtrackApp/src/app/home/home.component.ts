import { Component } from '@angular/core';
import { SongService } from '../song.service';
import { Playlist } from '../song.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  playlists: Playlist[] = [];

  constructor(private songService: SongService) {
    this.songService.getPlaylistByGenre().subscribe(data => {
      console.log('Playlists:', data);
      this.playlists = data;
    });
  }
}
