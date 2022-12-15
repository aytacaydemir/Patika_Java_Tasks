import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Book.Book(String name, int pageNum, String author, String publishDate)
		Book b1 = new Book("Yabanci", 150, "Albert Camus", "18.01.1995");
		Book b2 = new Book("Aytac", 289, "Aytac Aydemir", "18.02.1995");
		Book b3 = new Book("Mehtap", 350, "Mehtap Aydemir", "18.03.1995");
		Book b4 = new Book("Bekir", 50, "Bekir AYdemir", "18.04.1995");
		Book b5 = new Book("Aysegul", 100, "Aysegul Aydemir", "18.05.1995");

		HashSet<Book> kitapSetim = new HashSet<Book>();

		kitapSetim.add(b1);
		kitapSetim.add(b2);
		kitapSetim.add(b3);
		kitapSetim.add(b4);
		kitapSetim.add(b5);

		List<Book> list = new ArrayList<>(kitapSetim);
		Collections.sort(list);

		for (Book o : list) {

			System.out.println(o.getName());
		}

		HashSet<Book> klasikler = new HashSet<Book>();
		klasikler.addAll(kitapSetim);

		List<Book> list2 = new ArrayList<>(klasikler);
		// Collections.sort(list2, Comparator<Book> c);
		Collections.sort(list2, new Book());

		for (Book o : list2) {

			System.out.println(o.getName());
		}
	}

}
