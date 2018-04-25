import java.util.ArrayList;
public class ScoreCard{
  public boolean isRollTrueOnes(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 1)
        return true;
    }
    return false;
  }
  public int scoreRollOnes(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 1)
        answer+= 1;
    }
    return answer;
  }
  public boolean isRollTrueTwos(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 2)
        return true;
    }
    return false;
  }
  public int scoreRollTwos(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 2)
        answer+= 2;
    }
    return answer;
  }
  public boolean isRollTrueThrees(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 3)
        return true;
    }
    return false;
  }
  public int scoreRollThrees(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 3)
        answer+= 3;
    }
    return answer;
  }
  public boolean isRollTrueFours(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 4)
        return true;
    }
    return false;
  }
  public int scoreRollFours(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 4)
        answer+= 4;
    }
    return answer;
  }
  public boolean isRollTrueFives(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 5)
        return true;
    }
    return false;
  }
  public int scoreRollFives(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 5)
        answer+= 5;
    }
    return answer;
  }
  public boolean isRollTrueSixes(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 6)
        return true;
    }
    return false;
  }
  public int scoreRollSixes(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == 6)
        answer+= 6;
    }
    return answer;
  }
  public boolean isRollTrueThreeofAKind(ArrayList<Integer> roll, int tobetested){
    //checks to see if the roll follows the rules of the game
    int answer = 0;
      for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == tobetested)
        answer++;
    }
    if(answer > 2)
      return true;
    return false;
  }
  public int scoreRollThreeofAKind(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i : roll){
      answer+= roll.get(i);
    }
    return answer;
  }
  public boolean isRollTrueFourofAKind(ArrayList<Integer> roll, int tobetested){
    //checks to see if the roll follows the rules of the game
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == tobetested)
        answer++;
    }
    if(answer > 3)
      return true;
    return false;
  }
  public int scoreRollFourofAKind(ArrayList<Integer> roll){
    //scores the specified roll
    int answer = 0;
    for(int i : roll){
        answer+= roll.get(i);
    }
    return answer;
  }
  public boolean isRollTrueFullHouse(ArrayList<Integer> roll){
    //checks to see if the roll follows the rules of the game
    int firstint = roll.get(0);
    int secondint = 0;
    int firstcount = 0;
    int secondcount = 0;
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) == firstint)
        firstcount++;
      if(roll.get(i) == secondint)
        secondcount++;
      if(roll.get(i) != firstint && secondint == 0){
        secondint = roll.get(i);
        secondcount++;
      }
    }
    if((firstcount == 3 && secondcount == 2) || (firstcount == 2 && secondcount == 3))
      return true;
    return false;
  }
  public int scoreRollFullHouse(){
    //scores the specified roll
    return 25;
  }
  public boolean isRollTrueSmallStraight(ArrayList<Integer> roll){
    int[] straightarray = makeArray(roll);
    int inarow = 0;
    for(int i = 0; i < straightarray.length; i++){
      if(straightarray[i] == 0 && inarow < 4)
        inarow = 0;
      else
        inarow++;
    }
    if(inarow >= 4)
      return true;
    return false;
  }
  public int scoreRollSmallStraight(){
    //scores the specified roll
    return 30;
  }
  public boolean isRollTrueLargeStraight(ArrayList<Integer> roll){
    int[] straightarray = makeArray(roll);
    int inarow = 0;
    for(int i = 0; i < straightarray.length; i++){
      if(straightarray[i] == 0 && inarow < 5)
        inarow = 0;
      else
        inarow++;
    }
    if(inarow >= 5)
      return true;
    return false;
  }
  public int scoreRollLargeStraight(){
    //scores the specified roll
    return 40;
  }
  public boolean isRollTrueYahtzee(ArrayList<Integer> roll){
    int match = roll.get(0);
    for(int i = 0; i < roll.size(); i++){
      if(roll.get(i) != match)
        return false;
      }
      return true;
    }
  public int scoreRollYahtzee(){
    return 50;
  }
  public boolean isRollTrueChance(ArrayList<Integer> roll){
    return true;
  }
  public int scoreRollChance(ArrayList<Integer> roll){
    int answer = 0;
    for(int i = 0; i < roll.size(); i++){
      answer+= roll.get(i);
    }
    return answer;
  }
  public int[] makeArray(ArrayList<Integer> list){
    int[] answer = new int[6];
    for(int i = 0; i < list.size(); i++){
        answer[list.get(i)-1] = list.get(i);
    }
    return answer;
  }
}
