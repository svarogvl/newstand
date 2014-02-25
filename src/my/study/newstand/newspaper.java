package my.study.newstand;

import java.util.Date;


/**Класс газета
 * Created by svarog on 24.02.14.
 */
public class newspaper {

    /**
     * конструктор принимающий в роли параметра номер газеты
     * @param numberPaper Номер газеты
     */
    public newspaper(int numberPaper, String namePaper)
    {
        this.Number = numberPaper;
        this.name = namePaper;
        //дата выставляется текущая
        this.paperDate = new Date();
    }

    /**
     * Устанавливает номер газеты и время выпуска
     * @param numberPaper Номер газеты
     * @param paperDate дата выпуска газеты
     */
    public newspaper(int numberPaper, String namePaper, Date paperDate)
    {
        this.Number = numberPaper;
        this.name = namePaper;
        this.paperDate = paperDate;
    }

    /**
     *
     * @return номер газеты
     */
    public int getNumber()
    {
        return this.Number;
    }

    /**
     *
     * @param paperNumber номер газеты
     */
    public void setNumber(int paperNumber)
    {
        if(paperNumber>0)
        {
            this.Number = paperNumber;
        }
    }

    /**
     *
     * @return название газеты
     */
    public String getName()
    {
        return this.name;
    }

    /**
     *
     * @param namePaper название газеты
     */
    public void setName(String namePaper)
    {
        this.name = namePaper;
    }

    /**
     *
     * @return возвращает дату выхода газеты
     */
    public Date getPaperDate()
    {
        return this.paperDate;
    }

    /**
     *
     * @param datePaper дата газеты
     */
    public void setPaperDate(Date datePaper)
    {
        this.paperDate = datePaper;
    }

    private int Number;
    private String name;
    private Date paperDate;

}
