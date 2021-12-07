package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private ArrayList<Song> songs = new ArrayList<Song>();

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    private Song findSong(String title){
        for (Song song: songs) {
            if(song.getTitle().equals(title)){
                return song;
            }
        }

        return null;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("Could not find the song");
        return false;
    }
}
