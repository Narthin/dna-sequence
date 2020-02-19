package edu.iastate.cs228.proj1.tests;
import edu.iastate.cs228.proj1.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProteinSequenceTest {
//"AaCcDdEeFfGgHhIiKkLlMmNnPpQqRrSsTtVvWwYy"
	@Test
	public void test1() {
		String s1 = "AaCcDdEeFfGgHhIiKkLlMmNnPpQqRrSsTtVvWwYy";
		ProteinSequence p1 = new ProteinSequence(s1.toCharArray());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		String s1 = "BJOUXZ";
		ProteinSequence p1 = new ProteinSequence(s1.toCharArray());
	}

}
