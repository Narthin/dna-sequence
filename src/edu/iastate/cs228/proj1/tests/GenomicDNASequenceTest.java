package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import edu.iastate.cs228.proj1.*;

import org.junit.AfterClass;
import org.junit.Test;

public class GenomicDNASequenceTest {

	@Test
	public void test1() {
		 String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
		 GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(5, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test3() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(-5, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test4() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(5, 50);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test5() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 24);
    	int exp[] = {};
    	seq.extractExons(exp);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 24);
    	int exp[] = {1,2,7};
    	seq.extractExons(exp);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test7() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 24);
    	int exp[] = {1,2,5,100};
    	seq.extractExons(exp);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test8() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 24);
    	int exp[] = {-1,3,5,7};
    	seq.extractExons(exp);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test9() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 24);
    	int exp[] = {5,4,3,2};
    	seq.extractExons(exp);
	}
	
	@Test(expected = IllegalStateException.class)
	public void test10() {
		String str = new String("AATGCCAGTCAGCATAGCGTAGACT");
    	GenomicDNASequence seq = new GenomicDNASequence(str.toCharArray());
    	seq.markCoding(0, 12);
    	int exp[] = {1,2,10,19};
    	seq.extractExons(exp);
	}
}
