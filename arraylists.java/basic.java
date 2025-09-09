import java.util.ArrayList;
class basic {
    public static void main(String[] args) {
    ArrayList <String> al= new ArrayList<>();
    al.add("laxmi");
    al.add("Harshita");
    al.add("kratika");
    al.add("kritika");
    al.add("khusi");
    for(int i=0; i<=al.size()-1 ; i++)
    {
        System.out.println(al.get(i));
        
    }
    for(String i: al) 
    {
            System.out.println(i);
        }
    
    }
}


    