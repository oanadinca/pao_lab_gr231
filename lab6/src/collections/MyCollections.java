package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import io.model.Product;

public class MyCollections {
	public void myMethod() {
		List<String> myList = new ArrayList<>();
		List<String> myList2 = new LinkedList<>();
		Collections.sort(myList);

		Map<String, ArrayList<Integer>> myMap = new HashMap<>();
		Map<String, ArrayList<Integer>> myMap2 = new TreeMap<>();

		//anabella - 1,3,4,5
		//dorin - 3
		//cosmina - 4,1,6,2

		Set<Product> myProduct = new HashSet<>();
		Set<Product> myProduct2 = new LinkedHashSet<>();
		Set<Product> myProduct3 = new TreeSet<>();

		Queue<String> queue = new PriorityQueue<>();

	}

}
