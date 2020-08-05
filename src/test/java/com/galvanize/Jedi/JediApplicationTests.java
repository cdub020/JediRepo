package com.galvanize.Jedi;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JediApplicationTests {

	LightSaber newlightsaber = new LightSaber(10);

	@Test
	public void getsSerialNumber(){
		assertEquals(10, newlightsaber.getJediSerialNumber());
	}

	@Test
	public void getTheCharge(){
		assertEquals(100.0f, newlightsaber.getCharge());
	}

	@Test
	public void setTheCharge(){
		assertEquals(100.0f, newlightsaber.getCharge());
		newlightsaber.setCharge(200.0f);
		assertEquals(200.0f, newlightsaber.getCharge());
	}

	@Test
	public void getTheColor(){
		assertEquals("green", newlightsaber.getColor());
	}

	@Test
	public void setTheColor(){
		assertEquals("green", newlightsaber.getColor());
		newlightsaber.setColor("red");
		assertEquals("red", newlightsaber.getColor());
	}

	@Test
	public void useLightSaber(){
		LightSaber newlightsaber2 = new LightSaber(20);

		newlightsaber2.use(10.0f);
		assertEquals(98.333336f, newlightsaber2.getCharge());
		assertEquals(295, Math.round(newlightsaber2.getRemainingMinutes()));
	}

	@Test
	public void rechargeLightSaber() {
		LightSaber newlightsaber3 = new LightSaber(20);

		newlightsaber3.use(10.0f);
		assertNotEquals(100.0f, newlightsaber3.getCharge());
		newlightsaber3.recharge();
		assertEquals(100.0f, newlightsaber3.getCharge());
	}

}
