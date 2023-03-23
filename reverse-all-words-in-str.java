class Main {
    public static void main(String[] args) {
         String str = "iam nandana";
      System.out.println("original string: " + str);
      String[] temp = str.split(str);
      String rev = "";
      for (int i = 0; i < temp.length; i++) {
         if (i == temp.length - 1){
         rev = temp[i] + rev;
         }else{
         rev = " " + temp[i] + rev;
      }
      }
      System.out.println("reversed string: " + rev);
   }
}
