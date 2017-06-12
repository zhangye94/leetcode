package Easy;
import java.util.HashSet;
import java.util.Set;

public class P349IntersectionOfTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
        	arr1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
        	if(arr1.contains(nums2[i])){
        		res.add(nums2[i]);
        	}
        }
        int[] result = new int[res.size()];
        int i=0;
        for(int s:res){
        	result[i++] = s;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2,2};
		int[] arr = intersection(nums1,nums2);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
