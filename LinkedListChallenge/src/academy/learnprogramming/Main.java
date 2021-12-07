package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Album album = new Album();
    public static LinkedList<Song> playlist = new LinkedList<Song>();
    public static ListIterator<Song> listIterator;
    public static void main(String[] args) {
        /*Create a program that implements a playlist for songs
        *Create a Song class having Title and Duration for a song.
        *The program will have an Album class containing a list of songs.
        *The albums will be stored in an ArrayList
        *Songs from different albums can be added to the playlist and will appear in the list in the order
        *they are added.
        *Once the songs have been added to the playlist, create a menu of options to:-
        *Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        *List the songs in the playlist
        *A song must exist in an album before it can be added to the playlist (so you can only play songs that
        *you own).
        *Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        *started tracking the direction we were going.
        *As an optional extra, provide an option to remove the current song from the playlist
        *(hint: listiterator.remove()*/

        Song song1 = new Song("22", 3.45);
        Song song2 = new Song("Hello", 2.59);
        Song song3 = new Song("Mercy", 3.23);
        Song song4 = new Song("7 rings", 3.25);

        album.addSong(song1);
        album.addSong(song2);
        album.addSong(song3);
        album.addSong(song4);

        album.addToPlaylist("22", playlist);
        album.addToPlaylist("Hello", playlist);
        album.addToPlaylist("Mercy", playlist);
        album.addToPlaylist("7 rings", playlist);

        printMenu();
        boolean quit = false;
        listIterator = playlist.listIterator();
        while(!quit){
            System.out.println("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    addSong();
                case 1:
                    nextSong();
                    break;
                case 2:
                    previousSong();
                    break;
                case 3:
                    replaySong();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("These are the options: ");
        System.out.println("0 - Add song");
        System.out.println("1 - Go to the next song");
        System.out.println("2 - Go to the previous song");
        System.out.println("3 - Replay song");
        System.out.println("4 - Quit");
    }

    public static void addSong(){
        System.out.println("Song name: ");
        String name = scanner.nextLine();
        System.out.println("Duration time: ");
        double time = scanner.nextDouble();
        scanner.nextLine();

        Song song = new Song(name, time);
        album.addSong(song);
    }

    public static void nextSong(){
        if(listIterator.hasNext()){
            System.out.println(listIterator.next().getTitle());
        }else{
            System.out.println("This is the last song.");
        }
    }

    public static void previousSong(){
        if (listIterator.hasPrevious()){
            System.out.println(listIterator.previous().getTitle());
        }else{
            System.out.println("This is the first song.");
        }
    }

    public static void replaySong(){
        System.out.println("You are replaying the song");
    }
}
