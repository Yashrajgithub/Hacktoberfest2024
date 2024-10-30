class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int tar) {
        // code here
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == tar){
                ans.add(1);
                ans.add(i+1);
                return ans;
            }
            
            if(sumMap.containsKey(sum-tar)){
                ans.add(sumMap.get(sum-tar)+1);
                ans.add(i+1);
                return ans;
            }
            
            sumMap.put(sum, i+1);
        }
        ans.add(-1);
        return ans;
    }
}
