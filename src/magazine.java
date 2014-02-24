import java.util.Date;

/**Класс журнала
 * Created by svarog on 24.02.14.
 */
public class magazine {

    /**
     *
     * @param nMagazine номер журнала
     * @param nPages    количество страниц
     */
    public magazine(int nMagazine, int nPages)
    {
        this.magazineNumber = nMagazine;
        this.numberPages = nPages;
        this.magazineDate = new Date();
    }

    /**
     *
     * @param nMagazine номер журнала
     * @param nPages    количество страниц
     * @param mDate     дата выхода журнала
     */
    public magazine(int nMagazine, int nPages, Date mDate)
    {
        this.magazineNumber = nMagazine;
        this.numberPages = nPages;
        this.magazineDate = mDate;
    }

    private int magazineNumber;
    private Date magazineDate;
    private int numberPages;
}
