import edu.princeton.cs.algs4.In;

import java.util.NoSuchElementException;

/******************************************************************************
 *  Compilation:  javac-algs4 Majors.java
 *  Execution:    java-algs4 Majors filename
 *
 *  Computes a frequency table of majors in CS2.
 *
 ******************************************************************************/

public class Majors {

  public static void main(String[] args) {
    int count = 0;
    Frequency frequency = new FrequencyC();

    In in = new In(args[0]);
    try {
      while (true) {
        String school = in.readString();
        String major = in.readString();
        if (frequency.containsKey(major))
          frequency.put(major, frequency.get(major) + 1);
        else
          frequency.put(major, 1);
        int year = in.readInt();
        count++;
      }
    }
    catch (NoSuchElementException e) {
      in.close();
    }
    frequency.forEach((key, value) ->
                              System.out.format("%s = %d\n", key, value));

    System.out.format("Read %d lines.\n", count);
  }
}
