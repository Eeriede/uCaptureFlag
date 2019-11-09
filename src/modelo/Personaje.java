package modelo;

import common.iConstants;

public abstract class Personaje implements iConstants {
	protected int energia;
	protected int ataque;
	protected double velAtaque;
	
	public abstract boolean atacar();
}