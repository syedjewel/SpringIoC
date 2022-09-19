package solution1;

import problem.ClassB;

public class ClintAp {

	 public static void main(String... args) {
		    ClassA classA = new ClassA();
		    ClassB classB = new ClassB();

		    classA.setClassB(classB);

		    System.out.println("Ten Percent: " + classA.tenPercent());
		  }

}

//Setter Injection (Not recommended)

//With this approach, we remove the new keyword from our ClassA. Thus, we move the responsibility for the creation of ClassB away from ClassA.

//ClassA still has a hard dependency on ClassB but now it can be injected from the outside:
	
	//The above example is better than the initial approach because now we can inject in ClassA an instance of ClassB or even better, a subclass of ClassB: