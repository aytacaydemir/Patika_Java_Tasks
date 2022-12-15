import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {

	private String name;
	private int pageNum;
	private String author;
	private String publishDate;

	public Book(String name, int pageNum, String author, String publishDate) {

		this.name = name;
		this.pageNum = pageNum;
		this.author = author;
		this.publishDate = publishDate;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Book o) {

		return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Book o1, Book o2) {

		return o1.getPageNum() - o2.getPageNum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

}
