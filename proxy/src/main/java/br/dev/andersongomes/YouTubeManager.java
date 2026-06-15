package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;

public class YouTubeManager {
    private ThirdPartyYouTubeLib service;
    private Video info;
    private List<Video> list = new ArrayList<>();

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    void renderVideoPage(long id){
        info = service.getVideoInfo(id);
        System.out.println(info.toString());
    }

    void renderListPanel(){
        list = service.listVideos();
        System.out.println(list.toString());
    }

    void reactOnUserInput(long id) {
        renderVideoPage(id);
        renderListPanel();
    }

    void downloadVideo(long id){
        service.downloadVideo(id);
    }
}
