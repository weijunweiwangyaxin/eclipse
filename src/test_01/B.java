package test_01;

public class B extends A{

	public int m =method3();
	public static int n =method4();
	public int t =0;
	public B(){
		System.out.println(4);
	}
	public int method3(){
		System.out.println(5);
		return 5;
	}
	public static int method4(){
		System.out.println(6);
		return 6;
		
		
		
	}
	public static void main(String[] args) {
		/*System.out.println(7);
		A a  =new B();*/
		String s="AAA rating";
        int number=getNumber(s,'A');
        System.out.println(number);
        
        
    }
    public static int getNumber(String s,char a){
        int number=0;
        if(s.indexOf(a)!=-1){
            s=s.substring(s.indexOf(a)+1,s.length());
            number=getNumber(s,a)+1;
        }
        return number;
    }
	
}
