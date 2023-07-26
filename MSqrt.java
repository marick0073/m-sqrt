class MSqrt{
    
    public static void main(String[] args){
        
        long t = System.currentTimeMillis();
        System.out.println(sqrt(2));
        System.out.println("T: "+(System.currentTimeMillis()-t));
        
    }
    
    private static double sqrt(double s){
        
        double a = 1, q = 1, r = 0;
        
        while(q>1e-5D){
            
            if(a*q*q<=s){
            
                s-=a*q*q;
                r+=q;
                a+=2;
            
            }else{
                
                q/=2;
                a=a*2-1;
                
            }
                
        }
        
        return r;
        
    }
    
}