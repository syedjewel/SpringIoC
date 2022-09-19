package solution3;

import problem.ClassB;
import solution2.ImprovedClassB;

public class ClintAp {

	public static void main(String... args) {
	    /* Notice that we are creating ClassB fisrt */
	    ClassB classB = new ImprovedClassB();

	    /* Constructor Injection */
	    ClassA classA = new ClassA(classB);

	    System.out.println("Ten Percent: " + classA.tenPercent());
	  }
}


//Constructor Injection (Highly recommended).
//ClassA still has a hard dependency on ClassB 
//but now it can be injected from the outside using the constructor:
