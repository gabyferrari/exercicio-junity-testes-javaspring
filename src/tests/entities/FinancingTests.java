package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateCorrectObjectWhenDataIsValid() {
		
		//Arrange
		
		//Act
		Financing fin = new Financing(100000.0, 2000.0, 80);
		
		//Assert
		Assertions.assertEquals(100000.0, fin.getTotalAmount());
		Assertions.assertEquals(2000.0, fin.getIncome());
		Assertions.assertEquals(80, fin.getMonths());
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenDataIsInvalid() {
		
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			//Arrange
			
			//Act
			new Financing(100000.0, 2000.0, 20);
		});
	}

}
