package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles = new ArrayList<>();

    @Override
    public ProfileIterator createFriendsIterator(Long profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(Long profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public List<Profile> socialGraphRequest(Long profileId, String type) {
        return profiles.stream().filter(profile -> profile.getId().equals(profileId) && profile.getType().equalsIgnoreCase(type)).toList();
    }
}
