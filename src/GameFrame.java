import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
     this.add(new GamePanel());
     this.setSize(1000,600);
     this.setTitle("Snake Game");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
    }
}
