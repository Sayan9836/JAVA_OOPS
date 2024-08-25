public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song() {

    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return int return the duration
     */
    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "title=" + title + ",,," + " duration=" + duration;
    }

}
