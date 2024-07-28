class Solution {
    public List<String> find_permutation(String S) {
        TreeSet<String> result = new TreeSet<>();
        boolean[] used = new boolean[S.length()];
        char[] characters = S.toCharArray();
        Arrays.sort(characters);
        backtrack(characters, used, new StringBuilder(), result);
        return new ArrayList<>(result);
    }

    private void backtrack(char[] characters, boolean[] used, StringBuilder current, TreeSet<String> result) {
        if (current.length() == characters.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < characters.length; i++) {
            if (used[i] || (i > 0 && characters[i] == characters[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            current.append(characters[i]);
            backtrack(characters, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
