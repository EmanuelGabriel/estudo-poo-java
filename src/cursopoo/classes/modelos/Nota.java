package cursopoo.classes.modelos;

public class Nota {

	private double valor1;
	private double valor2;
	private double valor3;
	private double valor4;

	public Nota() {
	}

	public Nota(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}

	public double getValor4() {
		return valor4;
	}

	public void setValor4(double valor4) {
		this.valor4 = valor4;
	}

	public double getSomaNotas() {
		return (valor1 + valor2 + valor3 + valor4);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valor1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valor2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valor3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valor4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Nota other = (Nota) obj;
		if (Double.doubleToLongBits(valor1) != Double.doubleToLongBits(other.valor1))
			return false;
		if (Double.doubleToLongBits(valor2) != Double.doubleToLongBits(other.valor2))
			return false;
		if (Double.doubleToLongBits(valor3) != Double.doubleToLongBits(other.valor3))
			return false;
		if (Double.doubleToLongBits(valor4) != Double.doubleToLongBits(other.valor4))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nota [valor1=" + this.valor1 + ", valor2=" + this.valor2 + ", valor3=" + this.valor3 + ", valor4="
				+ this.valor4 + "]";
	}

}
