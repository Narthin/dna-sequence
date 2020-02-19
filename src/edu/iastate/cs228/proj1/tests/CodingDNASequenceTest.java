package edu.iastate.cs228.proj1.tests;
import edu.iastate.cs228.proj1.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CodingDNASequenceTest {

	@Test
	public void test1() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
		CodingDNASequence seq = new CodingDNASequence(str.toCharArray());
		assertFalse(seq.checkStartCodon());
	}

	@Test
	public void test2() {
		String str = new String("ATGCCAGTCAGCATAGCGTAGACT");
		CodingDNASequence seq = new CodingDNASequence(str.toCharArray());
		assertTrue(seq.checkStartCodon());
	}
	
	@Test(expected = RuntimeException.class)
	public void test3() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
		CodingDNASequence seq = new CodingDNASequence(str.toCharArray());
		seq.translate();
	}
}
