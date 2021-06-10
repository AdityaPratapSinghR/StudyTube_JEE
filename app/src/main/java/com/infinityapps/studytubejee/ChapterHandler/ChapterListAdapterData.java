package com.infinityapps.studytubejee.ChapterHandler;

public class ChapterListAdapterData {
    private String chapterNo;
    private String chapterName;
    private String playlistId;
    public ChapterListAdapterData(String chapterNo,String chapterName, String playlistId) {
        this.chapterNo = chapterNo;
        this.chapterName = chapterName;
        this.playlistId = playlistId;
    }
    public String getChapterNo(){
        return chapterNo;
    }
    public String getChapterName(){
        return chapterName;
    }
    public String getPlaylistId(){
        return playlistId;
    }
    //Setting Up
    public void setChapterNo(String chapterNo){
        this.chapterNo = chapterNo;
    }
    public void setChapterName(String chapterName){
        this.chapterName = chapterName;
    }
    public void setPlaylistId(String playlistId){
        this.playlistId = playlistId;
    }

}
