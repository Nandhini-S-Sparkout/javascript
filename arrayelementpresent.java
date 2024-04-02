public class Main
{
    public static void main(String[] args) {
    int n[]={5,6,2,8,1};
        int b=5;
        boolean flag=false;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==b)
            {
                flag=true;
                break;
                
            }
            
        }
        if(!flag)
        {
            System.out.println(b+"is not present");
        }
        else{
            System.out.println(b+"is  present");
        }
       
        
    }

    }
    
