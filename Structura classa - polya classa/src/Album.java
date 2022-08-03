public class Album {
    public String title;
    public int releaseYear;
    public Singer singer;

    public Album (String title, int releaseYear, Singer singer) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.singer = singer;
    }
    public String toString() { return "Альбом " + title + " год выхода " + releaseYear; }

    public void addAlbum( String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.singer = singer;
    }

    //public String getAlbum() { return "Альбомы певца :" + Singer.this.singer; }

}
