import java.util.Arrays;

public class MyList<T> {

	private int capacity;
	private T[] arr;

	public MyList() {
		this.capacity = 10;
		this.arr = (T[]) new Object[capacity];
	}

	public MyList(int capacity) {

		this.arr = (T[]) new Object[capacity];
	}

	// size() : dizideki eleman sayýsýný verir.
	public int size() {

		int count = 0;

		for (int i = 0; i < this.capacity; i++) {

			if (this.arr[i] != null) {
				count++;
			}

		}
		return count;
	}

	// getCapacity() : dizinin kapasite deðerini verir.
	public int getCapacity() {

		return this.capacity;
	}

	// add(T data) : sýnýfa ait diziye eleman eklemek için kullanýlmalýdýr. Eðer
	// dizide yeteri kadar yer yok ise, dizi boyutu 2 katýna çýkartýlmalýdýr.
	public void add(T data) {

		if (size() >= getCapacity()) {
			T[] arr2 = arr;
			this.capacity = this.capacity * 2;
			arr = (T[]) new Object[capacity];
			arr = Arrays.copyOf(arr2, capacity);

		}

		this.arr[size()] = data;

	}

	// get(int index): verilen indisteki deðeri döndürür. Geçersiz indis girilerse
	// null döndürür.
	public T get(int index) {

		if (index >= size()) {
			return null;
		} else {
			return this.arr[index];
		}

	}

	// remove(int index): verilen indisteki veriyi silmeli ve silinen indis
	// sonrasýnda ki verileri sol doðru kaydýrmalý. Geçersiz indis girilerse null
	// döndürür.
	public void remove(int index) {

		if (index >= size()) {

			System.out.println("null");
		} else {

			for (int i = index; i < size(); i++) {

				this.arr[i] = this.arr[i + 1];
			}
			System.out.println("success");
		}

	}

	// set(int index, T data) : verilen indisteki veriyi yenisi ile deðiþtirme
	// iþlemini yapmalýdýr. Geçersiz indis girilerse null döndürür.
	public void set(int index, T data) {

		if (index >= size()) {
			System.out.println("null");
		} else {
			this.arr[index] = data;
			System.out.println("success");
		}

	}

	// String toString() : Sýnýfa ait dizideki elemanlarý listeleyen bir metot.
	public String toString() {
		System.out.println("Size deðerim"+size());
		int iMax = size();
		if (iMax == -1 || iMax==0)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(String.valueOf(arr[i]));
			if (i == iMax - 1)
				return b.append(']').toString();
			b.append(", ");
		}
	}

	// int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir.
	// Nesne listede yoksa -1 deðerini verir.
	public int indexOf(T data) {
		for (int i = 0; i < size(); i++) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// int lastIndexOf(T data) : Belirtilen öðenin listedeki son indeksini söyler.
	// Nesne listede yoksa -1 deðerini verir.
	public int lastIndexOf(T data) {
		for (int i = size() - 1; i >= 0; i--) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// boolean isEmpty() : Listenin boþ olup olmadýðýný söyler.
	public boolean isEmpty() {

		if (size() == 0) {
			return true; // boþ
		} else {
			return false;
		}

	}

	// T[] toArray() : Listedeki öðeleri, ayný sýrayla bir array haline getirir.
	public T[] toArray() {
		return this.arr;
	}

	// clear() : Listedeki bütün öðeleri siler, boþ liste haline getirir.
	public void clear() {

		for (int i = 0; i < size(); i++) {
			this.arr[i] = null;
		}
		

	}

	// MyList<T> sublist(int start,int finish) : Parametrede verilen indeks
	// aralýðýna ait bir liste döner.

	public MyList<T> subList(int start, int finish) {

		MyList<T> newList = new MyList<>();
		for (int i = start; i <= finish; i++) {

			newList.add(arr[i]);
		}

		return newList;
	}

	// boolean contains(T data) : Parametrede verilen deðerin dizide olup olmadýðýný
	// söyler.
	public boolean contains(T data) {

		for (int i = 0; i < size(); i++) {

			if (this.arr[i] == data) {

				return true;
			}
		}
		return false;

	}

}
