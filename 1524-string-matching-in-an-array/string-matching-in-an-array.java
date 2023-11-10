class Solution {
    public List<String> stringMatching(String[] words) {
      Set<String> s = new TreeSet<>();
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    s.add(words[j]);
                } else if (words[j].contains(words[i])) {
                    s.add(words[i]);
                }
            }
        }

        return s.stream().collect(Collectors.toList());  
    }
}