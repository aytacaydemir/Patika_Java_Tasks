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

	// size() : dizideki eleman say�s�n� verir.
	public int size() {

		int count = 0;

		for (int i = 0; i < this.capacity; i++) {

			if (this.arr[i] != null) {
				count++;
			}

		}
		return count;
	}

	// getCapacity() : dizinin kapasite de�erini verir.
	public int getCapacity() {

		return this.capacity;
	}

	// add(T data) : s�n�fa ait diziye eleman eklemek i�in kullan�lmal�d�r. E�er
	// dizide yeteri kadar yer yok ise, dizi boyutu 2 kat�na ��kart�lmal�d�r.
	public void add(T data) {

		if (size() >= getCapacity()) {
			T[] arr2 = arr;
			this.capacity = this.capacity * 2;
			arr = (T[]) new Object[capacity];
			arr = Arrays.copyOf(arr2, capacity);

		}

		this.arr[size()] = data;

	}

	// get(int index): verilen indisteki de�eri d�nd�r�r. Ge�ersiz indis girilerse
	// null d�nd�r�r.
	public T get(int index) {

		if (index >= size()) {
			return null;
		} else {
			return this.arr[index];
		}

	}

	// remove(int index): verilen indisteki veriyi silmeli ve silinen indis
	// sonras�nda ki verileri sol do�ru kayd�rmal�. Ge�ersiz indis girilerse null
	// d�nd�r�r.
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

	// set(int index, T data) : verilen indisteki veriyi yenisi ile de�i�tirme
	// i�lemini yapmal�d�r. Ge�ersiz indis girilerse null d�nd�r�r.
	public void set(int index, T data) {

		if (index >= size()) {
			System.out.println("null");
		} else {
			this.arr[index] = data;
			System.out.println("success");
		}

	}

	// String toString() : S�n�fa ait dizideki elemanlar� listeleyen bir metot.
	public String toString() {
		System.out.println("Size de�erim"+size());
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
	// Nesne listede yoksa -1 de�erini verir.
	public int indexOf(T data) {
		for (int i = 0; i < size(); i++) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// int lastIndexOf(T data) : Belirtilen ��enin listedeki son indeksini s�yler.
	// Nesne listede yoksa -1 de�erini verir.
	public int lastIndexOf(T data) {
		for (int i = size() - 1; i >= 0; i--) {
			if (this.arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	// boolean isEmpty() : Listenin bo� olup olmad���n� s�yler.
	public boolean isEmpty() {

		if (size() == 0) {
			return true; // bo�
		} else {
			return false;
		}

	}

	// T[] toArray() : Listedeki ��eleri, ayn� s�rayla bir array haline getirir.
	public T[] toArray() {
		return this.arr;
	}

	// clear() : Listedeki b�t�n ��eleri siler, bo� liste haline getirir.
	public void clear() {

		for (int i = 0; i < size(); i++) {
			this.arr[i] = null;
		}
		

	}

	// MyList<T> sublist(int start,int finish) : Parametrede verilen indeks
	// aral���na ait bir liste d�ner.

	public MyList<T> subList(int start, int finish) {

		MyList<T> newList = new MyList<>();
		for (int i = start; i <= finish; i++) {

			newList.add(arr[i]);
		}

		return newList;
	}

	// boolean contains(T data) : Parametrede verilen de�erin dizide olup olmad���n�
	// s�yler.
	public boolean contains(T data) {

		for (int i = 0; i < size(); i++) {

			if (this.arr[i] == data) {

				return true;
			}
		}
		return false;

	}

}
