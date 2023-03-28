package book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class booktest {
	

	@ParameterizedTest
	@CsvSource({
		"titre, titre",
		"test, test"
	})
	void titre(String titre,String expected) {
		Book book = new Book(titre,"auteur","date");
		assertEquals(expected,book.getTitre());
	}
	
	@ParameterizedTest
	@CsvSource({
		"auteur, auteur",
		"test, test"
	})
	void auteur(String auteur,String expected) {
		Book book = new Book("titre",auteur,"date");
		assertEquals(expected,book.getAuteur());
	}
	
	@ParameterizedTest
	@CsvSource({
		"date, date",
		"test, test"
	})
	void date(String date,String expected) {
		Book book = new Book("titre","auteur",date);
		assertEquals(expected,book.getDate());
	}

}
