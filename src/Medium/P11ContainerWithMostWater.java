package Medium;

public class P11ContainerWithMostWater {
	public static int maxArea(int[] height) {
		if (height.length < 2) return 0; 
		int area = 0;
		int left = 0;
		int right = height.length - 1;
		int temp = 0;
		while(left < right){
			temp = (right - left)*Math.min(height[left], height[right]);
			if(temp > area){
				area = temp;
			}
			if(height[left]<height[right]){
				left ++;
			}else{
				right--;
			}
		}
		return area;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 3;
		System.out.println(maxArea(arr));
	}

}
