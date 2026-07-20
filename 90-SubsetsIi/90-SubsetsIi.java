// Last updated: 7/21/2026, 12:53:46 AM
class Solution {
    private void solve(int ind,int[] nums,List<Integer>ds,Set<List<Integer>>resSet){
        if(ind==nums.length){
            resSet.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        solve(ind+1,nums,ds,resSet);
        ds.remove(ds.size()-1);
        solve(ind+1,nums,ds,resSet);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>resSet=new HashSet<>();
        List<Integer>ds=new ArrayList<>();
        solve(0,nums,ds,resSet);
        return new ArrayList<>(resSet);
        
    }
}