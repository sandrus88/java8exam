package exam.test1;

/** 
 Which of the following options can be inserted above so that it will print [1, 3]?
 1) filterData(al, d -> d.value%2 == 0 );
 2) filterData(al, (Data x) -> x.value%2 == 0 );
 3) filterData(al, (Data y) -> y.value%2  );
 4) filterData(al, d -> return d.value%2 ); 
 */

import java.util.ArrayList;
import java.util.function.Predicate;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Data52 {
	int value;

	Data52(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}

	public void filterData(ArrayList<Data52> dataList, Predicate<Data52> p) {
		Iterator<Data52> i = dataList.iterator();
		while (i.hasNext()) {
			if (p.test(i.next())) {
				i.remove();
			}
		}
	}

	public static void main(String[] args) {
		Data52 d = new Data52(1); 
		ArrayList<Data52> 
		al.add(d);
		d = new Data52(2);
		al.add(d);
		d = new Data52(3);
		al.add(d);
		//INSERT METHOD CALL HERE
		System.out.println(al);
	}
}