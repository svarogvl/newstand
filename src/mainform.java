import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import my.study.newstand.*;

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

        setSize(frameWidth, frameHeight);

        JButton newsPaperButton = new JButton("Газеты");
        JButton magazineButton = new JButton("Журналы");
        JButton booksButton = new JButton("Книги");

        //добавляем панель для размещения на ней компонентов
        buttonPanel = new JPanel();

        add(buttonPanel);
        //buttonPanel.setLayout(new GridBagLayout());

        //размещаем кнопки на панели
        buttonPanel.add(newsPaperButton);
        buttonPanel.add(magazineButton);
        buttonPanel.add(booksButton);

        newsPaperPanel = new JPanel();

        newsPaperStat = new JTextArea("Статистика по газетам");
        magazStat = new JTextArea("Статистика по журналам");
        bookStat = new JTextArea("Статистика по книгам");

        newsPaperStat.setVisible(false);
        magazStat.setVisible(false);
        bookStat.setVisible(false);

        ActionListener clickNewsPaperListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
//                newsPaperPanel.add(newsPaperStat);
                newsPaperStat.setVisible(false);
                magazStat.setVisible(false);
                bookStat.setVisible(false);
                buttonPanel.add(newsPaperStat);
                newsPaperStat.setVisible(true);
            }
        };

        ActionListener clickMagazineListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
//                newsPaperPanel.add(magazStat);
                newsPaperStat.setVisible(false);
                magazStat.setVisible(false);
                bookStat.setVisible(false);
                buttonPanel.add(magazStat);
                magazStat.setVisible(true);
            }
        };

        ActionListener clickBookListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                newsPaperStat.setVisible(false);
                magazStat.setVisible(false);
                bookStat.setVisible(false);
                buttonPanel.add(bookStat);
                bookStat.setVisible(true);
            }
        };

        newsPaperButton.addActionListener(clickNewsPaperListener);
        magazineButton.addActionListener(clickMagazineListener);
        booksButton.addActionListener(clickBookListener);


    }
    private JPanel buttonPanel;
    private JPanel newsPaperPanel;
    private JTextArea newsPaperStat;
    private JTextArea magazStat;
    private JTextArea bookStat;
}
