public class StringPractice {

    public static void main(String[] args) {
        
        
        String str1="JAVA";
        System.out.println(str1);
        
        String str2 = new String("JAVA");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c,1,3); 
        System.out.println(str3);      
        
        String str4="JAVA";
        System.out.println(str1==str4);
        System.out.println(str1==str2);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.length());

        System.out.println(str1.substring(1, 3));

        System.out.println(str1.replace('J', 'b'));

        System.out.println(str1.indexOf('V'));

        String str8="java";
        String str9="Hello my name is java ok";

        System.out.println(str8.equalsIgnoreCase(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println("contains method: "+str9.contains(str8));
        String words[] = str9.split("\\s");
        System.out.println(words[0]);
        System.out.println("Total length of words : "+words.length);

    }
    
}
