package com.kpjavaspringboot;

//import com.kpjavaspringboot.KPJavaSpringBootApplication.NestedStaticClass;

public class KPJavaInterviewExamples {

	public static void getInterviewQuestions() {


		///************************************ KP : Interview Questions : Q&A *****************************************///
		
		
		/// KP : Q&A : 1 - Can we add a variable of datatype 'byte'? What will happen if
		/// we do not cast 'addition' operation?
		System.out.println(
				"KP : Can We add a variable of datatype 'byte'? What will happen if we do not cast 'addition' operation?");
		byte b = 10;
		b = (byte) (b + 1);
		System.out.println(
				"Value of the 'byte' type variable 'b' resulting in operation cast 'addition' operation? \n" + b);
		/// KP : Q&A : 1 - Can we add a variable of datatype 'byte'? What will happen if
		
		
		
		//// KP : Q&A : 2 - Can We declare a Top Level Class as Static in Java?
		System.out.println("KP : Can We declare a Top Level Class as Static in Java?");
		NestedStaticClass nscObj = new NestedStaticClass();
		nscObj.printMessage();
		//// KP : Q&A : 2 - Can We declare a Top Level Class as Static in Java?
		
		
		
		//// KP : Q&A : 3 - Can Java have multiple inheritances?
		System.out.println("KP : Can Java have multiple inheritances?");
		Piglet piglet = new Piglet();
		piglet.canBreath();
		piglet.animalSound();
		piglet.sleep();
		piglet.willDie();
		
		System.out.println("KP : Can Java have a single implmentation of an Interface?");
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		//// KP : Q&A : 3 - Can Java have multiple inheritances?
		
					
		
		///************************************ KP : Interview Questions : Q&A *****************************************///		
		
	}


	///************************************Java Static & Nested Sub-Classes *****************************************///
	
	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class
		// is directly accessible in nested
		// static class
		public void printMessage() {

			// Try making 'message' a non-static
			// variable, there will be compiler error
			System.out.println(
					"Java Classes can be declared 'Static' only as a 'Sub-Class' in Java! Message from nested static class");
		}
	}
	///************************************Java Static & Nested Sub-Classes *****************************************///
	
	
	
	///************************************Java Interfaces & Implementations *****************************************///

	// interface
	interface Animal {
		public void animalSound(); // interface method (does not have a body)

		public void sleep(); // interface method (does not have a body)
	}
	
	// interface
	interface LivingBeing {
		public void canBreath(); // interface method (does not have a body)

		public void willDie(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	static class Pig implements Animal {
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("The pig says: wee wee");
		}

		public void sleep() {
			// The body of sleep() is provided here
			System.out.println("The pig sleeps: Zzz");
		}
	}

	// Pig "implements" the Animal & LivingBeing interface
	public static class Piglet implements Animal, LivingBeing {
		@Override
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("The piglet says: wee wee");
		}

		@Override
		public void sleep() {
			// The body of sleep() is provided here
			System.out.println("The piglet sleeps: Zzz");
		}

		@Override
		public void canBreath() {
			// TODO Auto-generated method stub
			System.out.println("The piglet canBreath: Breaths - Hence Alive ");
			
		}

		@Override
		public void willDie() {
			// TODO Auto-generated method stub
			System.out.println("The piglet willDie: Death is the eventual end of life - Hence a Living Being ");
			
		}
	}
	
	///************************************Java Interfaces & Implementations *****************************************///
	
	
}
