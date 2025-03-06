class Solution {
    static int lcs(String s1, String s2) {
        // code here
         int n=s1.length();
         int m=s2.length();
         int[][] d=new int[n+1][m+1];
         for(int i=1;i<=n;i++){
             for(int j=1;j<=m;j++){
                 if(s1.charAt(i-1)==s2.charAt(j-1)){
                     d[i][j]=1+d[i-1][j-1];
                 }
                 else{
                     d[i][j]=Math.max(d[i-1][j],d[i][j-1]);
                 }
             }
         }
         return d[n][m];
    }
}