package it.epicode.be.ElementoMultimediale;

import it.epicode.be.Interfaces.Luminosita;
import it.epicode.be.Interfaces.Volume;

public abstract class  ElementoMultimediale implements Volume, Luminosita {

  public String title;
  public int duration;
  public int volume;
  public int luminosita;


  //Costruttore Video
  public ElementoMultimediale(String title, int duration, int volume, int luminosita) {
   this.title = title;
   this.duration = duration;
   this.volume = volume;
   this.luminosita = luminosita;
  }

  //Costruttore Audio
  public ElementoMultimediale(String title, int duration, int volume) {
   this.title = title;
   this.duration = duration;
   this.volume = volume;
  }

  //Costruttore Image
  public ElementoMultimediale(String title, int luminosita){
   this.title = title;
   this.luminosita = luminosita;
  }


  //GETTER TITLE
  public String getTitle(){
      return title;
  }

  //SETTER TITLE
  public void setTitle(String title){
      this.title = title;
  }


  //GETTER DURATION
    public int getDuration(){
      return duration;
    }

  //SETTER DURATION
  public void setDuration(int duration){
      this.duration = duration;
  }


  //GETTER VOLUME
  public int getVolume(){
  return volume;
}

//SETTER VOLUME
public void setVolume(int volume){
      this.volume = volume;

}

  @Override
  public void abbassaVolume() {
      if (getVolume() == 0) {
          System.out.println("Silenzioso");
      } else {
          setVolume(getVolume() - 1);
          System.out.println("Volume abbassato");
      }
  }

@Override
  public void alzaVolume() {
    if (getVolume() == 100) {
        System.out.println("Volume al massimo");
    } else {
        System.out.println("Volume alzato");
        setVolume(getVolume() + 1);
    }}



    //GETTER LUMINOSITA'
    public int getLuminosita(){
      return luminosita;
    }

    //SETTER LUMINOSITA'
    public void setLuminosita(int luminosita){
      this.luminosita = luminosita;
    }


    @Override
    public void abbassaLuminosita(){
        if (getLuminosita() == 0) {
            System.out.println("Luminosità al minimo");
        } else {
            setLuminosita(getLuminosita() - 1);
            System.out.println("Luminosità abbassata");
        }
    }


    @Override
    public void alzaLuminosita(){
        if (getLuminosita() == 100) {
            System.out.println("Luminosità al massimo");
        } else {
            setLuminosita(getLuminosita() + 1);
            System.out.println("Luminosità alzata");
        }
    }

}





