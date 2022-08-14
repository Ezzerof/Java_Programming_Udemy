package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("The album does not have a track: " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist) {
        Song song = findSong(titleOfSong);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("The song " + titleOfSong + " is not in the album");
        return false;
    }
}
