package com.example.rocnikovaprace;

import java.util.HashMap;

public class Texts {
    HashMap<String, String> story;

    public Texts() {
        story = new HashMap<String, String>();
        story.put("Uvod1", "BLABLABLA1");
        story.put("Uvod2", "BLABLABLA2");
    }

    public void getStory (String name) {
       Mainpart.text.setText(story.get(name));


    }
}

