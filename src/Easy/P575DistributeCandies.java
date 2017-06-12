package Easy;
import java.util.HashSet;
import java.util.Set;

public class P575DistributeCandies {
	public static int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<Integer>();
        for(int i=0;i<candies.length;i++){
            kinds.add(candies[i]);
        }
        return Math.min(kinds.size(), candies.length / 2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,3,3};
		System.out.println(distributeCandies(arr));
	}

}
