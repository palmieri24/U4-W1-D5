import it.epicode.be.Elementi.Audio;
import it.epicode.be.Elementi.Video;
import it.epicode.be.Elementi.Image;
import it.epicode.be.ElementoMultimediale.ElementoMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Progetto: Player Multimediale");
        Main Mediaplayer = new Main();
        Mediaplayer.start();
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementoMultimediale = new ElementoMultimediale[3];

        for (int i = 0; i < elementoMultimediale.length; i++) {
            System.out.println("Vuoi inserire un audio, un video o un'immagine?");
            String elemento = scanner.nextLine();

                switch (elemento.toLowerCase()) {
                    case "audio":
                        System.out.println("Qual è il titolo dell'audio?");
                        String titleAudio = scanner.nextLine();

                        System.out.println("Qual è la durata dell'audio?");
                        int durationAudio = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Scegli un valore da 0 a 10 per impostare il volume:");
                        int volumeAudio = scanner.nextInt();
                        scanner.nextLine();


                        elementoMultimediale[i] = new Audio(titleAudio, durationAudio, volumeAudio);
                        break;

                    case "video":
                        System.out.println("Qual è il nome del video?");
                        String titleVideo = scanner.nextLine();

                        System.out.println("Qual è la durata del video?");
                        int durationVideo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Scegli un valore da 0 a 10 per impostare il volume:");
                        int volumeVideo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Scegli un valore da 0 a 10 per impostare la luminosità:");
                        int luminositaVideo = scanner.nextInt();
                        scanner.nextLine();

                        elementoMultimediale[i] = new Video(titleVideo, durationVideo, volumeVideo, luminositaVideo);
                        break;

                    case "immagine":
                        System.out.println("Qual è il titolo dell'immagine");
                        String titleImage = scanner.nextLine();

                        System.out.println("Scegli un valore da 0 a 10 per impostare la luminosità:");
                        int luminositaImage = scanner.nextInt();
                        scanner.nextLine();

                        elementoMultimediale[i] = new Image(titleImage, luminositaImage);
                        break;

                    default:
                        System.out.println("Valore inserito non valido");
                        i--;
                        break;


                }

            while (true) {
                System.out.println("Quale elemento vuoi riprodurre? (scegli da 1 a 3, 0 per uscire)");
                int elementoScelto = scanner.nextInt();
                scanner.nextLine();

                if (elementoScelto == 0) {
                    System.out.println("Exit");
                    scanner.close();
                    break;
                } else if (elementoScelto >= 1 && elementoScelto <= 3) {
                    if (elementoMultimediale[elementoScelto - 1] instanceof Audio) {
                        ((Audio) elementoMultimediale[elementoScelto - 1]).play();
                    } else if (elementoMultimediale[elementoScelto - 1] instanceof Video) {
                        ((Video) elementoMultimediale[elementoScelto - 1]).play();
                    } else if (elementoMultimediale[elementoScelto - 1] instanceof Image) {
                        ((Image) elementoMultimediale[elementoScelto - 1]).show();
                    }
                } else {
                    System.out.println("Scelta non valida. Riprova.");
                }
            }
        }
        }
        }
