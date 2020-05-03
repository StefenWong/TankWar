import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: WangLei
 * @Date: 2020/4/29 23:08
 * @Description:
 */
public class Tank {
    private int x, y;
    private boolean bL,bU,bR,bD;
    private Dir dir ;
    public static final int SPEED = 5;


    public Tank(int x, int y, Dir r) {
        this.x = x;
        this.y = y;
        this.dir = r;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 30, 30);
        move();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR=true;
                break;
            case KeyEvent.VK_DOWN:
                bD=true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            default:
                break;
        }
        setMainDir();
    }

    private  void setMainDir(){
        //什么剑都没按，就是停止
        if(!bD && !bL && !bR && !bU){
            dir = Dir.STOP;
        }
        //只按了上，就是往上
        if(bD && !bL && !bR && !bU){
            dir = Dir.D;
        }
        if(!bD && bL && !bR && !bU){
            dir = Dir.L;
        }
        if(!bD && !bL && bR && !bU){
            dir = Dir.R;
        }
        if(!bD && !bL && !bR && bU){
            dir = Dir.U;
        }
    }

    private void move() {
        switch (dir) {
            case L:
                x -= SPEED;
                break;
            case U:
                y -= SPEED;
                break;
            case R:
                x += SPEED;
                break;
            case D:
                y += SPEED;
                break;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            default:
                break;
        }
        setMainDir();
    }
}
