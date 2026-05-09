package demoPractice;



public class A {
	
		
		void display() {
			System.out.println("print A");
		}
		
		class B  extends A {
			
			
			@Override
			final void display()
			{
			System.out.println("b print");
			}
		
			class C extends B {

}
		}
}
