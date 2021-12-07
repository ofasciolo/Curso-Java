package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private SongList songs;

    public Album() {
        this.songs = new SongList();
    }

    public boolean addToPlaylist(String title, List<Song> playlist, double duration){
        this.songs.addSong(new Song(title, duration));
        return this.songs.findSong(title) != null;
    }

    public void addSong(Song song){
        this.songs.addSong(song);
    }

    private class SongList{
        private List<Song> songList = new ArrayList<>();

        public List<Song> getSongList() {
            return songList;
        }

        public void addSong(Song song){
            if(!songList.contains(song)){
                songList.add(song);
            }
        }

        public Song findSong(String title){
            for (Song song: songList){
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
    }
}
