import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> teams = new ArrayList<String>();
		ArrayList<String[]> matches = new ArrayList<>();
		Random random = new Random();
		

		teams.add("Galatasaray");
		teams.add("Beþiktaþ");
		teams.add("Fenerbahçe");
		teams.add("MalatyaSpor");
		teams.add("BursaSpor");

		if (teams.size() % 2 != 0) {
			teams.add("BAY");
		}

		for (int i = 0; i < teams.size(); i++) {
			for (int j = 0; j < teams.size(); j++) {

				if (teams.get(i) != teams.get(j)) {
					String[] s = { teams.get(i), teams.get(j) };
					matches.add(s);
				}
			}

		}

		// matches.forEach(n->System.out.println(n.toString()));
		int round = (teams.size() - 1) * 2;
		int matchNum = teams.size() / 2;
		System.out.println("toplam round= " + round);

		for (int i = 1; i <= round; i++) {

			System.out.println("ROUND " + i);

			ArrayList<String> arrayList = new ArrayList<>();

			for (int j = 0; j < matchNum; j++) {
				
				if(matches.size()!=1) {
				int rand1 = random.nextInt(matches.size() - 1);
				while (arrayList.contains(matches.get(rand1)[0]) || arrayList.contains(matches.get(rand1)[1])) {
					rand1 = random.nextInt(matches.size() - 1);
				}
				arrayList.add(matches.get(rand1)[0]);
				arrayList.add(matches.get(rand1)[1]);

				System.out.println((matches.get(rand1)[0]) + " vs " + matches.get(rand1)[1]);
				matches.remove(rand1);
			
				}
				else {
					System.out.println((matches.get(0)[0]) + " vs " + matches.get(0)[1]);
				}
			}
			System.out.println();
		}

	}

}
