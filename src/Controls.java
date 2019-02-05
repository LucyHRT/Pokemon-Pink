import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls extends JPanel implements KeyListener {
    Player player = new Player();
    boolean UP,DOWN,LEFT,RIGHT = false;

    public void movement(){
        if(UP == true){
            player.y = player.y -10;


        }
        else if(DOWN == true){
            player.y = player.y +10;

        }
        else if(LEFT == true){
            player.x = player.x - 10;
        }
        else if(RIGHT == true){
            player.x = player.x + 10;

        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        movement();
        if(keyCode == e.VK_D){
            RIGHT = true;

        }
        else if(keyCode==e.VK_A){
            LEFT = true;
        }
        else if (keyCode==e.VK_W){
            UP = true;

        }
        else if(keyCode==e.VK_S){
            DOWN = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == e.VK_D){
            RIGHT = false;
        }
        else if(keyCode==e.VK_A){
            LEFT = false;

        }
        else if (keyCode==e.VK_W){
            UP =false;

        }
        else if(keyCode==e.VK_S){
            DOWN = false;
        }
    }
}


