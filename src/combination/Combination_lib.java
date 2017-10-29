package combination;

public class Combination_lib {
	private int s,r,i,f,n;
	
	public Combination_lib(int s, int r) {
		this.s = s;
		this.r = r;
	}
	
	public int getFactorial(int n) {
		int f = 1;
		for(int i = 2;i <= n; i++)
			f *=i;
		return f;
	}
	

}
