import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

/**
 * Created by 239803 on 1/19/2017.
 */
public class driver {
    public static void main(String [] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Thread t = new Thread();

        graphics testCase = new graphics();
        (new Thread(testCase)).start();
        audioInputStream testCase2 = new audioInputStream();


           //(new String(testCase2)).start();

    }

    }


