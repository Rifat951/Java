import java.util.*;                                                 
                                                                    
                                                                    
class Sequence{                                                     
                                                                    
    public static int[] getUnsorted(int[] s){                       
        Arrays.sort(s);                                             
            boolean is = true;                                      
            for(int i = s.length -1;i>0;--i){                       
                if(s[i] != s[i-1]){                                 
                    int temp = s[i];                                
                    s[i] = s[i-1];                                  
                    s[i-1]= temp;                                   
                    break;                                          
                }                                                   
            }                                                       
                                                                    
            return (is ? s : new int[0]);                           
    }                                                               
                                                                    
    public static void main(String[] args) {                        
                                                                    
        int[] number = {2,8,5,1,10,5,9,9,3,10,5,6,6,2,8,2,10};      
        getUnsorted(number);                                        
        System.out.println(Arrays.toString(number));                
                                                                    
    }                                                               
}                                                                   
                                                                    
