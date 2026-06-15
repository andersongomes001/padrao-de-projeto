package br.dev.andersongomes;

import java.util.*;

public class CachedYouTubeClass  implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib service;
    private List<Video> listCache = new ArrayList<>();
    private Map<Long, Video> videoCache = new HashMap<>();
    private boolean needReset = false;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideos() {
        if(listCache.isEmpty() || needReset){
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public Video getVideoInfo(long id) {
        if(!videoCache.containsKey(id) || needReset){
            videoCache.put(id, service.getVideoInfo(id));
        }
        return videoCache.get(id);
    }

    @Override
    public void downloadVideo(long id) {
        if(!downloadExists(id) || needReset){
            service.downloadVideo(id);
            if(videoCache.containsKey(id)){
                videoCache.compute(id, (k, cached) -> new Video(cached.id(), cached.nome(), cached.info(), true));
            }
        }
    }

    private boolean downloadExists(long id){
        return listCache.stream().anyMatch(video -> video.id() == id && video.downloaded());
    }
}
