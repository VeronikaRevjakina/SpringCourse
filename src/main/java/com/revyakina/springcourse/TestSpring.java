package com.revyakina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.print(MusicType.CLASSICAL));
//       musicPlayer.playMusic(MusicType.ROCK);
//        musicPlayer.playMusic();
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

//        Music firstMusic = context.getBean("rockMusic", Music.class);
//        Music secondMusic = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer rockMusicPlayer = new MusicPlayer(firstMusic);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(secondMusic);
//
//        rockMusicPlayer.playMusic();
//        classicalMusicPlayer.playMusic();
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer.toString());
//        System.out.println(secondMusicPlayer.toString());
////        firstMusicPlayer.playMusicList();
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
