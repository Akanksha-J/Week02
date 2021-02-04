/* *****************************************************************************
 *  Name:    Ada Lovelace
 *  NetID:   alovelace
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class FrequencyC implements Frequency {

  private Map<String, Integer> ft;

  public FrequencyC() {
    this.ft = new HashMap<String, Integer>();
  }

  public Integer get(String key) {
    return ft.get(key);
  }

  public boolean containsKey(String key) {
    return ft.containsKey(key);
  }

  public void put(String key, Integer value) {
    ft.put(key, value);
  }

  public void forEach(BiConsumer<String, Integer> opn) {
    ft.forEach(opn);
  }

  public static void main(String[] args) {

  }
}
