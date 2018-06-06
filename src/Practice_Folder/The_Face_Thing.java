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
public class The_Face_Thing extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Face Guy";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    // GAME VARIABLES END HERE    
    Color skin = new Color(229, 186, 107);
    Color glasses = new Color(4, 109, 93);
    Color rims = new Color(225, 225, 225);
    Color hair = new Color(45, 41, 38);
    Color luster = new Color(250, 250, 250);
    Color eyes = new Color(61, 34, 1);
    Color luster2 = new Color(200, 200, 200);
    int brow1YPos = 220;
    boolean eyebrowUp = true;
    boolean eyebrowDown = false;
    int luster1aX = 435;
    int luster1aY = 250;
    int luster2aX = 235;
    int luster2aY = 250;
    boolean lusterMove = true;

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public The_Face_Thing() {
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
        //make a temporary location for the glasses while i make the left eye

        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE    \

        //make a background
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 600);
        //base of the face part 1
        g.setColor(skin);
        g.fillOval(190, 62, 400, 475);
        //remove part of the face to make a better shape
        g.setColor(Color.white);
        g.fillOval(190, 20, 300, 300);
        //make the hair
        g.setColor(hair);
        g.fillOval(490, 135, 100, 150);
        g.fillOval(465, 110, 110, 135);
        g.fillOval(450, 100, 115, 140);
        g.fillOval(255, 35, 300, 175);
        g.fillOval(220, 130, 100, 225);
        //place the face over the circle to givethe hair a better shape
        g.setColor(skin);
        g.fillOval(200, 100, 350, 460);
        //eyebrows
        g.setColor(hair);
        int[] eyebrow1X = {370, 380, 470, 500};
        int[] eyebrow1Y = {brow1YPos, brow1YPos - 20, brow1YPos - 20, brow1YPos};
        g.fillPolygon(eyebrow1X, eyebrow1Y, 4);
        int[] eyebrow2X = {290, 280, 210, 210};
        int[] eyebrow2Y = {220, 200, 200, 220};
        g.fillPolygon(eyebrow2X, eyebrow2Y, 4);
        //ear
        g.setColor(skin);
        g.fillOval(540, 220, 75, 125);
        //make the bruidge of the glasses under the eyes
        g.setColor(rims);
        g.fillOval(250, 200, 160, 160);
        g.setColor(skin);
        g.fillOval(300, 220, 60, 30);
        g.fillRect(314, 245, 33, 100);
        g.fillOval(230, 260, 200, 150);
        //start of glasses
        g.setColor(rims);
        g.fillOval(150, 195, 160, 160);
        g.fillOval(350, 195, 160, 160);
        int[] sidesX = {499, 499, 550, 550};
        int[] sidesY = {273, 265, 235, 243};
        g.fillPolygon(sidesX, sidesY, 4);
        //colour of the glasses, and lens filled in
        g.setColor(glasses);
        g.fillOval(155, 200, 150, 150);
        g.fillOval(355, 200, 150, 150);
        //shine of the glasses added
        g.setColor(luster);
        //left eye shine
        int[] rimsX = {435, 435, 475, 475};
        int[] rimsY = {250, 230, 270, 290};
        g.fillPolygon(rimsX, rimsY, 4);
        //right eye shine
        int[] shineX = {235, 235, 275, 275};
        int[] shineY = {250, 230, 270, 290};
        g.fillPolygon(shineX, shineY, 4);
        //lens shine in both eyes
        g.setColor(luster2);
        //left
        int[] luster1X = {luster1aX, luster1aX, luster1aX + 10, luster1aX + 10};
        int[] luster1Y = {luster1aY, luster1aY - 20, luster1aY - 10, luster1aY + 10};
        g.fillPolygon(luster1X, luster1Y, 4);
        //right
        int[] luster2X = {luster2aX, luster2aX, luster2aX + 10, luster2aX + 10};
        int[] luster2Y = {luster2aY, luster2aY - 20, luster2aY - 10, luster2aY + 10};
        g.fillPolygon(luster2X, luster2Y, 4);
        //end of glasses




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
        if (brow1YPos <= 180) {
            eyebrowUp = false;
        }
        if (brow1YPos >= 220) {
            eyebrowUp = true;
        }
        if (eyebrowUp) {
            brow1YPos = brow1YPos - 5;
        } else {
            brow1YPos = brow1YPos + 5;
        }
        if (lusterMove) {
            luster1aX = luster1aX + 2;
            luster1aY = luster1aY + 2;
            luster2aY = luster2aY + 2;
            luster2aX = luster2aX + 2;
        }
        if (luster1aX >= 465 && luster1aX <=490) {
            luster1aX = 850;
            luster1aY = 850;
            luster2aY = 850;
            luster2aX = 850;
        }
        if(luster1aX >=1000){
            luster1aX = 435;
            luster1aY = 250;
            luster2aY = 250;
            luster2aX = 235;
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
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
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
        The_Face_Thing game = new The_Face_Thing();
    }
}
