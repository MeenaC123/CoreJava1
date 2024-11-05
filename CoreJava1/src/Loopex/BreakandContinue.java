package Loopex;

public class BreakandContinue {
	public static void main(String[]args) {
		String[] nums= {"One","Two","Three","Four","Five","Six","Sev"};
		for(int i=0;i<nums.length; i++) {
			if(nums[i++].length()% 3==0) {
				continue;
			}
			System.out.println(nums[i]);
			break;
		}
	}

}
//          int a=1;
//          while(a<=5){
 //           if (a==2) {
//                a++;
//                 //continue;
//                     break;
//                  }
//                System.out.out.println(a);
//                 a++;
//               }


