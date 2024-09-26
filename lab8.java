/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class lab8
{
	public static void main(String[] args) {
		star(5);
		star(5,7);
		star(1,3,5);
	}
	public static void star(int n){
	    int i,num=0;
	    for(i=1;i<=n;i++)
	        num+=i;
	    System.out.println(num);
	}
	public static void star(int a,int b){
	    int max=a;
	    if(b>max)
	        max=b;
	   System.out.println(max);
	}
	public static void star(int a,int b,int c){
	   System.out.println(a*b*c);
	}
}
