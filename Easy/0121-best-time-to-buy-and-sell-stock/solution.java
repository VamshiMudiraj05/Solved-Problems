        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
        }

                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
            }


            if(profit>maxprofit){
                maxprofit=profit;
            }
    }
}
