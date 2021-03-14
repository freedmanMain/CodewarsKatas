//Color Ghost
//Create a class Ghost
//
//Ghost objects are instantiated without any arguments.
//
//Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated
//
//Ghost ghost = new Ghost();
//ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
public class Ghost {
  public Ghost () {
    
  }
  public String getColor() {
    int rnd = (int) ( Math.random() * 100 );
    return rnd == 0 ? "yellow" : rnd == 1 ? "purple" : rnd == 2 ? "white" : "red";
  }
}