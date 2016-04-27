import java.util.Scanner;

public class TransforNumber
{		

	
	public static void main(String[] args)
    {
    	int n=0 ;
    	int  digit[];
    	digit=new int[10]; 
    	String ConvertNumber = "" ;
    	System.out.println("請入金額轉換為中文數字");
		Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int number1=number;
        //判斷幾位數
    	while(number!=0)
    	{	
    		number=number/10;
    		n++;
    	}
    	int i=n-1;
    	//儲存每一個數
    	while(number1!=0)
    	{    		
    		digit[i]=number1%10;
    		number1=number1/10;
    		i--;
    	}
    	int InverseN=0;
    	while(n!=0)
    	{
    		System.out.print(CNumber(digit[InverseN])+CUnit(n-1));
    		InverseN++;
    		n--;
    	}
    	

    	
    }
	
	private static String CNumber(int digit){
		switch(digit){
		case 0:
			return "零";
		case 1:
			return "壹";
		case 2:
			return "貳";
		case 3:
			return "參";
		case 4:
			return "肆";
		case 5:
			return "伍";
		case 6:
			return "陸";
		case 7:
			return "柒";
		case 8:
			return "捌";
		case 9:
			return "玖";
		default:
			return "";
		}
	};
	
	private static String CUnit(int n){

		switch(n){
		case 0:
			return "元";
		case 1:
			return "拾";
		case 2:
			return "佰";
		case 3:
			return "仟";
		case 4:
			return "萬";
		case 5:
			return "拾";
		case 6:
			return "佰";
		case 7:
			return "仟";
		case 8:
			return "億";
		case 9:
			return "拾";
		default:
			return "";
		}
	};
	


}