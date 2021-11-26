import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
class Game implements ActionListener{
  int totalScore;
  String currentAnswer;
  int quesValue;
  int currentQues;
  
  Random r = new Random()
  Scanner s = new Scanner(System.in);
  ArrayList<Question> Trivia = new ArrayList<Question>;
  
  JLabel category = new JLabel();
  JButton randomCategory = new JButton("Click to get random category");
  JButton randomQuestion = new JButton("Click to get random question");
  JLabel question = new JButton();
  JRadioButton firstOption = new JRadioButton();
  JRadioButton secOption = new JRadioButton();
  JRadioButton thirdOption = new JRadioButton();
  JRadioButton forthOption = new JRadioButton();
  JButton rstBtn = new JButton("Reset");
  JLabel pointsWorth = new JLabel();
  JLabel currentScore = new JLabel("Current Score: " + totalScore);

  void makeQuestions(){
    try{
    FileReader myTrivia = new FileReader("trivia.txt");
    BufferedReader myReader = new BufferedReader(myTrivia);
    
    while(myReader.ready()){
      String quesName = myReader.readLine();
      String quesOptOne = myReader.readLine();
      String quesOptTwo = myReader.readLine();
      String quesOptThree = myReader.readLine();
      String quesOptFour = myReader.readLine();
      int correctAnswer = myReader.parseInt(readLine());
      int quesValue = myReader.parseInt(readLine());
      String quesCat = myReader.readLine();

      Question storeQues(quesName, quesOptOne, quesOptTwo, quesOptThree, quesOptFour, correctAnswer, quesValue, quesCat);

      Trivia.add(storeQues);
    }
      myReader.close();
    }
    catch(IOException exception){
      System.out.println("An error occured:" + exception);
    }
    
  }


  
}