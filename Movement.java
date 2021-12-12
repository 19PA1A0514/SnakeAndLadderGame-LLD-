/**
Movement class is a parent class of Snake class and Ladder class.
It is form of Hierachial Inheritance(A single parent class is inherited by more than one child class).
 */
class Movement{
    private int start;
    private int end;
    Movement(int start,int end){
        this.start=start;
        this.end=end;
    }
    public int getStart(){ 
        return start;
    }
    public int getEnd(){
        return end;
    }
}

class Snake extends Movement{
    Snake(int start,int end){
        super(start,end);
    }
}

class Ladder extends Movement{
    Ladder(int start,int end){
        super(start,end);
    }
}