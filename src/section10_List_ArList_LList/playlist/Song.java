package section10_List_ArList_LList.playlist;

public class Song {
    private String title;
    private double duration;

    // Constructor
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
