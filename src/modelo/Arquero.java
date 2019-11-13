package modelo;

public class Arquero extends Personaje {

	public Arquero() {
		super.ataque = ATK_ARQUERO;
		super.energia = VDA_FULL;
		super.velAtaque = ASP_ARQUERO;
	}
	
	@Override
	public boolean atacar() {
		// TODO Auto-generated method stub
		return false;
	}

}
