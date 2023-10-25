class Solution {
    public String frequencySort(String s) {
        
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character> li = new ArrayList<>(hm.keySet());
        li.sort((ob1,ob2)->hm.get(ob2)-hm.get(ob1));
        for(char ch:li){
            for(int i=0;i<hm.get(ch);i++){
                sb.append(ch);
               }
        }
        return sb.toString();
        
    }
}