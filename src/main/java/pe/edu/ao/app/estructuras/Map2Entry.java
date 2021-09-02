package pe.edu.ao.app.estructuras;

import java.util.Map;

public interface Map2Entry<K, V> {
	int hashCode();
	Map.Entry<K,V> entry(K k , V v);
}
