package bao.java.chuxue;

public class Study180719 {
	
	public static void main(String[] args) {
		int[] a={12,25,34,24,5,68,95,13};
		int t; 
		for(int i=0;i<a.length-1;i++){//排序次数
			for(int j=0;j<a.length-1-i;j++){//比较次数
				if(a[j] <a[j+1]){//比较
					t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}	
			}
		}
		for (int i : a) {
			System.out.print(i+",");
		}
	}

}
