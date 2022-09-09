package NumbersCounter;

public class NumbersCounter {
	int[] table;
	public NumbersCounter() {
		table = new int[1001];
	}
	
	public void add(int num) {
		table[num]++;
	}
	
	public void show() {
		for(int i = 0; i <= 1000; i++) {
			if(table[i] > 0) {
				System.out.println(i + " " + table[i]);
			}
		}
	}
}
