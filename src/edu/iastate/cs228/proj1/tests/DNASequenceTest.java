package edu.iastate.cs228.proj1.tests;

import edu.iastate.cs228.proj1.Sequence;
import edu.iastate.cs228.proj1.DNASequence;
import edu.iastate.cs228.proj1.GenomicDNASequence;
import edu.iastate.cs228.proj1.CodingDNASequence;
import edu.iastate.cs228.proj1.ProteinSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class DNASequenceTest {

	@Test
	public void test1() {
		String s1 = "gattaca";
		String s2 = "GATTACA";
		DNASequence d1 = new DNASequence(s1.toCharArray());
		DNASequence d2 = new DNASequence(s2.toCharArray());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		String s1 = "great gatsby";
		DNASequence d1 = new DNASequence(s1.toCharArray());
	}

}
