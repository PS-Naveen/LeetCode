class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j < i+1 ; j++){
                if(j == 0 || i == j){
                    row.add(1);
                } else {
                    List<Integer> prev = pascal.get(i-1);
                    row.add(prev.get(j) + prev.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}