package it.epicode.be.Elementi;

import it.epicode.be.ElementoMultimediale.ElementoMultimediale;

public class Video extends ElementoMultimediale {
    public Video(String title, int duration, int volume, int luminosita) {
        super(title, duration, volume, luminosita);
    }

    public void play(){
        for(int i = 0; i < duration; i++){
            System.out.print("Title:" + title + "  Volume:" + "!".repeat(volume) + "  Luminosità:" + "*".repeat(luminosita) );
            System.out.println();
        }
    }


}
