package solution1;

import problem.ClassB;

class ClassA {

	  ClassB classB;

	  /* Setter Injection */
	  void setClassB(ClassB injected) {
	    classB = injected;
	  }

	  int tenPercent() {
	    return classB.calculate()* 10;
	  }
	}