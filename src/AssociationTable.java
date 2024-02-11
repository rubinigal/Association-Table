import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class AssociationTable<T extends Comparable<T>, E> {
	private TreeMap<T, E> treeMap;
	
	public AssociationTable() {
        this.treeMap = new TreeMap<>();
    }
	
	public AssociationTable(ArrayList<T> keys, ArrayList<E> values) throws IllegalArgumentException {
        if (keys.size() != values.size()) 
        	throw new IllegalArgumentException("Error: Both arrays must be of the same size.");
        
        this.treeMap = new TreeMap<>();
        for (int i = 0; i < keys.size(); i++) {
        	treeMap.put(keys.get(i), values.get(i));
        }
    }
	
	public void add(T key, E value) {
		treeMap.put(key, value); // If we get same key the TreeMap does the update himself
	}
	
	public E get(T key) {
		return treeMap.get(key);
	}
	
	public boolean contains(T key) {
		return treeMap.containsKey(key);
	}
	
	public boolean remove(T key) {
		if (treeMap.remove(key) != null)
			return true;
		return false;
	}
	
	public int size() {
		return treeMap.size();
	}
	
	public Iterator<T> keyIterator() {
		return treeMap.keySet().iterator();
	}
}
