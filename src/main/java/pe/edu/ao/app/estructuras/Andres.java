package pe.edu.ao.app.estructuras;

import java.util.Map;
import java.util.Objects;


public class Andres<K,V> implements Map2<K,V>{

	static final float DEFAULT_LOAD_FACTOR2 = 0.75f;
	static final int MAXIMUM_CAPACITY2 = 1 << 30;
	
    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    
    static final int TREEIFY_THRESHOLD = 8;

    static final int MIN_TREEIFY_CAPACITY = 64;
    
    int modCount;

    int threshold2;

	// fields
	
	int size2;
	int modCount2;
	Node2<K,V>[] table2;
	float loadFactor2;
	
	@Override
	public int size2() {
		return size2;
	}

	@Override
	public boolean isEmpty2() {
		return size2==0;
	}

	@Override
	public boolean containsKey2(Object key) {
        return getNode2(key) != null;
	}

	int hash(Object key2) {
        int h2;
        return (key2 == null) ? 0 : (h2 = key2.hashCode()) ^ (h2 >>> 16);
    }
	private  Node2<K,V> getNode2(Object key2) {
        Node2<K,V>[] tab2;
        Node2<K,V> first2, e2; 
        int n2, hash2; 
        K k2;
        if ((tab2 = table2) != null && (n2 = tab2.length) > 0 && (first2 = tab2[(n2 - 1) & (hash2 = hash(key2))]) != null) {
        	 
        	if (first2.hash2 == hash2 && ((k2 = first2.key2) == key2 || (key2 != null && key2.equals(k2))))
                     return first2;
        	
        	if ((e2 = first2.next2) != null) {
        		
        		// Obvie si es una clase de TreeNode
        		do {
        			
        			if (e2.hash2 == hash2 && ((k2 = e2.key2) == key2 || (key2 != null && key2.equals(k2))))
                            return e2;
        			
        		}while((e2 = e2.next2) != null);
        		
        	}
        	return null;
        }
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsValue2(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get2(Object key2) {
		Node2<K,V> e2;
        return (e2 = getNode2(key2)) == null ? null : e2.value2;
	}

	@Override
	public V put2(K key, V value) {
        return putVal2(hash(key), key, value, false, true);
	}
	
    void afterNodeAccess2(Node2<K,V> p) { }
    void afterNodeInsertion2(boolean evict) { }


	private V putVal2(int hash2, K key2, V value2, boolean onlyIfAbsent, boolean evict) {
		
        Node2<K,V>[] tab2; Node2<K,V> p2; int n2, i2;
        
        if ((tab2 = table2) == null || (n2 = tab2.length) == 0)
            n2 = (tab2 = resize()).length;
        if ((p2 = tab2[i2 = (n2 - 1) & hash2]) == null)
            tab2[i2] = newNode2(hash2, key2, value2, null);
        else {
            Node2<K,V> e2; K k2;
            if (p2.hash2 == hash2 &&
                ((k2 = p2.key2) == key2 || (key2 != null && key2.equals(k2))))
                e2 = p2;
            //else if (p instanceof TreeNode)
            //    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e2 = p2.next2) == null) {
                        p2.next2 = newNode2(hash2, key2, value2, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab2, hash2);
                        break;
                    }
                    if (e2.hash2 == hash2 &&
                        ((k2 = e2.key2) == key2 || (key2 != null && key2.equals(k2))))
                        break;
                    p2 = e2;
                }
            }
            if (e2 != null) { // existing mapping for key
                V oldValue = e2.value2;
                if (!onlyIfAbsent || oldValue == null)
                    e2.value2 = value2;
                afterNodeAccess2(e2);
                return oldValue;
            }
        }
        
