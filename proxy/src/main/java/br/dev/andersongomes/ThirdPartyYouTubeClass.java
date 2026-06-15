package br.dev.andersongomes;

import java.util.List;
import java.util.stream.Collectors;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    private List<Video> videos = List.of(
            new Video(1,"Midnight Drive", "Music Midnight Drive", false),
            new Video(2,"Electric Hearts", "Music Electric Hearts", true),
            new Video(3,"Neon Horizon", "Music Neon Horizon", false),
            new Video(4,"Chasing Shadows", "Music Chasing Shadows", true),
            new Video(5,"Lost in Tokyo", "Music Lost in Tokyo", false),
            new Video(6,"Velvet Sky", "Music Velvet Sky", true),
            new Video(7,"Echoes of You", "Music Echoes of You", false));

    @Override
    public List<Video> listVideos() {
        return this.videos;
    }

    @Override
    public Video getVideoInfo(long id) {
        return this.videos.stream().filter(filter -> filter.id() == id).findFirst().orElse(null);
    }

    @Override
    public void downloadVideo(long id) {
        this.videos = this.videos.stream().map(video -> {
            if(video.id() == id && !video.downloaded()){
                return new Video(video.id(),video.nome(), video.info(), true);
            }
            return video;
        }).collect(Collectors.toList());
    }
}
