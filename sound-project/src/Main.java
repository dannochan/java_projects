import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        Scanner scanner = new Scanner(System.in);

        // read the file
        File file = new File("src/Fly.wav");

        // read a audio file and return an audio stream
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        // declare a clip
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response ="";

        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice");

            response=scanner.next();
            response = response.toUpperCase();

            switch(response){
                case ("P"):
                    clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default:
                    System.out.println("Not valid response");
            }
        }
        System.out.println("Byeeeee!");
    }
}