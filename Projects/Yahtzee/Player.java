import java.util.Scanner;
import java.util.ArrayList;
public class Player{
  int[] cardScores;
  boolean[] hasScored;
  Scanner kys;
  ArrayList<Integer> roll;
  int input;
  int secondaryinput;
  ScoreCard card;
  String playername;
  boolean finished;
  public Player(String name){
    cardScores = new int[13];
    hasScored = new boolean[13];
    kys = new Scanner(System.in);
    roll = new ArrayList<Integer>();
    input = 1000;
    secondaryinput = 0;
    card = new ScoreCard();
    playername = name;
    finished = false;
  }
  public void play(){
    int rollcount = 0;
    while(input != 0){
      secondaryinput = 0;
      System.out.println("enter...");
      System.out.println("0) ends the game for the current player");
      System.out.println("1) roll the dice");
      System.out.println("2) score the current roll");
      System.out.println("3) print the current player's scorecard");
      System.out.println("The current roll is: " + roll.toString());
      input = kys.nextInt();
      if(input == 1){
        //rolls the dice
        roll(rollcount);
        rollcount++;
      }
      if(input == 2){
        //scores the roll and puts it into the scorecard
        scoreRoll();
        rollcount = 0;
      }
      if(input == 3)
        printScoreCard();
    }
    finish();
  }
  public void rollDice(ArrayList<Integer> roll){
    if(roll.isEmpty())
      for(int i = 0; i < 5; i++)
        roll.add((int)(Math.random() * 6) + 1);
    else
      for(int i = 0; i < 5; i++)
        roll.set(i,(int)(Math.random() * 6) + 1);
  }
  public void rollDice(ArrayList<Integer> roll, String rollInput){
    Scanner separator = new Scanner(rollInput);
    ArrayList<Integer> parsedints = new ArrayList<Integer>();
    while(separator.hasNext()){
      parsedints.add(Integer.parseInt(separator.next())-1);
    }
    for(int i = 0; i < parsedints.size(); i++){
      roll.set(parsedints.get(i),(int)(Math.random() * 6) + 1);
    }
  }
  public void printScoreCard(){
    System.out.println("Ones:            " + cardScores[0]);
    System.out.println("Twos:            " + cardScores[1]);
    System.out.println("Threes:          " + cardScores[2]);
    System.out.println("Fours:           " + cardScores[3]);
    System.out.println("Fives:           " + cardScores[4]);
    System.out.println("Sixes:           " + cardScores[5]);
    System.out.println("Three of a Kind: " + cardScores[6]);
    System.out.println("Four of a kind:  " + cardScores[7]);
    System.out.println("FullHouse:       " + cardScores[8]);
    System.out.println("Small Straight:  " + cardScores[9]);
    System.out.println("Large Straight:  " + cardScores[10]);
    System.out.println("Yahtzee:         " + cardScores[11]);
    System.out.println("Chance:          " + cardScores[12]);
  }
  public void roll(int rollcount){
    if(rollcount < 3){
      System.out.println("Enter 1 to reroll the entire set");
      System.out.println("Enter 2 to reroll individual parts of the set");
      System.out.println("Enter any other number to keep current roll");
      System.out.println("The current roll is: " + roll.toString());
      secondaryinput = kys.nextInt();
      if(secondaryinput == 1)
        rollDice(roll);
      if(secondaryinput == 2 && !roll.isEmpty()){
        //rerolling part where they choose indiviual terms
        System.out.println("enter the places of the dice you wish to reroll separated by spaces");
        kys.nextLine();
        String rollinput = kys.nextLine();
        rollDice(roll,rollinput);
      }
      else if(roll.isEmpty())
        System.out.println("The roll is currently empty you brainless beast, you now lose 1 of your chances to reroll");
    }
    else
      System.out.println("Roll limit for this turn has been reached");
    //System.out.println("Finalized roll is: " + roll.toString());
  }
  public void scoreRoll(){
    System.out.println("enter a score type to put the roll into");
    secondaryinput = kys.nextInt();
    if(secondaryinput == 1){
      //scores the roll into the Ones or 1st catagory
      if(hasScored[0])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueOnes(roll)){
          hasScored[0] = true;
          cardScores[0] = card.scoreRollOnes(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 2){
      //scores the roll into the Twos or 2nd catagory
      if(hasScored[1])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueTwos(roll)){
          hasScored[1] = true;
          cardScores[1] = card.scoreRollTwos(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 3){
      //scores the roll into the Threes or 3rd catagory
      if(hasScored[2])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueThrees(roll)){
          hasScored[2] = true;
          cardScores[2] = card.scoreRollThrees(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 4){
      //scores the roll into the Fours or 4th catagory
      if(hasScored[3])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueFours(roll)){
          hasScored[3] = true;
          cardScores[3] = card.scoreRollFours(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 5){
      //scores the roll into the Fives or 5th catagory
      if(hasScored[4])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueFives(roll)){
          hasScored[4] = true;
          cardScores[4] = card.scoreRollFives(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 6){
      //scores the roll into the Sixes or 6th catagory
      if(hasScored[5])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueSixes(roll)){
          hasScored[5] = true;
          cardScores[5] = card.scoreRollSixes(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 7){
      //scores the roll into the ThreeofAKind or 7th catagory
      if(hasScored[6])
        System.out.println("This catagory has already been scored");
      else{
        System.out.println("Enter the value you would like to score for the Three of a Kind score type");
        int tobetested = kys.nextInt();
        if(card.isRollTrueThreeofAKind(roll,tobetested)){
          hasScored[6] = true;
          cardScores[6] = card.scoreRollThreeofAKind(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 8){
      //scores the roll into the FourofAKind or 8th catagory
      if(hasScored[7])
        System.out.println("This catagory has already been scored");
      else{
        System.out.println("Enter the value you would like to score for the Four of a Kind score type");
        int tobetested = kys.nextInt();
        if(card.isRollTrueFourofAKind(roll,tobetested)){
          hasScored[7] = true;
          cardScores[7] = card.scoreRollFourofAKind(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 9){
      //scores the roll into the FullHouse or 9th catagory
      if(hasScored[8])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueFullHouse(roll)){
          hasScored[8] = true;
          cardScores[8] = card.scoreRollFullHouse();
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 10){
      //scores the roll into the Small Straight or 10th catagory
      if(hasScored[9])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueSmallStraight(roll)){
          hasScored[9] = true;
          cardScores[9] = card.scoreRollSmallStraight();
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 11){
      //scores the roll into the Large Straight or 11th catagory
      if(hasScored[10])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueLargeStraight(roll)){
          hasScored[10] = true;
          cardScores[10] = card.scoreRollLargeStraight();
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 12){
      //scores the roll into the Yahtzee or 12th catagory
      if(hasScored[11])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueYahtzee(roll)){
          hasScored[11] = true;
          cardScores[11] = card.scoreRollYahtzee();
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
    if(secondaryinput == 13){
      //scores the roll into the Chance or 13th catagory
      if(hasScored[12])
        System.out.println("This catagory has already been scored");
      else{
        if(card.isRollTrueChance(roll)){
          hasScored[12] = true;
          cardScores[12] = card.scoreRollChance(roll);
          printScoreCard();
          roll.clear();
        }
        else
          System.out.println("This roll cannot be scored in this catagory");
      }
    }
  }
  public boolean isFinished(){
    return finished;
  }
  public void finish(){
    finished = true;
  }
}
