class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int min) {
        //isme sliding windoe ki help se max unsetisfy customer nial lenge fir usme jitne bhi stesfy customer hai unko add kar lenge 
        int left=0;
        int max=0;
        int sum=0;
        //first window
        for( int i=0;i<min;i++){
            if( grumpy[i]==1) sum+=customer[i];
        }
        max=sum;
        for( int right=min;right<customer.length;right++){
            if(grumpy[right]==1){
                sum+=customer[right];
            }
            if(grumpy[right-min]==1){
                sum-=customer[right-min];
            }
            //maxnikal lo
           
           
            max=Math.max(max,sum);
        }
        
        // add all other remaing where grumy ==0 so customer satisfy 
        int already=0;
        for( int i=0;i< customer.length;i++){
            if(grumpy[i]==0){
                already+=customer[i];
            }
        }
        return max+already;
    }
}