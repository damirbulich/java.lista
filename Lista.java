
public class Lista <T>{
	private Element<T> glava;
	public int duljina;
//----------------------------------------
	public Lista() {
		glava = new Element<T>();
		duljina = 0;
	}
//--------------------------------------------
	public void dodaj(T unos) {
		for (Element<T> i=glava;;i=i.getNext()) {
			if (i.getNext()==null) {
				i.setNext(new Element<T>(unos));
				duljina++;
				return;
			}
		}
	}
	public void ispisi() {
		for (Element<T> i=glava; i.getNext()!=null;i=i.getNext()) {
			System.out.print(i.getNext().getStorage().toString()+" ");
		}
		System.out.println();
	}
	public void izbrisi(T ele) {
		for (Element<T> i=glava; i.getNext()!=null;i=i.getNext()) {
			if(i.getNext().getStorage().equals(ele)) {
				if (i.getNext()==null) {
					i.setNext(null);
					duljina--;
					return;
				}
				i.setNext(i.getNext().getNext());
				duljina--;
				return;
			}
		}
		System.out.println("Ne postoji taj element!");
	}
	public T izbaci(int index) {
		Element<T> temp;
		for (Element<T> i=glava; i.getNext()!=null;i=i.getNext()) {
			if(index==0) {
				if (i.getNext()==null) {
					temp = i.getNext();
					i.setNext(null);
					duljina--;
					return temp.getStorage();
				}
				temp = i.getNext();
				i.setNext(i.getNext().getNext());
				duljina--;
				return temp.getStorage();
			}
			index--;
		}
		System.out.println("Ne postoji taj element!");
		return null;
	}
}
