class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(k == 0) return new int[]{};


        //Map to calculate frequency of each number in the array
          Map<Integer, Integer> freqMap = new HashMap<>();

        //Here adding the number as key and value as it's freq in the array.
          for(int currNum : nums)
          {
              freqMap.put(currNum, freqMap.getOrDefault(currNum, 0) + 1);
          }

        // PQ in descending order to store the number with highest freq at the top

          PriorityQueue<Integer> freqMaxHeap = new PriorityQueue((a,b) -> freqMap.get(b) - freqMap.get(a));
        
        //adding all the key value in PQ from Map
          freqMaxHeap.addAll(freqMap.keySet());

          int i = 0;
          int[] output = new int[k]; //for returning outupu

        //All the number requested untik the kth postition
          while(i < k)
          {

              output[i] = freqMaxHeap.poll(); //.poll() gives the top number with the highest freq and removes it from pq
              i++;
          }

        //returning the output;
        return output; 
    }
}