package com.victorsully79.songr;


public class Album {
    String title;
    String artist;
    String imageURL;
    int songCount;
    int length;

    public Album(String title, String artist, String imageURL, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.imageURL = imageURL;
        this.songCount = songCount;
        this.length = length;

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
