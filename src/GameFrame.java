import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
     this.add(new GamePanel());
     this.setSize(1000,600);
     ImageIcon image = new ImageIcon("snake.png");
     this.setIconImage(image.getImage());
     this.setTitle("Snake Game");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
    }

}
