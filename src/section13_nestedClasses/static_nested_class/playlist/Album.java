package section13_nestedClasses.static_nested_class.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = songs.findSong(songTitle);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }


    private class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song addingSong) {
            Song song = findSong(addingSong.getTitle());
            if (song == null) {
                songs.add(addingSong);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber < 1 || trackNumber > songs.size()) {
                System.out.println("This album does not have a track " + trackNumber);
                return null;
            }
            return songs.get(trackNumber - 1);
        }
    }
}
