package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        ThirdPartyYouTubeClass aYouTubeService = new ThirdPartyYouTubeClass();
        CachedYouTubeClass aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
        YouTubeManager manager = new YouTubeManager(aYouTubeProxy);
        manager.reactOnUserInput();
    }
}