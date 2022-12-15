import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// (String name, int pageNum, String author, String publishDate)
		Book b1 = new Book("aytac", 100, "mehtap,bekir", "18-01-1995");
		Book b2 = new Book("aysegul", 250, "mehtap,bekir", "18-01-1995");
		Book b3 = new Book("bekir", 50, "mehtap,bekir", "18-01-1995");
		Book b4 = new Book("mehtap", 55, "mehtap,bekir", "18-01-1995");
		Book b5 = new Book("ahmet", 325, "mehtap,bekir", "18-01-1995");
		Book b6 = new Book("levent", 125, "mehtap,alo", "18-01-1995");
		Book b7 = new Book("selma", 325, "levo,yigit,efe", "18-01-1995");
		Book b8 = new Book("efe", 60, "mehtap,bekir", "18-01-1995");
		Book b9 = new Book("yigit", 130, "mehtap,naber", "18-01-1995");
		Book b10 = new Book("veli", 500, "mehtap,bekir", "18-01-1995");

		ArrayList<Book> listem = new ArrayList<Book>();

		listem.add(b1);
		listem.add(b2);
		listem.add(b3);
		listem.add(b4);
		listem.add(b5);
		listem.add(b6);
		listem.add(b7);
		listem.add(b8);
		listem.add(b9);
		listem.add(b10);

		listem.stream().forEach(b -> System.out.print(b.getName() + ", "));

		Map<String, String> listem2 = new HashMap<String, String>();

		listem.stream().forEach(b -> listem2.put(b.getName(), b.getAuthor()));

		listem2.keySet().stream().forEach(val -> System.out.println(val + ":" + listem2.get(val)));

		listem.stream().filter(c -> c.getPageNum() > 100).forEach(c -> System.out.println(c.getName()));

	}
}