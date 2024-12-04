package day7;

public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {100,200,400,300};
		
		int s =300;
		boolean flag = false;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==s) {
//				System.out.println("ELement "+a[i]+" is present in the Array at the index : "+i);
//				flag = true;
//				break;
//
//			}
//		}
		
		for(int x:a) {
			if(x==s) {
				System.out.println("ELement "+x+" is present in the Array");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Element not found in the Array");
		}
	}

}
