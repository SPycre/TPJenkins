package book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBook {
	

	@Test
	void titre() {
		Book book = new Book("titre","auteur","date");
		assertEquals("titre",book.getTitre());
	}
	
	@Test
	void auteur() {
		Book book = new Book("titre","auteur","date");
		assertEquals("auteur",book.getAuteur());
	}
	
	@Test
	void date() {
		Book book = new Book("titre","auteur","date");
		assertEquals("date",book.getDate());
	}

}
