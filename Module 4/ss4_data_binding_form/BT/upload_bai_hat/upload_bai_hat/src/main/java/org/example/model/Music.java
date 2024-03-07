package org.example.model;

public class Music {
    private String name;
    private String artist;
    private String kindOfMusic;
    private String link;


    public Music(String name, String artist, String kindOfMusic, String link) {
        this.name = name;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Music() {
    }

}
