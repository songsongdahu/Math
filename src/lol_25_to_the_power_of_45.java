
public class lol_25_to_the_power_of_45 {
	public String multiplication(String num1, int num2){
		
		//length��ʾ��num1�ֳɼ��Σ�ÿ��8λ��
		int length = num1.length()/8;
		
		if(length*8<num1.length()){
			//��0��ȫnum1��8��������
			int s = (length+1)*8-num1.length();
			for(int i=0;i<s;i++){
				num1 = "0" + num1; 
			}
			length++;
		}
		
		//result
		String[] res_pt = new String[length];
		
		//���num1
		String[] num1pt = new String[length];
		for(int i=length-1;i>=0;i--){
			num1pt[i] = num1.substring(i*8, (i+1)*8);
		}
		
		//�趨��λ���ֶμ���
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
		
		//�����߶����н�λ���򲹵�ǰ��
		if(plus!=0){
			res_pt[0] = plus + "" + res_pt[0]; 
		}
		
		//���ɽ��
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
