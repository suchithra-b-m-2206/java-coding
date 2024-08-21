Write a program for

Input=a1b10
Output=abbbbbbbbbb


public class ExpandString{
  public String expandString(String[] args){
      StringBuilder output=new StringBuilder();
      int i=0;
      while(i<input.length()){
            char letter=input.charAt(i);
            i++;
            StringBuilder number=new StringBuilder();
            while(i<input.length() && Character.isDigit(input.charAt(i))){
                   number.append(input.charAt(i));
                   i++;
            }
         int count=Integer.parseInt(number.toString());
         for(int j=0;j< count j++){
          output.append(letter);
       }
}
return output.toString();
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String result=expandString(input);
System.out.println(result);
}
}
