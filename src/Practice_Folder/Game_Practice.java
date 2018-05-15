package Practice_Folder;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author Kiwiocia
 */
public class Game_Practice extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Boi";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Color purple = new Color(174, 37, 237);
    int pacmanY = 500;
    int pacmanX = 500;
    int pacmanAngle = 135;
    int pacmanRotate = 270;
    boolean pacmanOpen = false;
    boolean pacmanClose = true;
    int mouseX = 0;
    int mouseY = 0;
    boolean moveUp = false;
    boolean moveDown = true;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Game_Practice() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);


        g.setColor(Color.magenta);

        // GAME DRAWING GOES HERE
        //cutsom colours
        g.setColor(purple);
        //create a background?
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //Rectangle, (x,y, Width, Height
        g.fillRect(0, 0, 100, 200);

        g.setColor(Color.cyan);

        g.fillOval(0, 0, mouseX, mouseY);

        int[] triangleX = {550, 562, 560};
        int[] triangleY = {400, 500, 500};
        //array of x points, array of y points and number of points
        g.fillPolygon(triangleX, triangleY, 3);

        //arch drawings
        g.setColor(Color.yellow);
        //(x, y width height, angle, rotation)
        g.fillArc(500, pacmanY, 100, 100, pacmanAngle, pacmanRotate);

        g.setColor(Color.black);
        //(x,y,x,y)
        g.drawLine(100, 100, 500, 500);

        // GAME DRAWING ENDS HERE


    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        pacmanY = pacmanY - 5;
        //when pacman leaves the screen

        if (pacmanY < -100) {
            pacmanY = HEIGHT;
        }
        if (pacmanX < -100) {
            pacmanX = WIDTH;
        }
        if (pacmanAngle <= 90) {
            pacmanClose = false;
        }
        if (pacmanAngle >= 140) {
            pacmanClose = true;
        }
        if (pacmanClose) {
            pacmanAngle = pacmanAngle - 10;
            pacmanRotate = pacmanRotate + 20;
        } else {
            pacmanAngle = pacmanAngle + 10;
            pacmanRotate = pacmanRotate - 20;
        }

        if (moveUp) {
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            //which key is being pressed
            if (keyCode == KeyEvent.VK_W) {
                moveUp = true;
            }
            if (keyCode == KeyEvent.VK_S) {
                moveDown = true;
            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            //which key is being pressed
            if (keyCode == KeyEvent.VK_W) {
                moveUp = false;
            }
            if (keyCode == KeyEvent.VK_S) {
                moveDown = false;
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Game_Practice game = new Game_Practice();
    }
}
