package my.study.newstand;

import java.awt.*;

/**
 * Created by svarog on 27.02.14.
 */
public class tools {

    /**
     * Рассчитывает процент от размера экрана ширины и высоты
     * @param percent процент от экрана
     * @return ширину и высоту в объекте типа Dimension
     */
    public static Dimension calcSizeScreen(int percent)
    {
        Dimension sizeScreen = Toolkit.getDefaultToolkit().getScreenSize();

        //frame size is x% of screen
        int frameWidth = Math.round(sizeScreen.width*percent/100);
        int frameHeight = Math.round(sizeScreen.height*percent/100);

        Dimension resCalc;
        return resCalc = new Dimension(frameWidth, frameHeight);
    }

}
