import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    Player player = new Player();

    public void paint(Graphics g){
        paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(player.x,player.y,20,20);
        repaint();
        if(player.x >= 50){System.exit(20);}
    }
}
