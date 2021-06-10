package com.infinityapps.studytubejee.Adapter;

public class PlaylistItemAdapter {
    private String playlistTitle;
    private String thumbnail_url;
    private String playlistId;

    public PlaylistItemAdapter(String title, String thumbnail_url, String playlistId) {
        this.playlistTitle = title;
        this.thumbnail_url= thumbnail_url;
        this.playlistId = playlistId;
    }

    public String getTitle() {
        return playlistTitle;
    }
    public String getPlaylistThumbUrl() { return thumbnail_url; }
    public String getPlaylistId() { return playlistId; }

}
