import java.util.*;
public class HelloWorld{
    
    private static ArrayList<String> findGroupA(HashMap<String, ArrayList<String>> network,
HashMap<String, String> employer){
        ArrayList<String> output_list_different = new ArrayList<String>();
        ArrayList<String> output_list_same = new ArrayList<String>();
        for (String employee_name : network.keySet()){
            for (String s : network.get(employee_name)){
                if(employer.get(s) == employer.get(employee_name)){
                    if(!output_list_same.contains(s))
                        output_list_same.add(s);
                    if(!output_list_same.contains(employee_name))
                        output_list_same.add(employee_name);
                }else{
                    if(!output_list_different.contains(s))
                        output_list_different.add(s);
                    if(!output_list_different.contains(employee_name))
                        output_list_different.add(employee_name);
                }
            }
        }
        
        for (String s: output_list_same){
            output_list_different.remove(s);
        }
        return output_list_different;
    }

    public static void main(String []args){
        HashMap<String, ArrayList<String>> employee_network = new HashMap<String, ArrayList<String>>();
        ArrayList<String> friends_list = new ArrayList<String>();
    
        friends_list.add("Ben");
        friends_list.add("Carrie");
        employee_network.put("Alice", friends_list);
        
        friends_list = new ArrayList<String>();
        friends_list.add("Darcey");
        friends_list.add("Carrie");
        friends_list.add("Eve");
        friends_list.add("Carrie");
        employee_network.put("Ben", friends_list);
        
        friends_list = new ArrayList<String>();
        friends_list.add("Ben");
        friends_list.add("Eve");
        employee_network.put("Darcey", friends_list);
        
        friends_list = new ArrayList<String>();
        friends_list.add("Ben");
        friends_list.add("Eve");
        friends_list.add("Alice");
        friends_list.add("Fred");
        employee_network.put("Carrie", friends_list);
        
        friends_list = new ArrayList<String>();
        friends_list.add("Ben");
        friends_list.add("Carrie");
        friends_list.add("Darcey");
        friends_list.add("Fred");
        employee_network.put("Eve", friends_list);
        
        friends_list = new ArrayList<String>();
        friends_list.add("Carrie");
        friends_list.add("Eve");
        employee_network.put("Fred", friends_list);
        
        // System.out.println(employee_network);
        
        HashMap<String, String> employe_list = new HashMap<String,String>();
        employe_list.put("Alice", "UCA");
        employe_list.put("Ben", "EBI");
        employe_list.put("Carrie", "OFC");
        employe_list.put("Darcey", "EBI");
        employe_list.put("Eve", "BioB");
        employe_list.put("Fred", "EBI");
        
        // System.out.println(employe_list);
        System.out.println(findGroupA(employee_network,employe_list));
        
    }    
    
}