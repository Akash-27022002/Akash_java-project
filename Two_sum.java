/*
Time Complexity: O( N )
Space Complexity: O( N )
Where N is the total number of elements in the array .
 */
class Pair<T, V> {
	T first;
	V second;
	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
}

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> list, int target, int N) {
		// Declaring a hashmap
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			if (map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			} else {
				map.put(list.get(i), 1);
			}

		}
		ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();

		// Looping over all elements in the array
		for (int i = 0; i < N; i++) {
			if (target - list.get(i) == list.get(i)) {
				if (map.get(list.get(i)) > 1) {
					ans.add(new Pair(list.get(i), list.get(i)));
					map.put(list.get(i), map.get(list.get(i)) - 2);
				}
			} else {
				if (map.containsKey(target - list.get(i)) && map.get(list.get(i)) > 0
						&& map.get(target - list.get(i)) > 0) {
					ans.add(new Pair(list.get(i), target - list.get(i)));
					map.put(list.get(i), map.get(list.get(i)) - 1);
					map.put(target - list.get(i), map.get(target - list.get(i)) - 1);
				}
			}
		}

		if (ans.size() == 0)
			ans.add(new Pair(-1, -1));

		return ans;
	}
}
