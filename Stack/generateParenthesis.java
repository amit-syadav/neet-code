class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> final_sol = new ArrayList<>();

        return dfs(final_sol, n, 0, "", n);

    }

    List<String> dfs(List<String> final_sol, int open, int close, String str, int n) {

        if (str.length() == 2 * n) {
            final_sol.add(str);
        }

        if (open > 0) {
            dfs(final_sol, open - 1, close + 1, str.concat("("), n);
        }

        if (close > 0) {
            dfs(final_sol, open, close - 1, str.concat(")"), n);
        }

        return final_sol;

    }
}