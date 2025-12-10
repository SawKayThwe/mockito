package com.mylearn.mockito.test_doubles.stub;

import org.junit.jupiter.api.Test;

public class StubTest {
	
	@Test
	public void demoStub() {
		BookRepository bookRepository = new BookRepositoryStub();
		BookService bookService = new BookService(bookRepository);
	}

}
