/*
 * removes all duplicate elements from the list
 * @param lst list to remove duplicates from,
 * requires that lst contains types that all implement equals(),
 * requires that lst is in sorted order
 * @effects adjacent elements in lst which are duplicates are removed
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question2 {

	public static void removeDuplicates(List lst) {
		if (lst == null || lst.size() == 0) return;
		List copy = new ArrayList(lst);
		Iterator elements = copy.iterator();
		Object pre = elements.next();
		while(elements.hasNext()) {
			Object nex = elements.next();
			if (pre.equals(nex)) lst.remove(nex);
			else pre = nex;
		}
	}

}
