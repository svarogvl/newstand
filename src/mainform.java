import javax.swing.*;
import java.awt.*;

/**
 * Created by svarog on 20.02.14.
 */
public class mainform {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JStandFrame frame = new JStandFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}

/**
 * Class implements main form for "newstand"
 */
class JStandFrame extends JFrame
{
    public JStandFrame()
    {
        setTitle("Газетный киоск");
        Dimension sizeScreen = Toolkit.getDefaultToolkit().getScreenSize();

        //frame size is 60% of screen
        int frameWidth = Math.round(sizeScreen.width*60/100);
        int frameHeight = Math.round(sizeScreen.height*60/100);

        setSize(sizeScreen.width, sizeScreen.height);

    }
}
