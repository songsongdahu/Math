
public class lol_integral {
	
	//a,�������� b����������
	public double integral(double a, double b){
		int n = 1000000;//n�Ƿ���
		double s = (b-a)/n;//s�����䳤��
		double rtn = 0;
		for(int i=0;i<n;i++){
			rtn+= (function(a+i*s)+function(a+(i+1)*s))*s/2;
		}
		return rtn;
	}
	
	//��������f(x)=e^(x^2)
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
