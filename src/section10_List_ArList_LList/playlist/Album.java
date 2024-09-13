package section10_List_ArList_LList.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String  name;
    private String  artist;
    private ArrayList<Song> songs;

    // Constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (this.findSong(songTitle) == null) {
            songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle){
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber < 1 || trackNumber > songs.size()) {
            return false;
        }
        Song song = songs.get(trackNumber-1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
