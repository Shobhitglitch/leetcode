class Solution {
    public void solve(int n,ArrayList<String> ans,StringBuilder s,int o,int c)
    {
        if(s.length()==n*2)
        {
            ans.add(s.toString());
            return;
        }
        if (o < n) {
            s.append('(');
            solve(n, ans, s, o + 1, c);
            s.deleteCharAt(s.length() - 1);
        }

        if (c < o) {
            s.append(')');
            solve(n, ans, s, o, c + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
       
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        solve(n,ans,new StringBuilder(),0,0);
        return ans;
    }
}