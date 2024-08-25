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

    public Album() {

    }

    public Song findSong(String title) {
        for (Song checksong : songs) {
            if (checksong.getTitle().equals(title)) {
                return checksong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            //System.out.println(title + "succesfully added to the list");
            return true;
        } else {
           // System.out.println(title + "already present in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index > 0 && index <= songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
       // System.out.println("this album does not have song with trackNumber: " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        for (Song checksong : songs) {
            if (checksong.getTitle().equals(title)) {
                playList.add(checksong);
                return true;
            }
        }
       // System.out.println("there is no such song present in the album");
        return false;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return ArrayList<Song> return the songs
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

}