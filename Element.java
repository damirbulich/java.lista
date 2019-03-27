
public class Element<T> {
	private T storage;
	private Element<T> next;
	
	public Element() {
		next = null;
	}
	public Element(T storage) {
		setStorage(storage);
		next = null;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element<T> other = (Element<T>) obj;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return storage.toString();
	}
	public T getStorage() {
		return storage;
	}
	public void setStorage(T storage) {
		this.storage = storage;
	}
	public Element<T> getNext() {
		return next;
	}
	public void setNext(Element<T> next) {
		this.next = next;
	}

}
