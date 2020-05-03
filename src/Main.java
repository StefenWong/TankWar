import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: WangLei
 * @Date: 2020/4/29 22:26
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
//        Frame f = new Frame("tank watr");
//        f.setLocation(500,300);
//        f.setSize(600,600);
//        f.setVisible(true);
        TankFrame tankFrame = new TankFrame("TankWar");
        tankFrame.setVisible(true);

        for (;;) {
            try {
                //TimeUnit.MICROSECONDS.sleep(10000);
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tankFrame.repaint();
        }
    }
}
