package modelo;

import common.iConstants;

public class CreadorPersonajes implements iConstants  {
	public Personaje factory(int pTipo) {
		switch(pTipo) {
		case FTY_MARINE:
			return new Marine();
		case FTY_GOLPEADOR:
			return new Golpeador();
		case FTY_ARQUERO:
			return new Arquero();
		default:
			return null;
		}
	}
}
