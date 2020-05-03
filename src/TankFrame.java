import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Auther: WangLei
 * @Date: 2020/4/29 22:26
 * @Description:
 */
public class TankFrame extends Frame {
//    private int x = 100;
//    private int y = 100;
//    //private int SPEED = 10;   阿里 java 规范
//    private static final int SPEED = 10;

    //Tank mytank = new Tank(100,100,Dir.R);
      private Tank myTank;
      private Tank enermy;

    public  TankFrame(String tankWar){
        this.setTitle(tankWar);
        this.setLocation(400,100);
        this.setSize(700,600);
        //this.setVisible(true);
        //响应键盘 观察者设计模式
        this.addKeyListener(new TankkeyListener());
        myTank = new Tank(100,100,Dir.R);
        enermy = new Tank(200,200,Dir.L);
    }

    //自动调用的 显示窗口的时候自动初始化的 这里的g 是系统初始化的
    @Override
    public void paint(Graphics g) {
       // System.out.println("Paint");
        //系统初始化的时候画一个方块
        //g.fillRect(x,y,50,50);
        myTank.paint(g);
        //enermy.paint(g);
    }

    private class TankkeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
           myTank.keyPressed(e);
           //enermy.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTank.keyReleased(e);
            //enermy.keyReleased(e);
        }
    }

    //响应键盘需要的内部类  高内聚，低耦合



}
