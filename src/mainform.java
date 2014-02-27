import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import my.study.newstand.tools;

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
        Dimension sizeScreen = tools.calcSizeScreen(60);

        //размеры главной формы
        setSize(sizeScreen.width, sizeScreen.height);

        //кнопки для выбора газет журналов или книг
        JButton newsPaperButton = new JButton("Газеты");
        JButton magazineButton = new JButton("Журналы");
        JButton booksButton = new JButton("Книги");

        //добавляем панель для размещения на ней компонентов
        buttonPanel = new JPanel();
        add(buttonPanel);

        //размещаем кнопки на панели
        buttonPanel.add(newsPaperButton);
        buttonPanel.add(magazineButton);
        buttonPanel.add(booksButton);

//        newsPaperPanel = new JPanel();

        //текстовая область в которой выводится информация по каждой группе товаров
        newsPaperStat = new JTextArea("Статистика по газетам", 5, 40);
        magazStat = new JTextArea("Статистика по журналам", 5, 40);
        bookStat = new JTextArea("Статистика по книгам", 5, 40);

        //изначально каждая область скрыта от пользователя, до нажатия кнопки
        newsPaperStat.setVisible(false);
        magazStat.setVisible(false);
        bookStat.setVisible(false);

        //слушатели для кнопок
        ActionListener clickNewsPaperListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                toggleAllTextArea(false);
                buttonPanel.add(newsPaperStat);
                newsPaperStat.setVisible(true);
            }
        };

        ActionListener clickMagazineListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                toggleAllTextArea(false);
                buttonPanel.add(magazStat);
                magazStat.setVisible(true);
            }
        };

        ActionListener clickBookListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                toggleAllTextArea(false);
                buttonPanel.add(bookStat);
                bookStat.setVisible(true);
            }
        };

        //добавляем каждому слушателю по кнопке
        newsPaperButton.addActionListener(clickNewsPaperListener);
        magazineButton.addActionListener(clickMagazineListener);
        booksButton.addActionListener(clickBookListener);
    }

    /**
     *
     * @param b скрыть или нет техт арею
     */
    private void toggleAllTextArea(boolean b)
    {
        newsPaperStat.setVisible(b);
        magazStat.setVisible(b);
        bookStat.setVisible(b);
    }

    private JPanel buttonPanel;
    private JTextArea newsPaperStat;
    private JTextArea magazStat;
    private JTextArea bookStat;
}

class JFormBook extends JFrame{
    public JFormBook()
    {
        setTitle("Добавление/редактирование информации о книгах");

        //панель для отображения полей редактирования
        JPanel formBookPanel = new JPanel();

        JLabel bookNameLabel = new JLabel("Название книги");

    }
}
