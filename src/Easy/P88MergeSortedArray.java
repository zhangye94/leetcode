package Easy;

public class P88MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums1==null||nums2==null||m<0||n<0){
            return;
        }
		int index = m+n-1;
		int index1 = m-1;
		int index2 = n-1;
		while(index1>=0&&index2>=0){
			if(nums1[index1]<nums2[index2]){
				nums1[index--] = nums2[index2--];
			}else{
				nums1[index--] = nums1[index1--];
			}
		}
		while(index1>=0){
			nums1[index--] = nums1[index1--];
		}
		while(index2>=0){
			nums1[index--] = nums2[index2--];
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		a[0] = 0;
        int[] b = {1};
        merge(a,0,b,1);
        for(int i = 0;i < 2;i++){
        	System.out.print(a[i]+" ");
        }
	}

}
