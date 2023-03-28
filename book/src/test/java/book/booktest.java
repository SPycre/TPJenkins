package book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class booktest {
	

	@ParameterizedTest
	@MethodSource("getTitre")
	void titre(String titre,String auteur,String date) {
		Book book = new Book(titre,auteur,date);
		assertEquals(titre,book.getTitre());
	}
	
	@ParameterizedTest
	@MethodSource("getAuteur")
	void auteur(String titre,String auteur,String date) {
		Book book = new Book(titre,auteur,date);
		assertEquals(titre,book.getAuteur());
	}
	
	@ParameterizedTest
	@MethodSource("getDate")
	void date(String titre,String auteur,String date) {
		Book book = new Book(titre,auteur,date);
		assertEquals(titre,book.getDate());
	}

}
