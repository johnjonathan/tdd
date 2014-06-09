package com.tdd.tranning.shapes;

public class Triangulo {

	private int x, y, z;

	public Triangulo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String retornaTipo() {
		String retorno = null;
		if (x <= 0 | y <= 0 | z <= 0){
			retorno = "Triangulo invalido";
		}else{
			if (x == y & y == z) {
				retorno = "O triangulo e equilatero";
			} else if (x == y || x == z || y == z) {
				retorno = "O triangulo e isosceles";
			} else {
				retorno = "O triangulo e escaleno";
			}
		}
			
		return retorno;
	}

	public boolean isValido() {
		if (x == 0 | y == 0 | z == 0)
			return false;

		return true;
	}

}
