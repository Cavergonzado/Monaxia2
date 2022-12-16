package com.example.monaxia1;

public class MusicFiles {
    private String path;
    private String title;
    private String artist;
    private String duration;

    public MusicFiles(String path, String title, String artist, String album, String duration) {
        this.path = path;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public String getDuration() {
        return duration;
    }

}
