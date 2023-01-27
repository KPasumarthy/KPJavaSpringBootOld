package com.kpjavaspringboot.interview;

public class KPPolymorphism {

	public void main(String args[]) {

			Parent parent = new Child();

			System.out.println("Class : "+ parent.className);
		}

	class Parent {
		public String className = "Parent";

		void print() {
			System.out.println("Class from child : "+ className);
		}


	}
	class Child extends Parent {
		public String className = "Child";

		void print() {
			System.out.println("Class from parent : "+ super.className);
		}
	}



}
