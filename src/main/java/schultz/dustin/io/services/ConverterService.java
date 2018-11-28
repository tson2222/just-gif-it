package schultz.dustin.io.services;

import com.madgag.gif.fmsware.AnimatedGifEncoder;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.springframework.stereotype.Service;
import sun.plugin2.jvm.CircularByteBuffer;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ConverterService {

    public void toAnimatedGif(FFmpegFrameGrabber frameGrabber, AnimatedGifEncoder
            gifEncoder, int start, int end, int speed) throws FrameGrabber.Exception {
        long startFrame = Math.round(start * frameGrabber.getFrameRate());
        long endFrame = Math.round(end * frameGrabber.getFrameRate());

        Java2DFrameConverter frameConverter = new Java2DFrameConverter();

        for (long i = startFrame; i < endFrame; i++) {

            if (i % speed == 0) {

                // Bug if frameNumber is set to 0
                if (i > 0) {
                    frameGrabber.setFrameNumber((int) i);
                }

                BufferedImage bufferedImage = frameConverter
                        .convert(frameGrabber.grabImage());
                gifEncoder.addFrame(bufferedImage);
            }

        }

        frameGrabber.stop();
        gifEncoder.finish();
    }

    public static void test(){
        List list = new ArrayList<>();
        list.add(127);
        list.add(2);
        list.add(4);
        list.add(2);
        int x = (int) list.get(0);
        System.out.println((byte)x);
    }

    public static void main(String[] args) throws IOException {
        CircularByteBuffer buffer = new CircularByteBuffer(3);
        byte[] b = new byte[]{1, 2, 3, 4, 11, 22, 33};
        buffer.write(b,1);
        System.out.println(Arrays.toString(b));
        test();
        Integer i = 5; //example
        Long l = Long.valueOf(i.longValue());
        System.out.println(l);
    }
}
