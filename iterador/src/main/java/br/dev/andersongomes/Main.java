package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        //achei esse exemplo muito ruim

        Profile profile = new Profile(1L, "email1@localhost.com", "friends");
        Application application = new Application("facebook");
        application.config();
        application.sendSpamToFriends(profile);
    }
}