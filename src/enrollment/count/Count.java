/* *****************************************************************************
 *  Name: Bob Muller
 *
 *  Description:  Count the number of students in CS2.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.In;

public class Count {

  public static void main(String[] args) {
    int count = 0;
    String student;
    In in = new In(args[0]);

    student = in.readLine();
    while (student != null) {
      count++;
      System.out.format("%s\n", student);
      student = in.readLine();
    }
    in.close();
    System.out.format("There are %d students.\n", count);
  }
}

