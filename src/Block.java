import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class Block extends Rectangle {
    private Image pic;
    private boolean destroyed;
    private int posX, posY, width, height;
    Block(int x, int y, int width, int height, String s){
        this.posX = x;
        this.posY = y;
        this.width = width;
        this.height = height;
        try{
            pic = ImageIO.read(new File("src/art/"+s));
        }catch (Exception ex){
            ex.printStackTrace();
        }

        destroyed = false;
    }

    public void draw(Graphics g, Component c){
        if(!destroyed){
            g.drawImage(pic, posX, posY, width, height, c);
        }
    }
}
