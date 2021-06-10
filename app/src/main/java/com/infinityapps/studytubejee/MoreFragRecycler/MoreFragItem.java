package com.infinityapps.studytubejee.MoreFragRecycler;


import android.graphics.drawable.Drawable;

public class MoreFragItem {
    //private int channelIcon;
    private String channel_Icon;
    private String channelName;
    private String channelId;
    private String channelWeb;
    private String channelApp;
    public MoreFragItem(String channelIcon, String channelName, String channelId,String channelWeb,String channelApp) {
        this.channel_Icon = channelIcon;
        this.channelName = channelName;
        this.channelId = channelId;
        this.channelWeb = channelWeb;
        this.channelApp = channelApp;
    }
    public String  getChannelIcon(){ return channel_Icon; }
    public String getChannelName(){
        return channelName;
    }
    public String getChannelId(){
        return channelId;
    }
    public String getChannelWeb(){return channelWeb;}
    public String getChannelApp(){return channelApp;}
    //Setting Up
    public void setChannelIcon(String channelIcon){
        this.channel_Icon = channelIcon;
    }
    public void setChannelName(String channelName){
        this.channelName = channelName;
    }
    public void setChannelId(String channelId){
        this.channelId = channelId;
    }
}
