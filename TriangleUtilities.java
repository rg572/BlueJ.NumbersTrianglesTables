import java.lang.StringBuilder;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder sbuild = new StringBuilder();
        for(int i=0;i<numberOfStars;i++){
            sbuild.append('*');
        }
        return sbuild.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder sbuild = new StringBuilder();
        for(int i=1;i<=numberOfRows;i++){
            sbuild.append(getRow(i));
            sbuild.append('\n');
        }
        return sbuild.toString();
    }


    public static String getSmallTriangle() {
        //StringBuilder sbuild = new StringBuilder();
        
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
