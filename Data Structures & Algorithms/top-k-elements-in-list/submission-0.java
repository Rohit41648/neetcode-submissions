class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0;i<=nums.length;i++)
        {
            buckets.add(new ArrayList<>());
        }
        for(int num:map.keySet())
        {
            int freq=map.get(num);
            buckets.get(freq).add(num);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.size()-1;i>=0;i--)
        {
            for(int num:buckets.get(i))
            {
                result[index++]=num;
                if(index==k){
                    return result;
                }
            }
        }return result;
    }
}
