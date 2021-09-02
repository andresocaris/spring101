package pe.edu.ao.app.estructuras;

public interface Map2<K,V> {
	int size2();
	boolean isEmpty2();
	boolean containsKey2(Object key);
	boolean containsValue2(Object value);
	V get2(Object key);
	V put2(K key, V value);
	V remove2(Object key);
	void clear2();
	interface Entry2<K, V> {
		 K getKey2();
		 V getValue2();
		 V setValue2(V value);
		 boolean equals2(Object o);
		 int hashCode2();
	}
}
