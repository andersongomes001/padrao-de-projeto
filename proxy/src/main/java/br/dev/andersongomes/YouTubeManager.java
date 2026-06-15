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

    void reactOnUserInput() {
        renderVideoPage(1);
        renderListPanel();
    }
}
