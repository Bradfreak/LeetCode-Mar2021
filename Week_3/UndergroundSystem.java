//Design Underground System
class UndergroundSystem {
    HashMap<Integer,Integer> check_in;
    HashMap<String,Integer> avg_time;
    HashMap<Integer,String> pass_in;
    HashMap<String,Integer> total_pass;
    
    public UndergroundSystem() {
        check_in = new HashMap<Integer,Integer>();
        avg_time = new HashMap<String,Integer>();
        pass_in = new HashMap<Integer,String>();
        total_pass = new HashMap<String,Integer>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        check_in.put(id,t);
        pass_in.put(id,stationName);
    }
    
    public void checkOut(int id, String stationName, int t) {
        int time = check_in.get(id);
        check_in.remove(id);
        String temp = pass_in.get(id)+stationName;
        pass_in.remove(id);
        if(avg_time.containsKey(temp)){
            avg_time.put(temp,avg_time.get(temp)+(t-time));
            total_pass.put(temp,total_pass.get(temp)+1);
        }
        else{
            avg_time.put(temp,t-time);
            total_pass.put(temp,1);
        }
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        return (((double) avg_time.get(startStation+endStation)) / ((double) total_pass.get(startStation+endStation)));
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
