
public class lol_integral {
	
	//a,积分上限 b，积分下限
	public double integral(double a, double b){
		int n = 1000000;//n是份数
		double s = (b-a)/n;//s是区间长度
		double rtn = 0;
		for(int i=0;i<n;i++){
			rtn+= (function(a+i*s)+function(a+(i+1)*s))*s/2;
		}
		return rtn;
	}
	
	//被积函数f(x)=e^(x^2)
	public double function(double x){
		double rtn = Math.E;
		rtn = Math.pow(rtn, x);
		return rtn;
	}
	
	public static void main(String[] args) {
		//System.out.println(Math.pow(Math.E, -10));
		System.out.println(new lol_integral().integral(0,+100000));
	}
	

}
