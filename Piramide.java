package AT_pratica_piramide;

public class Piramide {

	private float h;
	private float ab;
	private double tipo;
	
	public Piramide(float h, float ab, double tipo) {
		setH(h);
		setAb(ab);
		setTipo(tipo);
	}
	
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if(h >0)
			this.h = h;
	}
	public float getAb() {
		return ab;
	}
	public void setAb(float ab) {
		if(ab > 0)
			this.ab = ab;
	}
	public double getTipo() {
		return tipo;
	}
	public void setTipo(double tipo) {
		if((tipo > 0) & (tipo <= 3))
			this.tipo = tipo;
	}
	
	private double tipo() {
		if (tipo == 1)
			return 127.90;
		else if (tipo == 2)
			return 258.98;
		else 
			return 344.34;
	}
	
	public double al () {
		return Math.sqrt((Math.pow(getH(), 2) + Math.pow(getAb(), 2)));
	}
	
	public double area_tr () {
		return (2* getAb()) * al() / 2;
	}
	
	public double area_b () {
		return (2 * getAb()) * (2 * getAb());
	}
	
	public double area_t () {
		return (4 * area_tr()) + area_b();
	}
	
	public double litros () {
		return area_t() / 4.76;
	}
	
	public double latas () {
		return litros() / 18;
	}
	
	public double x () {
		return Math.round(latas());
	}
	
	public double volume () {
		return area_b() * 1/3 * getH();
	}
	
	public double preco () {
		return tipo() * x();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide [ab=");
		builder.append(ab);
		builder.append(", h=");
		builder.append(h);
		builder.append(", al=");
		builder.append(al());
		builder.append(", Área Triângulo=");
		builder.append(area_tr());
		builder.append(", Área Base=");
		builder.append(area_b());
		builder.append(", Área Total=");
		builder.append(area_t());
		builder.append(", Tipo de Tinta=");
		builder.append(getTipo());
		builder.append(", Litros=");
		builder.append(litros());
		builder.append(", Latas=");
		builder.append(x());
		builder.append(", Preço=");
		builder.append(preco());
		builder.append(", Volume=");
		builder.append(volume());
		builder.append("]");
		return builder.toString();
	}
	
	
}