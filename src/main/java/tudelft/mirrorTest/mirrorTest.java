package tudelft.mirrorTest;

public class mirrorTest {

    public String mirrorEnds(String string){
        String mirror = "";
        int begin = 0;
             int end =  string.length() -1;
             for (; begin  < end; begin++, end--){
                    if(string.charAt(begin) == string.charAt(end)){
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }
         return begin == end ? null : mirror;
    }
}