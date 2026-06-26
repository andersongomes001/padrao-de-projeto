package br.dev.andersongomes;

import java.util.List;
import java.util.Objects;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private Long profileId;
    private String type;

    private int currentPosition = 0;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, Long profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if(Objects.isNull(cache)){
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if(hasMore()){
            currentPosition++;
            return cache.get(currentPosition);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        if(currentPosition < cache.size()){
            return true;
        }
        return false;
    }
}
