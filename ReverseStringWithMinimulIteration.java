import java.lang.reflect.Array;

public class ReverseStringWithMinimulIteration {
    public static void main(String args[]){
        String string = "pawangupta";
        char[] stringArray = string.toCharArray();
        char temp ;
        for(int left =0,right=stringArray.length-1; left<right; left++,right--){
            temp = stringArray[left];
            stringArray[left]=stringArray[right];
            stringArray[right]=temp;
        }
        System.out.println(stringArray);
    }
}
