class UndergroundSystem {
    
    HashMap<Integer, Node> customer;
    HashMap<Integer, TimeClass> avgTime;
    
    public UndergroundSystem() {
        customer = new HashMap();
        avgTime = new HashMap();
    }
    
    public void checkIn(int id, String stationName, int t) {
        
        customer.put(id, new Node(stationName, t));
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        Node node = customer.get(id);
        
        int hashcode = Objects.hash(node.startStation, stationName);
        
        double timeTaken = (t - node.startTime) * 1.0;
        
        if(avgTime.containsKey(hashcode)){
            
            TimeClass obj = avgTime.get(hashcode);
            obj.totalTime += timeTaken;
            obj.totalRides++;
            
        }else{
            avgTime.put(hashcode, new TimeClass(timeTaken, 1));    
        }
        
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        
        int hash = Objects.hash(startStation, endStation);
        
        TimeClass obj = avgTime.get(hash);
        
        return obj.totalTime/obj.totalRides;
    }
}

class Node{
    String startStation;
    int startTime;
    
    public Node(String start, int t){
        startStation = start;
        startTime = t;
    }
    
}

class TimeClass{
    
    double totalTime;
    int totalRides;
    
    public TimeClass(double sum, int rides){
        totalTime = sum;
        totalRides = rides;
    }
    
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */