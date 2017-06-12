package Easy;

public class P463IslandPerimeter {
	public static int islandPerimeter(int[][] grid) {
		int count = 0;
		int line = 4;
		int res = 0;
        for(int i=0;i<grid.length;i++){
        	for(int j=0;j<grid[i].length;j++){
        		line = 4;
        		if(grid[i][j] == 1){
        			count ++;
        			if(i<grid.length - 1&&grid[i+1][j] == 1){
        				line = line - 2;
        			}
        			if(j<grid[i].length - 1&&grid[i][j+1] == 1){
        				line = line - 2;
        			}
        			res = res + line;
        		}
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(islandPerimeter(arr));
	}

}
