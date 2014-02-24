import java.util.Date;

/**Класс газета
 * Created by svarog on 24.02.14.
 */
public class newspaper {

    /**
     * конструктор принимающий в роли параметра номер газеты
     * @param numberPaper Номер газеты
     */
    public newspaper(int numberPaper)
    {
        this.Number = numberPaper;
        //дата выставляется текущая
        this.paperDate = new Date();
    }

    /**
     * Устанавливает номер газеты и время выпуска
     * @param numberPaper Номер газеты
     * @param paperDate дата выпуска газеты
     */
    public newspaper(int numberPaper, Date paperDate)
    {
        this.Number = numberPaper;
        this.paperDate = paperDate;
    }

    private int Number;
    private Date paperDate;

}
