package br.dev.andersongomes;

import java.util.List;
import java.util.Objects;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;
    private Long profileId;
    private String type;

    private int currentPosition = 0;
    private List<Profile> cache;

    public LinkedInIterator(LinkedIn linkedIn, Long profileId, String type) {
        this.linkedIn = linkedIn;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if(Objects.isNull(cache)){
            cache = linkedIn.socialGraphRequest(profileId, type);
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
