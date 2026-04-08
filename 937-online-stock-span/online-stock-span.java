class StockSpanner {
    List<Integer>ans;

    public StockSpanner() {
        ans=new ArrayList<>();
        
    }
    
    public int next(int price) {
        ans.add(price);
        int stock=1;
        for(int i=ans.size()-2;i>=0;i--){
            if(ans.get(i)<=price){
                stock++;
            }
            else{
                break;
            }
        }
        return stock;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */