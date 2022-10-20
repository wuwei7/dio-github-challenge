package junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
	
	@Test
	void mustCalculateAge() {
		Person juliana = new Person("Juliana", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
		Assertions.assertEquals(22, juliana.getAge());
	}
	
	@Test
	void mustReturnIsOfAge() {
		Person juliana = new Person("Juliana", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
		Assertions.assertTrue(juliana.isOfAge());
		
		Person devin = new Person("Devin", LocalDateTime.now());
		Assertions.assertFalse(devin.isOfAge());
	}

}
