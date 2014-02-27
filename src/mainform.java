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

                JFormBook formBookFrame = new JFormBook();
                formBookFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                formBookFrame.setVisible(true);
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
        setSize(tools.calcSizeScreen(30));

        //панель для отображения полей редактирования
        formBookPanel = new JPanel();

        bookNameLabel = new JLabel("Название книги");
        bookNameErrorLabel = new JLabel();
        bookNameField = new JTextField(50);

        bookAuthorLabel = new JLabel("Автор");
        bookAuthorErrorLabel = new JLabel();
        bookAuthorField = new JTextField(50);

        bookPublishLabel = new JLabel("Опубликовано");
        bookPublishErrorLabel = new JLabel();
        bookPublishField = new JTextField(50);

        bookCountPagesLabel = new JLabel("Количество страниц");
        bookCountPagesErrorLabel = new JLabel();
        bookCountPagesField = new JTextField(50);

        JButton saveBook = new JButton("Сохранить");

        formBookPanel.add(bookNameLabel);
        formBookPanel.add(bookNameErrorLabel);
        formBookPanel.add(bookNameField);

        formBookPanel.add(bookAuthorLabel);
        formBookPanel.add(bookAuthorErrorLabel);
        formBookPanel.add(bookAuthorField);

        formBookPanel.add(bookPublishLabel);
        formBookPanel.add(bookPublishErrorLabel);
        formBookPanel.add(bookPublishField);

        formBookPanel.add(bookCountPagesLabel);
        formBookPanel.add(bookCountPagesErrorLabel);
        formBookPanel.add(bookCountPagesField);

        formBookPanel.add(saveBook);

        add(formBookPanel);

        ActionListener saveClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean isError = false;
                bookNameErrorLabel.setText("");
                bookAuthorErrorLabel.setText("");
                bookPublishErrorLabel.setText("");
                bookCountPagesErrorLabel.setText("");

                if(bookNameField.getText().length() == 0){
                    bookNameErrorLabel.setText("Имя книги должно быть заполнено");
                    bookNameErrorLabel.setForeground(Color.red);
                    isError = true;
                }

                if(bookAuthorField.getText().length() == 0){
                    bookAuthorErrorLabel.setText("Название автора должно быть заполнено");
                    bookAuthorErrorLabel.setForeground(Color.red);
                    isError = true;
                }

                if(bookPublishField.getText().length() == 0){
                    bookPublishErrorLabel.setText("Кем опубликовано должно быть заполнено");
                    bookPublishErrorLabel.setForeground(Color.red);
                    isError = true;
                }

                if(bookCountPagesField.getText().length() > 0){
                    try{
                        int countPages = Integer.parseInt(bookCountPagesField.getText());
                    }
                    catch(NumberFormatException ex){
                        bookCountPagesErrorLabel.setText("Количество страниц должно быть числом.");
                        isError = true;
                    }
                }
                else
                {
                    bookCountPagesErrorLabel.setText("Количество страниц должно быть заполнено");
                    bookCountPagesErrorLabel.setForeground(Color.red);
                    isError = true;
                }

                if(!isError)
                {
                    ;
                }

            }
        };

        saveBook.addActionListener(saveClickListener);

    }

    private JPanel formBookPanel;

    private JLabel bookNameLabel;
    private JLabel bookNameErrorLabel;
    private JTextField bookNameField;

    private JLabel bookAuthorLabel;
    private JLabel bookAuthorErrorLabel;
    private JTextField bookAuthorField;

    private JLabel bookPublishLabel;
    private JLabel bookPublishErrorLabel;
    private JTextField bookPublishField;

    private JLabel bookCountPagesLabel;
    private JLabel bookCountPagesErrorLabel;
    private JTextField bookCountPagesField;
}
