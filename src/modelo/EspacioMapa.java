package modelo;

public class EspacioMapa {
	private boolean base = false;
	private int x;
	private int y;
	private Equipo equipo;
	private boolean bandera = false;
	
	public EspacioMapa(int pX, int pY, Equipo pEquipo) {
		setX(pX);
		setY(pY);
		setEquipo(pEquipo);
	}
	
	public boolean isBase() {
		return base;
	}
	
	public void setBase(boolean base) {
		this.base = base;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Equipo getEquipo() {
		return equipo;
	}
	
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public boolean isBandera() {
		return bandera;
	}
	
	public void setBandera(boolean bandera) {
		this.bandera = bandera;
	}	
}
