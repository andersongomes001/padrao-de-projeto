package br.dev.andersongomes;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(Long profileId);
    ProfileIterator createCoworkersIterator(Long profileId);
}
