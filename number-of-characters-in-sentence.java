public class Main{
  public static void main(String[] args) {    
        String sentence = "nandana is doing homework";    
        int count = 0;    
        for(int i = 0; i < sentence.length(); i++) {    
            if(sentence.charAt(i) != ' ')    
                count++;    
        }                
        System.out.println(count);    
    }      
}