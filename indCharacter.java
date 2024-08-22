

class FindCharacter {
    public static void main(String[] args) {
        char ch='k';
       String str= findChareecter(ch);
       System.out.println(str);
    }
    public static String findChareecter(char ch){
        
        char[] valid={'a','e','i','o','u'};
        for(int i=0;i<4;i++){
            if(ch==valid[i]){
                return "Vowel";
            }
        }
        return "Consonent";
        
    }
}
