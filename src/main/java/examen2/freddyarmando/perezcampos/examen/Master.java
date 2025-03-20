package examen2.freddyarmando.perezcampos.examen;

public class Master extends CursoImpl{
	private boolean oficial;
	
	public Master(String nombreCurso, int codigo, int cupo, boolean oficial) {
		super(nombreCurso, codigo, cupo);
		this.oficial = oficial;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return super.obtenerNombre();
	}
	
	@Override
	public int obtenerCodigo() {
		// TODO Auto-generated method stub
		return super.obtenerCodigo();
	}
	
	@Override
	public int obtenerCupo() {
		// TODO Auto-generated method stub
		return super.obtenerCupo();
	}

	public boolean isOficial() {
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}
	
	public void mostrar() {
		System.out.println("Nombre del curso: "+obtenerNombre());
		System.out.println("Codigo del curso: "+obtenerCodigo());
		System.out.println("Cupo del curso: "+obtenerCupo());
		System.out.println("Oficial: "+oficial);
	}
	
	

}
