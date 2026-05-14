class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        // bucket sort technique
    
        List<List<Integer>> buckets = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            buckets.add(new ArrayList<>());
        }

        for( Map.Entry<Integer, Integer> map   :  freqMap.entrySet()){

            buckets.get(map.getValue()-1).add(map.getKey()); 
        }


        int[] ans = new int[k];

        int a = 0;

        for( int i=n-1; i>=0; i--){
            int s = buckets.get(i).size();
            for(int j=s-1; j >=0 ; j--){
                ans[a] = buckets.get(i).get(j);
                a++;
                if(a >= k){
                    return ans;
                }
            }
        }

        return ans;

    }
}
