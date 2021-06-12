package com.victorsully79.songr;
import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    String imageURL;
    int songCount;
    int length;

    @OneToMany(mappedBy = "albumTitle", cascade = CascadeType.ALL)
    List<MusicManager> musicManager;

    public Album(String title, String artist, String imageURL, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.imageURL = imageURL;
        this.songCount = songCount;
        this.length = length;

    }

    public Album (){

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }


    public int getLength() {
        return length;
    }

    public String getImageURL() {
        return imageURL;
    }




}
