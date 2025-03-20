package examen2.freddyarmando.perezcampos.examen;

public class CursoImpl implements Curso{
	private String nombreCurso;
	private int codigo;
	private int cupo;
	
	public CursoImpl(String nombreCurso, int codigo, int cupo) {
		super();
		this.nombreCurso = nombreCurso;
		this.codigo = codigo;
		this.cupo = cupo;
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return nombreCurso;
	}

	@Override
	public int obtenerCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public int obtenerCupo() {
		// TODO Auto-generated method stub
		return cupo;
	}
	
}
