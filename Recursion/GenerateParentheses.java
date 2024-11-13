import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void find(List<String> ans, int n, StringBuilder sb, int fir, int sec) {
        if(sb.length() == 2*n) {
            ans.add(sb.toString());
            return;
        }
       
        if(fir > 0)
        {
            find(ans, n, sb.append('('), fir-1, sec);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(sec > fir)
        {
            find(ans, n, sb.append(')'), fir, sec-1);
            sb.deleteCharAt(sb.length()-1);        
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(ans, n, new StringBuilder(""), n, n);
        return ans;
    }
}