package maxarray;

public class Array {

	public static void main(String[] args) {
		int a[] = new int[] {75,11,7,25,56};
		int max=a[0];
		for(int i=0;i>a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("max element :"+max);
		

	

}
}

