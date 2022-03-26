package br.com.fuctura;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sistema {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Fuctura-PU");

	}

}
