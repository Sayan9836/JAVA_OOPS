import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("album1", "sonuNigam");
        album.addSong("despacito", 6.5);
        album.addSong("thunderstrom", 4.2);
        album.addSong("tunetune", 5.7);
        album.addSong("saregamapa", 3.5);
        albums.add(album);

        album = new Album("album2", "Emiway");
        album.addSong("Leela", 3.6);
        album.addSong("raaz", 4.9);
        album.addSong("bulbul", 2.9);
        albums.add(album);

        LinkedList<Song> PlayList_1 = new LinkedList<>();
        albums.get(0).addToPlayList("thunderstrom", PlayList_1);
        albums.get(1).addToPlayList("raaz", PlayList_1);
        albums.get(0).addToPlayList("despacito", PlayList_1);

        PLAY(PlayList_1);

    }

    private static void PLAY(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No song is present in the playlist");
        } else {
            System.out.println("Now Playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("No song available,reach the end of the file");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("this is the first song");
                        forward = false;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing: " + listIterator.previous().toString());

                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing: " + listIterator.next().toString());
                        } else {
                            System.out.println("we have reach the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            if (listIterator.hasPrevious())
                                System.out.println("Now Playing: " + listIterator.previous().toString());
                            forward = false;

                        }
                    }
                    break;
                case 6:
                    printMenu();
                    break;

            }

        }
        sc.close();

    }

    private static void printMenu() {
        System.out.println("Available Options\n Press");
        System.out.println("0-- to quit\n" + "1-- to play next song\n" + "2-- to play prev song\n"
                + "3-- to Replay the current song\n" + "4-- to get the list of all songs\n"
                + "5-- delete current song\n" + "6-- get all the Availale Options");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
