
import java.lang.StringBuilder;

public class NumberUtilities {

    public static String getRange(int stop) {
        StringBuilder sbuild = new StringBuilder();
        
        for(int i=0; i<stop;i++){
            sbuild.append(i);
        }
        
        return sbuild.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sbuild = new StringBuilder();
        
        for(int i=start;i<stop;i++){
            sbuild.append(i);
        }
        return sbuild.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sbuild = new StringBuilder();
        
        for(int i=start;i<stop;i+=step){
            sbuild.append(i);
        }
        return sbuild.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        if(start%2==1){
            start++;
        }
        
        return getRange(start,stop,2);
        //return null;
    }


    public static String getOddNumbers(int start, int stop) {
        if(start%2==0){
            start++;
        }
  
        return getRange(start,stop,2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder sbuild = new StringBuilder();
        
        for(int i=start;i<=stop;i++){
            sbuild.append((int)Math.pow(i,exponent));
        }
        return sbuild.toString();
    }
}
