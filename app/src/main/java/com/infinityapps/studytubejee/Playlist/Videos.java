package com.infinityapps.studytubejee.Playlist;

public class Videos {

    private String title;
    private String thumbnail_url;
    private String videoID;

    public Videos(String title, String thumbnail_url, String videoId) {
        this.title = title;
        this.thumbnail_url= thumbnail_url;
        this.videoID = videoId;
    }

    public String getTitle() {
        return title;
    }
    public String getThumbnailUrl() {
        return thumbnail_url;
    }
    public String getVideoID() {
        return videoID;
    }


}
