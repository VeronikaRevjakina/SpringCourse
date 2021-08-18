package com.revyakina.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.revyakina.springcourse.MusicType.CLASSICAL;

@Component
public class MusicPlayer {
    private Music music;
    private Music rockMusic;

    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.music = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    //inversionOfControl
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(MusicType musicType){
        Random rand = new Random();
        String result = "";
        switch (musicType) {
            case CLASSICAL:
               result= music.getSongs().get(rand.nextInt(3));
               break;
            case ROCK:
                result = rockMusic.getSongs().get(rand.nextInt(3));
                break;
        }
        return "Playing: " + result;
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    public void playMusicList(){
        for (Music el : musicList) {
            System.out.println(el.getSong());
        }
    }
}
