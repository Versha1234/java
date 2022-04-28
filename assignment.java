class employee {

	public int add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public static int sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
		return c;
	}
 }
class Demo1{

	public static void main(String[] args) {
		employee obj=new employee();
		obj.add();
		obj.sub();
		// TODO Auto-generated method stub

	}

}

