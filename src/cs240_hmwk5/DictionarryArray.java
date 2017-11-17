/**
 * 
 */
package cs240_hmwk5;

import java.util.Iterator;

/**
 * @author bjhau
 *
 */
public class DictionarryArray <K, V> implements DictionaryInterface<K,V> {
			
	private Node <K, V> [] hashtable;
	int size = 0;
	
	@Override
	public V add(K key, V value) {
		int index = key.hashCode();
		if (hashtable[index].flag)
		{
			hashtable[index].setKey(key);
			hashtable[index].setValue(value);
			hashtable[index].setFlag(true);
			size++;
			return null;
		}
		else
		{
			V oldValue = (V) hashtable[index].getValue();
			hashtable[index].setKey(key);
			hashtable[index].setValue(value);
			size++;
			return oldValue;
		}
	}

	@Override
	public V remove(K key) {
		if ( !isEmpty())
		{
			int index = key.hashCode();
			if(hashtable[index].getFlag())
			{
				V value = (V) hashtable[index].getValue();
				hashtable[index] = null;
				hashtable [index] = null;
				size--;
				return value;
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}

	@Override
	public V getValue(K key) {
		int index = key.hashCode();
		if (hashtable[index].getFlag())
		{
			return (V) hashtable[index].getValue();
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean contains(K key) {
		if(hashtable[key.hashCode()].getFlag())
		{
			return true;
		}
		else return false;
	}

	@Override
	public Iterator<K> getKeyIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<V> getValueIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		for(int i = 0 ; i < hashtable.length; i++)
		{
			hashtable[i].setFlag(false);
			hashtable[i].setKey(null);
			hashtable[i].setValue(null);
		}
		
	}

}
