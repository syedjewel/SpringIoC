package solution3;

import problem.ClassB;

class ClassA {

	  ClassB classB;

	  /* Constructor Injection */
	  ClassA(ClassB injected) {
	    classB = injected;
	  }

	  int tenPercent() {
	    return classB.calculate() * 10;
	  }
	}