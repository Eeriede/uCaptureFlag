package modelo;

public class Golpeador extends Personaje {

	public Golpeador() {
		super.ataque = ATK_GOLPEADOR;
		super.energia = VDA_FULL;
		super.velAtaque = ASP_GOLPEADOR;
	}
	
	@Override
	public boolean atacar() {
		// TODO Auto-generated method stub
		return false;
	}

}
