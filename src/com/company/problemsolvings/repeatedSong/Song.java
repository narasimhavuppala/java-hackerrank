package com.company.problemsolvings.repeatedSong;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");

        if (nextSong.nextSong.name.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("shit");


        first.setNextSong(second);
        second.setNextSong(first);
        third.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
