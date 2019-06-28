package schultz.dustin.io;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledDemo {

    @Scheduled(fixedDelay = 2000)
    void testScheduled() {
        int b = 1;
        System.out.println("loop restarted");
        while (b < 5) {
            int a = 1;
            System.out.println("starting to work");
            try {
                Thread.sleep(5000);
                a++;
                b++;
                System.out.println("finished");
                if (a > 1) {
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
