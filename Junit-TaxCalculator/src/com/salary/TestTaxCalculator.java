package com.salary;

import org.junit.Assert;
import org.junit.Test;
import com.salary.CountryNotValidException;
import com.salary.EmployeeNameInvalidException;
import com.salary.TaxCalculator;
import com.salary.TaxNotEligibleException;

public class TestTaxCalculator {
	@Test(expected = CountryNotValidException.class)
	public void testCase1() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Ron", 34000, false);
		@SuppressWarnings("unused")
		double tax = taxCalculator.getTaxAmount();
//Assert.assertEquals(0, tax,0);
	}

	@Test(expected = TaxNotEligibleException.class)
	public void testCase2() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Tom", 1000, true);
		@SuppressWarnings("unused")
		double tax = taxCalculator.getTaxAmount();
//Assert.assertEquals(0, tax,0);
	}

	@Test
	public void testCase3() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Jack", 55000, true);
		double tax = taxCalculator.getTaxAmount();
		Assert.assertEquals(3300, tax, 0);
	}

	@Test(expected = EmployeeNameInvalidException.class)
	public void testCase4() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("", 30000, true);
		@SuppressWarnings("unused")
		double tax = taxCalculator.getTaxAmount();
//Assert.assertEquals(0, tax,0);
	}
}