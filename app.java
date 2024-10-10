import javax.swing.*;



public class app {
  public static void main(String[] args) throws Exception {
    int boardWidth = 600;
    int boardHeight = boardWidth;

    JFrame frame = new JFrame("Snake Dev");
    frame.setVisible(true);
    frame.setSize(boardWidth,boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    SnakeGame SnakeGame = new SnakeGame(boardWidth, boardHeight);
    frame.add(SnakeGame);
    frame.pack();
    SnakeGame.requestFocus();
    

    
  }



}
    

