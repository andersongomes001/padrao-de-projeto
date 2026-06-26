package br.dev.andersongomes;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;
    private String working;

    public Application(String working) {
        this.working = working;
    }

    public void config(){
        if(working.equalsIgnoreCase("facebook")){
            this.network = new Facebook();
        }
        if(working.equalsIgnoreCase("linkedin")){
            this.network = new LinkedIn();
        }
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile){
        ProfileIterator  iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile){
        ProfileIterator  iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
