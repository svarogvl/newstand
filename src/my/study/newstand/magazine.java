package my.study.newstand;

import java.util.Calendar;
import java.util.Date;


/**Класс журнала
 * Created by svarog on 24.02.14.
 */
public class magazine {

    /**
     *
     * @param magazineName название журнала
     * @param nMagazine номер журнала
     * @param nPages    количество страниц
     */
    public magazine(int nMagazine, String magazineName, int nPages)
    {
        this.magazineNumber = nMagazine;
        this.magazineName = magazineName;
        this.numberPages = nPages;
        this.magazineDate = Calendar.getInstance().getTime();
    }

    /**
     *
     * @param nMagazine номер журнала
     * @param nPages    количество страниц
     * @param mDate     дата выхода журнала
     * @param magazineName название журнала
     */
    public magazine(int nMagazine, String magazineName, int nPages, Date mDate)
    {
        this.magazineNumber = nMagazine;
        this.magazineName = magazineName;
        this.numberPages = nPages;
        this.magazineDate = mDate;
    }

    /**
     *
     * @return номер журнала
     */
    public int getMagazineNumber()
    {
        return this.magazineNumber;
    }

    /**
     *
     * @param mn устанавливает номер журнала
     */
    public void setMagazineNumber(int mn)
    {
        if(mn > 0)
        {
            this.magazineNumber = mn;
        }
    }

    /**
     *
     * @return название журнала
     */
    public String getMagazineName()
    {
        return this.magazineName;
    }

    /**
     *
     * @param magName название журнала
     */
    public void setMagazineName(String magName)
    {
        if(magName.length()>0)
        {
            this.magazineName = magName;
        }
    }

    /**
     *
     * @return дата издания
     */
    public Date getMagazineDate()
    {
        return this.magazineDate;
    }

    /**
     *
     * @param md
     */
    public void setMagazineDate(Date md)
    {

        if(md.after(Calendar.getInstance().getTime()))
        {
            this.magazineDate = md;
        }
    }

    /**
     *
     * @return количество страниц
     */
    public int getNumberPages()
    {
        return this.numberPages;
    }

    /**
     *
     * @param countPage количество страниц
     */
    public void setNumberPages(int countPage)
    {
        this.numberPages = countPage;
    }

    private int magazineNumber;
    private String magazineName;
    private Date magazineDate;
    private int numberPages;
}
