package com.revyakina.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements  Music {
    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        this.songs = Arrays.asList("We will rock you", "I love rock'n'roll", "Show must go on");
    }

    public List<String> getSongs() {
        return songs;
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
