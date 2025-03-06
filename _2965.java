class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> dup=new LinkedHashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               if(!set.add(grid[i][j])) 
                  dup.add(grid[i][j]);
            }
        }
        List<Integer> org=new ArrayList<>(set);
        List<Integer> ls=new ArrayList<>(dup);
        Collections.sort(org);
        System.out.println(org);
        System.out.println(ls);
    for(int i=0;i<org.size())
        int arr[]=new int[5];
        return arr;
    }
}