package it.epicode.be.Elementi;

import it.epicode.be.ElementoMultimediale.ElementoMultimediale;

public class Audio extends ElementoMultimediale {
    public Audio(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    public void play(){
        for(int i = 0; i < duration; i++){
           System.out.print("Title: " + title + "  Volume:" + "!".repeat(volume));
           System.out.println();
        }
    }
}

