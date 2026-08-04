class Solution {
    public int totalFruit(int[] fruits) {
        int right=0;
        int left=0;int maxFruit=0;

        Map<Integer,Integer> map=new HashMap<>();
        while(right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){//if
                map.put(fruits[left],map.get(fruits[left])-1);

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxFruit=Math.max(maxFruit,right-left+1);
            right++;
        }
        return maxFruit;
    }
}