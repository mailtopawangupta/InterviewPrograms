public class FirstNonRepetitiveCharacter {
    public static void main(String[] args){
        String string = "pawangupta";
        for(char c : string.toCharArray()){
            if(string.indexOf(c) == string.lastIndexOf(c)){
                System.out.println("First Non Repetitive character is : "+c);
                break;
            }
        }
    }
}
