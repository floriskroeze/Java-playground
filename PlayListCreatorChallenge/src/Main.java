import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album rebelInYou = new Album("Rebel in you", "Yellow Pearl");
        rebelInYou.addSong("For you and me", 3.15);

        LinkedList<Song> playlist = new LinkedList<>();

        rebelInYou.addToPlayList(0, playlist);

        System.out.println(playlist);
    }
}
