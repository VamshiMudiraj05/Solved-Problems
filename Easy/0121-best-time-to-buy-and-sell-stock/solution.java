        }

            else{
                int profit=prices[i]-minprice;
            


                maxprofit=profit;
            
    }
            if(profit>maxprofit){
    return maxprofit;
}
    }
            }
            if(prices[i]<minprice){
                minprice=prices[i];
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
