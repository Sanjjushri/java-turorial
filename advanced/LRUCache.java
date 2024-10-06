package advanced;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
	private int capacity;

	private Map<Integer, LinkedListNode> cache;
	private LinkedList<LinkedListNode> lruList;

	private class LinkedListNode {
		int key;
		int value;

		LinkedListNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<>();
		lruList = new LinkedList<>();
	}

	public int get(int key) {
		System.out.println("Getting key: " + key);
		printCacheState("before get");

		if (cache.containsKey(key)) {
			LinkedListNode node = cache.get(key);
			lruList.remove(node); // Remove from old position
			lruList.addFirst(node); // Move to the front
			printCacheState("after get");
			return node.value; // Return the value
		}

		System.out.println("Key " + key + " not found in cache.");
		printCacheState("after get");
		return -1; // Cache miss
	}

	public void put(int key, int value) {
		System.out.println("Putting key: " + key + ", value: " + value);
		printCacheState("before put");

		if (cache.containsKey(key)) {
			LinkedListNode node = cache.get(key);
			lruList.remove(node); // Remove from old position
			node.value = value; // Update the value
			lruList.addFirst(node); // Move to the front
		} else {
			if (cache.size() >= capacity) {
				LinkedListNode leastUsed = lruList.removeLast(); // Remove least recently used
				cache.remove(leastUsed.key); // Remove from cache
				System.out.println("Removed least recently used: " + leastUsed.key);
			}
			LinkedListNode newNode = new LinkedListNode(key, value);
			lruList.addFirst(newNode); // Add new item to the front
			cache.put(key, newNode); // Add to cache
		}

		printCacheState("after put");
	}

	// Helper function to print the current cache and LRU order
	private void printCacheState(String action) {
		System.out.println("Cache " + action + ":");
		System.out.println("Current Cache: " + cache.keySet());
		System.out.print("LRU Order (from most to least recent): ");
		for (LinkedListNode node : lruList) {
			System.out.print(node.key + " ");
		}
		System.out.println();
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);

		cache.put(1, 100);
		cache.put(2, 200);
		cache.put(3, 300);
		cache.get(1); // Access 1, making it the most recently used
		cache.put(4, 400);
	}
}
