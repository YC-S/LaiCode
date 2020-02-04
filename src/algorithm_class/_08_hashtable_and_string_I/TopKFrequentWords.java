package algorithm_class._08_hashtable_and_string_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

// Given a composition with different kinds of words, return a list of the top K most frequent words
// in the composition.
//
// Assumptions
//
// the composition is not null and is not guaranteed to be sorted
// K >= 1 and K could be larger than the number of distinct words in the composition, in this case,
// just return all the distinct words
//
// Return
//
// a list of words ordered from most frequent one to least frequent one (the list could be of size K
// or smaller than K)
//
// Examples
//
// Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 2 frequent words are [“b”,
// “c”]
// Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 4 frequent words are [“b”,
// “c”, "a", "d"]
// Composition = ["a", "a", "b", "b", "b", "b", "c", "c", "c", "d"], top 5 frequent words are [“b”,
// “c”, "a", "d"]
public class TopKFrequentWords {

  public static String[] topKFrequent(String[] combo, int k) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : combo) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    PriorityQueue<Entry<String, Integer>> minHeap =
      new PriorityQueue<>((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    for (Entry<String, Integer> entry : map.entrySet()) {
      minHeap.offer(entry);
    }
    if (k > map.entrySet().size()) {
      k = map.entrySet().size();
    }
    String[] res = new String[k];
    for (int i = 0; i < k; i++) {
      res[i] = minHeap.poll().getKey();
    }
    return res;
  }

  public static void main(String[] args) {
    String[] combo = {"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
    System.out.println(Arrays.toString(topKFrequent(combo, 2)));
    System.out.println(Arrays.toString(topKFrequent(combo, 4)));
    System.out.println(Arrays.toString(topKFrequent(combo, 5)));
  }
}
