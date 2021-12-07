package academy.learnprogramming;

import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Album album = new Album();
    public static List<Song> playlist = new ArrayList<>();
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

        album.addToPlaylist("22", playlist,2.4);
        album.addToPlaylist("Hello", playlist,4.0);
        album.addToPlaylist("Mercy", playlist,2.1);
        album.addToPlaylist("7 rings", playlist,1.5);

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
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    deleteSong(playlist);
                    break;
                case 7:
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
        System.out.println("4 - List songs");
        System.out.println("5 - Print actions");
        System.out.println("6 - Delete song");
        System.out.println("7 - Quit");
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

    public static void deleteSong(List<Song> playList){
        if(playList.size() >0) {
            listIterator.remove();
            if(listIterator.hasNext()) {
                System.out.println("Now playing " + listIterator.next());
            } else if(listIterator.hasPrevious()) {
                System.out.println("Now playing " + listIterator.previous());
            }
        }
    }

    private static void printList(List<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }

    /*Modify the playlist challenge to thet the Album class uses an inner class
    * Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    * The inner SongList class will use an ArrayList adn will provide a method to add a song.
    * It will also provide findSong() method which will be used by the containing Album class
    * to add songs to the playlist.
    * Neither the Song Class or the Main class would be changed.*/

}
