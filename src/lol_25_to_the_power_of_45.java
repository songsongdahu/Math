
public class lol_25_to_the_power_of_45 {
	public String multiplication(String num1, int num2){
		
		//length表示把num1分成几段（每段8位）
		int length = num1.length()/8;
		
		if(length*8<num1.length()){
			//用0补全num1到8的整数倍
			int s = (length+1)*8-num1.length();
			for(int i=0;i<s;i++){
				num1 = "0" + num1; 
			}
			length++;
		}
		
		//result
		String[] res_pt = new String[length];
		
		//拆分num1
		String[] num1pt = new String[length];
		for(int i=length-1;i>=0;i--){
			num1pt[i] = num1.substring(i*8, (i+1)*8);
		}
		
		//设定进位，分段计算
		long plus = 0;
		for(int i=length-1;i>=0;i--){
			long temp_result = (long)Integer.parseInt(num1pt[i])*(long)num2+plus;
			plus = 0;
			if(temp_result>=100000000){
				plus = temp_result/100000000;
				temp_result = temp_result%100000000;
			}
			res_pt[i] = ""+temp_result;
		}
		
		//如果最高段仍有进位，则补到前面
		if(plus!=0){
			res_pt[0] = plus + "" + res_pt[0]; 
		}
		
		//生成结果
		String result = "";
		for(int i=0;i<length;i++){
			int s = 8-res_pt[i].length();
			for(int j=0;j<s;j++)
				res_pt[i] = "0" + res_pt[i];
			result += res_pt[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "25";
		for(int i=1;i<45;i++){
			s = new lol_25_to_the_power_of_45().multiplication(s, 25);
		}
		System.out.println(s);
		
	}
}
