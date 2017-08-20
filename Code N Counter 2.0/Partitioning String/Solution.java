import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String str = br.readLine();
        int index, len, max = 0;

        Matcher match = Pattern.compile("(\\w)\\1+").matcher(str);

        while(match.find()){
          len = match.group().length();
          if(max < len) max = len;
        }

        System.out.println(max);
    }
}
