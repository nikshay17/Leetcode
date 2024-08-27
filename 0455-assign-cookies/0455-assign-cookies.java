class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        int tot=0;
        while(l<g.length && r<s.length){
            if(g[l]<=s[r]){
                tot++;
                r=r+1;
                l=l+1;
            }
            else{
                r=r+1;
            }
            
            
        }
        
        return tot;
        
    }
}