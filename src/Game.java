import javax.swing.*;

public class Game extends JFrame{
    Screen screen = new Screen();
    Player player = new Player();
    Controls controls = new Controls();
    public static void main(String[] args){
        System.out.println("Loading....");
        Game game =  new Game();
        game.Screen();

    }
    public void Screen(){
        JFrame game = new JFrame();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setSize(500,500);
        game.setLocationRelativeTo(null);
        game.setResizable(false);
        game.getContentPane().add(screen);
        game.addKeyListener(controls);
    }

}
