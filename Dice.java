interface Dice{
    public int roll();
}

class SingleDice implements Dice{
    public int roll(){
        int score=(int)(Math.random()*6)+1;
        if(score==6){
            score+=(int)(Math.random()*6)+1;
            if(score==12){
                score+=(int)(Math.random()*6)+1;
                if(score==18){
                    return 0;
                }
                else{
                    return score;
                }
            }
            else{
                return score;
            }
        }
        else{
            return score;
        }
    }
}
class TwoDice implements Dice{
    public int roll(){
        int score=(int)(Math.random()*6)+1;
        if(score==6){
            score+=(int)(Math.random()*6)+1;
            if(score==12){
                score+=(int)(Math.random()*6)+1;
                if(score==18){
                    return 0;
                }
                else{
                    return score;
                }
            }
            else{
                return score;
            }
        }
        else{
            return score;
        }
    }
}
