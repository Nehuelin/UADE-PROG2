package modelosDeExamen.parcial1.parcial1tema2;

public class Conjunto implements ConjuntoTDA{
	private class Nodo{
		int info;
		Nodo sig;
	}
	private Nodo c;

	public void InicializarConjunto() {
		c = null;
	}

	public void Agregar(int x) {
		if(!this.Pertenece(x)) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			nuevo.sig = c;
			c = nuevo;
		}
	}

	public int Elegir() {
		return c.info;
	}

	public boolean ConjuntoVacio() {
		return (c == null);
	}

	public void Sacar(int x) {
		if (c != null) {
			if (c.info == x) {
				c = c.sig;
			}
		}
		else {
			Nodo aux = c;
			while (aux.sig != null && aux.sig.info != x) {
				aux = aux.sig;
			}
			if (aux.sig != null) {
				aux.sig = aux.sig.sig;
			}
		}
		
	}

	public boolean Pertenece(int x) {
		Nodo aux = c;
		while (aux != null && aux.info != x) {
			aux = aux.sig;
		}
		return (aux != null);
	}
	
}
