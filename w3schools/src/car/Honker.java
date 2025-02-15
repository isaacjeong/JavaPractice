package car;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Honker {
    private Clip audioClip;
    private AudioInputStream audioInputStream;

    public void play(String filePath, String carName) {
        try {
            // Create an audio input stream from the audio file
            File audioFile = new File(filePath);
            audioInputStream = AudioSystem.getAudioInputStream(audioFile);

            // Get a clip resource
            audioClip = AudioSystem.getClip();

            // Open the audio clip and load samples from the audio input stream
            audioClip.open(audioInputStream);

            // Start playing audio
            audioClip.start();

            System.out.println(carName + " is honking.");

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
        }
    }

    public void close() {
        if (audioClip != null) {
            audioClip.close();
        }

        if (audioInputStream != null) {
            try {
                audioInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        Honker player = new Honker();
        player.play("/Users/ij/Downloads/mixkit-clown-horn-at-circus-715.wav", "my car");
//        player.play("automobile-honk-2-170424.mp3");

        // Let it play for a few seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop and clean up
        player.stop();
        player.close();
    }
}