/**
 * 
 */
package cs240_hmwk5;

/**
 * @author bjhau
 *
 */
public class Node<K, V> {
	private K key;
	private V value;
	private Node <K, V> next;
	
	public Node()
	{
		key = null;
		value = null;
		next = null;
	}
	
	public Node(K key, V value)
	{
		this.key = key;
		this.value = value;
		next = null;
	}

	public void setNextNode(Node <K, V> node)
	{
		next = node;
	}
	public Node <K, V> getNextNode()
	{
		return next;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
}