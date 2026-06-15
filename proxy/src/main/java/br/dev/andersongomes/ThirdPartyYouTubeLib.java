package br.dev.andersongomes;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    public List<Video> listVideos();
    public Video getVideoInfo(long id);
    public void downloadVideo(long id);
}
