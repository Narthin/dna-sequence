package edu.iastate.cs228.proj1;

//import javax.print.attribute.standard.MediaSize.JIS;

/*
 * @author Jordan Fox
*/

public class Sequence
{
  protected char[] seqarr;

  /**
   The constructor first uses the {@link #isValidLetter(char)} method to check
   if every character in the array {@code sarr} is valid. If so, it makes and
   keeps a copy of the array {@code sarr} in the field {@code seqarr} of type 
   {@code char[]} with {@code protected} access. Otherwise, it throws an  
   {@link java.lang.IllegalArgumentException} with the message
   {@code "Invalid sequence letter for class X"} where {@code X} denotes 
   {@code  'edu.iastate.cs228.proj1.Sequence'} or the name of a subclass of which an object is created. 
   Examples are given in the project description page to 
   illustrate what exactly is denoted by {@code X} after the subclasses of class
   {@code Sequence} are defined. Note that the length of the field {@code seqarr} is 
   equal to the length of the array {@code sarr}. This constructor should be implemented 
   in such a way that it is unnecessary to have more than one line of code in the body 
   of the constructor of any subclass of this class.
   
   @param sarr See {@link #Sequence(char[])}.
   @throws IllegalArgumentException See {@link #Sequence(char[])}.
  */  
  public Sequence(char[] sarr)
  {
    int L = sarr.length;
    seqarr = new char[L];
    for(int x = 0; x < L; x++)//transcribe sarr into seqarr
    {
    	if(isValidLetter(sarr[x]))//test valid letter
    		seqarr[x] = sarr[x];
    	else
    	{
    		seqarr = null;//clear seqarr if error occurs
    		throw new IllegalArgumentException("Invalid sequence letter for class " + this.getClass());//WHAT IS X
    	}
    }//end for loop
  }//end constructor

  
  /**
   The method returns the length of the character array {@code seqarr}.
   @return See {@link #seqLength()}.
  */
  public int seqLength()
  {
    return seqarr.length;
  }//end seqLength
  
  /**
   The method creates and returns a copy of {@code char} array {@code seqarr}.
   @return See {@link #getSeq()}.
  */
  public char[] getSeq()
  {
    int L = seqLength();
    char seq[] = new char[L];
    for(int x = 0; x < L; x++)//transcribe seqarr into new array
    	seq[x] = seqarr[x];
    return seq;
  }//end getSe1

  /**
   The method returns the string representation of the {@code char} arrar {@code seqarr}.
   @return See {@link #toString()}.
  */
  public String toString()
  {
    String str = "";
    int L = seqarr.length;
    for(int x = 0; x < L; x++)//add each letter in seqarr to end of str
    	str = str + seqarr[x];
    return str;
  }//end toString

  /**
   The method returns {@code true} if the arguments {@code obj} is not {@code null} and
   is of the same type as this object such that both objects represent the identical sequence
   of characters in a case insensitive mode ("ACgt" is identical to "AcGt").
   The {@link #equals(Object)} method should be defined in such a way that there is no need to
   define it again in any subclass of class {@code Sequence}. In other words, when an object 
   of the subclass calls the {@link #equals(Object)} method, it should return the right answer.
   
   @return See {@link #equals(Object)}
  */
  public boolean equals(Object obj)
  { 
    if(obj != null && obj instanceof Sequence)
    	return (this.toString()).equalsIgnoreCase(obj.toString());//compare sequences as strings
    else
    	return false;
  }//end equals

  
  /**
   The method returns {@code true} if the character {@code let} is an 
   uppercase (e.g., invoking {@link java.lang.Character#isUpperCase(char)} 
   with {@code let} is {@code true}) or lowercase ((e.g., invoking 
   {@link java.lang.Character#isLowerCase(char)} with {@code let} is {@code true})). Otherwise,
   it returns {@code false}.
   @param let See {@link #isValidLetter(char)}.
   @return See {@link #isValidLetter(char)}.
  */
  public boolean isValidLetter(char let)
  {
    return Character.isUpperCase(let) || Character.isLowerCase(let);//test if let is a letter
  }//end isValidLetter
 
}//end Sequence
