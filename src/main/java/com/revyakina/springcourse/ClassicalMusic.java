package com.revyakina.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs;

    public ClassicalMusic (){
        this.songs = Arrays.asList("Lake", "Tchelkunchik", "Romeo and Juliet");
    }

    public List<String> getSongs() {
        return songs;
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
