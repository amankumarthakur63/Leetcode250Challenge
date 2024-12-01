package SearchingAndSorting;

import java.util.*;

public class Day27SearchSuggestionSystem {

    TrieNode root = new TrieNode();
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for(int i = 0; i < products.length; i++){
            TrieNode curr = root;
            for(char c : products[i].toCharArray()){
                if(curr.childMap.get(c) == null){
                    curr.childMap.put(c, new TrieNode());
                }
                curr = curr.childMap.get(c);
                if(curr.suggestions.size() < 3){
                    curr.suggestions.add(products[i]);
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        TrieNode curr = root;
        for(char c : searchWord.toCharArray()){
            if(curr != null){
                curr = curr.childMap.get(c);
            }
            result.add(curr == null ? Arrays.asList() : curr.suggestions);
        }
        return result;
    }
}

class TrieNode{
    Map<Character, TrieNode> childMap = new HashMap<>();
    List<String> suggestions = new ArrayList<>();

    public static void main(String[] args) {

    }
}
