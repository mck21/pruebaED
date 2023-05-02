package Reservas;

public class Reserva implements Comparable<Reserva> {
	private String nif;
	private String nombre;
	private String tlf;
	private int codigo;
	private int ejemplares;

	public Reserva(String nif, String nombre, String tlf, int codigo, int ejemplares) {
		// atributos
		this.nif = nif;
		this.nombre = nombre;
		this.tlf = tlf;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}

	// constructor
	public Reserva(String nif, String nombre, String tlf, int codigo) {
		this.nif = nif;
		this.nombre = nombre;
		this.tlf = tlf;
		this.codigo = codigo;
		this.ejemplares = 1;
		//tmbn se puede llamar a un constructor desde otro usando this(....)
		//this(nif, nombre, tlf, codigo, 1);
	}

	// getter
	public String getNIF() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTLF() {
		return tlf;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	// setter
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	@Override
	public String toString() {
		return String.format("Reserva-%nNIF: %s %nNombre: %s %nTlf: %s %nCodigo: %d %nEjemplares: %d", nif, nombre, tlf,
				codigo, ejemplares);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) // si son la misma cosa (p.e t1 == t1)
			return true;
		if (!(o instanceof Reserva)) // si no es de tipo Tiempo es false (p.e si compara t1 con "pepe"
			return false;

		Reserva r = (Reserva) o; // cambio de tipo para "emgañar al compilador"
		if (this.nif.equals(r.nif) && this.codigo == r.codigo)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Reserva r) {
		if (this.codigo < r.codigo)
			return -1;
		else if (this.codigo > r.codigo)
			return 1;
		else if (this.nif.compareTo(r.nif) < 0)
			return -1;
		else if (this.nif.compareTo(r.nif) > 0)
			return 1;
		else
			return 0;
	}
}
