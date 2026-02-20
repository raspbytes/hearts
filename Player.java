//Name: Sarah Shafi

public class Player{
  private String name;
  private int score;

  public Player(String n, int s){
    this.name = n;
    this.score = s;
  }

public void setName(String s){
  this.name = s;
}
public void setScore(int s){
  this.score = s;
}
public String getName(){
  return this.name;
}

public int getScore(){
  return this.score;
}

public void updateScore(int addToScore){
  this.score+=addToScore;
}

public String toString(){
  String result = this.name + " " + this.score;
  return result;
}

}