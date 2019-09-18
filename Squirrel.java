// Squirrels.java by Mr. Considine
// 9/17/19

// it prints negatives which it shouldn't. it should throw a caution because a negative number doesn't make sense for the data
//with this big of a number its puts an E in the answer which users might not understand
// when we put letters in the data it gave us an error
// it also gave us an error when we used whole numbers
// when there are more than one numbers after the decimal it throws an error
// characters also won't print

import java.util.*;
import java.io.*;

class Squirrel {

  public static void main(String[] args) {

    System.out.println("\n====== WELCOME TO THE" +
    " SQUIRREL TRACKER ======\n\n");

    ArrayList<String> names = new ArrayList<String>(); // list of name- so the 1st column in the txt file
    ArrayList<Double> lengths = new ArrayList<Double>(); // list of the length of the sqirrel
    ArrayList<Double> weight = new ArrayList<Double>(); // list of the weight of the squirrel

    try {
      File data = new File("SquirrelData.txt");
      Scanner fr = new Scanner(data); // reads the txt file

      while (fr.hasNext()) {
        names.add(fr.next());
        lengths.add(Double.parseDouble(fr.next()));
        weight.add(Double.parseDouble(fr.next()));
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    //calculate length
    Double best = 0.0;
    Double worst = 10000.0;
    int b = 0;
    int w = 0;
    for (int i = 0; i < lengths.size(); i++) {
      if (lengths.get(i) > best) {
        best = lengths.get(i);
        b = i;
      }
      if (lengths.get(i) < worst) {
        worst = lengths.get(i);
        w = i;
      }
    }
    System.out.println("The longest squirrel is " +
    names.get(b) + ".\nThis squirrel is " + lengths.get(b) +
    " cm long.\n");
    System.out.println("The shortest squirrel is " +
    names.get(w) + ".\nThis squirrel is " + lengths.get(w) +
    " cm long.\n\n");

    //calculate weight
    Double best2 = 0.0;
    Double worst2 = 10000.0;
    int b2 = 0;
    int w2 = 0;
    for (int i = 0; i < weight.size(); i++) {
      if (weight.get(i) > best2) {
        best2 = weight.get(i);
        b2 = i;
      }
      if (weight.get(i) < worst2) {
        worst2 = weight.get(i);
        w2 = i;
      }
    }
    System.out.println("The heaviest squirrel is " +
    names.get(b2) + ".\nThis squirrel is " + weight.get(b2) +
    " grams.\n");
    System.out.println("The smallest squirrel is " +
    names.get(w2) + ".\nThis squirrel is " + weight.get(w2) +
    " grams.\n\n");

  }
}
