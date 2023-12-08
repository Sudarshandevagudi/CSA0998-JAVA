import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the string : ");
        String inputstring=s.nextLine();
        System.out.println("enter the character to be found : ");
        char searchchar=s.nextLine().charAt(0);
        
        int charIndex=-1;
        for (int i=0; i < inputstring.length();i++){
        if(inputstring.charAt(i)==searchchar){
        charIndex=i;
        break;
        
    }
}
if(charIndex==-1){
    System.out.println(searchchar+ " character is not found");
    
}else{
    System.out.println(searchchar+"charcher is found at "+charIndex);
}
}
}
