class Player{
    private String name;
    private int location=0;
    Player(String name){
        this.name=name;
    }
    public void setLocation(int loc){
        location=loc;
    }
    public String getName(){
        return name;
    }
    public int getLocation(){
        return location;
    }
}