        ++modCount;
        if (++size2 > threshold2)
            resize();
        afterNodeInsertion2(evict);
        return null;

	}

	private void treeifyBin(Node2<K, V>[] tab2, int hash2) {	
		int n, index; Node2<K,V> e;
        if (tab2 == null || (n = tab2.length) < MIN_TREEIFY_CAPACITY)
            resize();
        else if ((e = tab2[index = (n - 1) & hash2]) != null) {
//            TreeNode<K,V> hd = null, tl = null;
//            do {
//                TreeNode<K,V> p = replacementTreeNode(e, null);
//                if (tl == null)
//                    hd = p;
//                else {
//                    p.prev = tl;
//                    tl.next = p;
//                }
//                tl = p;
//            } while ((e = e.next) != null);
//            if ((tab[index] = hd) != null)
//                hd.treeify(tab);
        }
		
		
	}

	private Node2<K, V> newNode2(int hash2, K key2, V value2, Node2<K,V> next2) {
		// TODO Auto-generated method stub
		return new Node2<>(hash2, key2, value2, next2);
	}

	private Node2<K, V>[] resize() {
        Node2<K,V>[] oldTab2 = table2;
        
        int oldCap2 = (oldTab2 == null) ? 0 : oldTab2.length;
        int oldThr2 = threshold2;
        int newCap2, newThr2 = 0;
        
        if (oldCap2 > 0) {
        	if (oldCap2 >= MAXIMUM_CAPACITY) {
                threshold2 = Integer.MAX_VALUE;
                return oldTab2;
            }else if ((newCap2 = oldCap2 << 1) < MAXIMUM_CAPACITY && oldCap2 >= DEFAULT_INITIAL_CAPACITY)
        			newThr2 = oldThr2 << 1;
		}else if (oldThr2 > 0) 
				newCap2 = oldThr2;
		else {
			newCap2 = DEFAULT_INITIAL_CAPACITY;
            newThr2 = (int)(DEFAULT_LOAD_FACTOR2 * DEFAULT_INITIAL_CAPACITY);
		}
        if (newThr2 == 0) {
            float ft2 = (float)newCap2 * loadFactor2;
            newThr2 = (newCap2 < MAXIMUM_CAPACITY && ft2 < (float)MAXIMUM_CAPACITY ? (int)ft2 : Integer.MAX_VALUE);
        }
        threshold2 = newThr2;
        
        Node2<K,V>[] newTab2 = (Node2<K,V>[])new Node2[newCap2];
        table2 = newTab2;
        
        if (oldTab2 != null) {
            for (int j = 0; j < oldCap2; ++j) {
                Node2<K,V> e;
                if ((e = oldTab2[j]) != null) {
                    oldTab2[j] = null;
                    if (e.next2 == null)
                        newTab2[e.hash2 & (newCap2 - 1)] = e;
                   // else if (e instanceof TreeNode)
                        //((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node2<K,V> loHead = null, loTail = null;
                        Node2<K,V> hiHead = null, hiTail = null;
                        Node2<K,V> next;
                        do {
                            next = e.next2;
                            if ((e.hash2 & oldCap2) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next2 = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next2 = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next2 = null;
                            newTab2[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next2 = null;
                            newTab2[j + oldCap2] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab2;
	}

	@Override
	public V remove2(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear2() {
		// TODO Auto-generated method stub
		
	}
	static class Node2<K,V> implements Map2.Entry2<K,V>{
		
		final int hash2;
        final K key2;
        V value2;
        Node2<K,V> next2;
        
        Node2(int hash2, K key2, V value2, Node2<K,V> next2) {
            this.hash2 = hash2;
            this.key2 = key2;
            this.value2 = value2;
            this.next2 = next2;
        }
        
		@Override
		public K getKey2() {
			return key2;
		}

		@Override
		public V getValue2() {
			return value2;
		}

		@Override
		public V setValue2(V newValue2) {
			// TODO Auto-generated method stub
			V oldValue = value2;
            value2 = newValue2;
            return oldValue;
		}

		@Override
		public boolean equals2(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int hashCode2() {
			return Objects.hashCode(key2) ^ Objects.hashCode(value2);
		}
		
	}

	
}
