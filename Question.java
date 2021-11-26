class Question{
  String quesName; 
  String quesAnswer1;
  String quesAnswer2;
  String quesAnswer3;
  String quesAnswer4;
  int correctAnswer;
  int points;
  String category;

Question(String aQuesName, String aQuesAnswer1, String aQuesAnswer2, String aQuesAnswer3, String aQuesAnswer4, String aCorrectAnswer, int aPoints, String aCategory){
  quesName = aQuesName;
  quesAnswer1 = aQuesAnswer1;
  quesAnswer2 = aQuesAnswer2;
  quesAnswer3 = aQuesAnswer3;
  quesAnswer4 = aQuesAnswer4;
  correctAnswer = aCorrectAnswer;
  points = aPoints;
  category = aCategory;
}
public String getQuesName(){
  return quesName;
}
public String getQuesAnswer1(){
  return quesAnswer1;
}
public String getQuesAnswer2(){
  return quesAnswer2;
}
public String getQuesAnswer3(){
  return quesAnswer3;
}
public String getQuesAnswer4(){
  return quesAnswer4;
}
public int getCorrectAnswer(){
  return correctAnswer;
}
public int getPoints(){
  return points;
}
public String getCategory(){
  return category;
}

}