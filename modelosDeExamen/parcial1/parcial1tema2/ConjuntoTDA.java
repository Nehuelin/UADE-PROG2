package modelosDeExamen.parcial1.parcial1tema2;

public interface ConjuntoTDA {
	void InicializarConjunto();
	void Agregar(int x);
	int Elegir();
	boolean ConjuntoVacio();
	void Sacar(int x);
	boolean Pertenece(int x);
}
