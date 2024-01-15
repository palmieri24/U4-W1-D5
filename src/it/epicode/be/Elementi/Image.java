package it.epicode.be.Elementi;

import it.epicode.be.ElementoMultimediale.ElementoMultimediale;

public class Image extends ElementoMultimediale {

    public Image(String title, int luminosita) {
        super(title, luminosita);
    }

    public void show(){

        for(int i=0; i < getLuminosita(); i++){
            System.out.print("Title:" + title + "  Luminosità" + "*".repeat(luminosita));
            System.out.println();
        }
    }

}
