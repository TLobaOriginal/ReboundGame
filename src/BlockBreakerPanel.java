import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BlockBreakerPanel extends JPanel implements KeyListener {

    BlockBreakerPanel(){
         Block paddle = new Block(175, 400, 150, 25, "platform.png");

         addKeyListener(this);
         setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
