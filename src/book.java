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
    public book(String authorName, String publishing, int nPages)
    {
        this.nameAuthor = authorName;
        this.publishHouse = publishing;
        this.numberPages = nPages;
    }

    private String nameAuthor;
    private String publishHouse;
    private int numberPages;
}
