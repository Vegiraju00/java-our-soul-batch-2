package jor.batch2.example;

interface A{
	int m1();
}

public class ArrayTest {

	public static void main(String[] args) {
		ArrayStores as=new ArrayStores();
		as.assignNumbers();
		as.generateMirror();
		as.print();
		
		//A a1=new A();
//		A a1=new A() {
//			int m1() {
//				return 1;
//			}
//		};
//		A a2=()->{return 1};
		
		A a3=()-> 1;
//		int x=1; x++;
//		A a4=()->{return x;};
		System.out.println(a3.m1());

	}

}
