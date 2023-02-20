package test;

public class Motor {
	
	int numeroCilindos;
	String tipo;
	int registro;
	
	void CambiarRegistro(int registro) {
		
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		
		this.tipo = tipo;
	}
}