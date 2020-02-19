package edu.iastate.cs228.proj1.tests;

import edu.iastate.cs228.proj1.Sequence;
import edu.iastate.cs228.proj1.DNASequence;
import edu.iastate.cs228.proj1.GenomicDNASequence;
import edu.iastate.cs228.proj1.CodingDNASequence;
import edu.iastate.cs228.proj1.ProteinSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceTest {

	@Test
	public void test1() {
		char c[] = {'L','m','A','o'};
		Sequence s = new Sequence(c);
		assertEquals("LmAo",new String(s.getSeq()));
		assertEquals(4,s.seqLength());
		assertEquals("LmAo",s.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		char c[] = {'7','$','&'};
		Sequence s = new Sequence(c);
	}
	
	@Test
	public void test3() {
		char ac[] = {'L','m','A','o'};
		Sequence as = new Sequence(ac);
		char bc[] = {'L','m','A','o'};
		Sequence bs = new Sequence(bc);
		char cc[] = {'L','m','A'};
		Sequence cs = new Sequence(cc);
		assertTrue(as.equals(bs));
		assertFalse(as.equals(cs));
	}

}
