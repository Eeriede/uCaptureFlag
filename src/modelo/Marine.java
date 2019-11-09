package modelo;

public class Marine extends Personaje {

	public Marine() {
		super.ataque = ATK_MARINE;
		super.energia = VDA_FULL;
		super.velAtaque = ASP_MARINE;
	}
	
	@Override
	public boolean atacar() {
		// TODO Auto-generated method stub
		return false;
	}

}
