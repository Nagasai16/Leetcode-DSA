class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap<>();
        for(String a : strs){
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(a);
        }
        return new ArrayList<>(map.values());
    }
}