package my.study.newstand;

/**
 * Created by svarog on 24.02.14.
 */
public class book {

    /**
     *
     * @param authorName имя автора
     * @param publishing кем опубликована
     * @param nPages     количество страниц
     */
    public book(String authorName, String nameBook, String publishing, int nPages)
    {
        this.nameAuthor = authorName;
        this.nameBook = nameBook;
        this.publishHouse = publishing;
        this.numberPages = nPages;
    }

    /**
     *
     * @return имя автора
     */
    public String getNameAuthor()
    {
        return this.nameAuthor;
    }

    /**
     *
     * @param na устанавливает имя автора если оно не пустое
     */
    public void setNameAuthor(String na)
    {
        if(na.length()>0)
        {
            this.nameAuthor = na;
        }
    }

    /**
     *
     * @return возвращает имя книги
     */
    public String getNameBook()
    {
        return this.nameBook;
    }

    /**
     *
     * @param nb название книги
     */
    public void setNameBook(String nb)
    {
        if(nb.length()>0)
        {
            this.nameBook = nb;
        }
    }

    /**
     *
     * @return возвращает издательство
     */
    public String getPublishHouse()
    {
        return this.publishHouse;
    }

    /**
     *
     * @param ph издательство
     */
    public void setPublishHouse(String ph)
    {
        if (ph.length() > 0)
        {
            this.publishHouse = ph;
        }
    }

    /**
     *
     * @return количество страниц книги
     */
    public int getNumberPages()
    {
        return this.numberPages;
    }

    /**
     *
     * @param np устанавливает количество страниц
     */
    public void setNumberPages(int np)
    {
        if(np>0)
        {
            this.numberPages = np;
        }
    }

    private String nameBook;
    private String nameAuthor;
    private String publishHouse;
    private int numberPages;
}
