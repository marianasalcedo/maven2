package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest{
	
	User user;
	
	@Before
	public void before() {
		user = new User(123333, "Mariana", "Salcedo");
	}

	@Test
	public void testUserIntStrStr() {
		assertEquals("Salcedo", this.user.getFamilyName());
		assertEquals("Mariana", this.user.getName());
		assertEquals(123333, this.user.getNumber());
	}

	@Test
	public void testFullName() {
		assertEquals("Mariana Salcedo", this.user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("M.", this.user.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(123333, this.user.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Mariana", this.user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Salcedo", this.user.getFamilyName());
	}

}
