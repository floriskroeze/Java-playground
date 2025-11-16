import java.util.ArrayList;
import java.util.LinkedList;

import java.util.NoSuchElementException;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle() == title) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        trackNumber = trackNumber - 1;
        if (trackNumber < 0 || trackNumber > this.songs.size()) {
            return false;
        }

        Song song = songs.get(trackNumber);

        if (song == null) {
            return false;
        }

        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);

        if (song == null) {
            return false;
        }

        playlist.add(song);
        return true;
    }
}