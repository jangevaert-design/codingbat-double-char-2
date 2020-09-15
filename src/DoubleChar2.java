public class DoubleChar2 {
  public String doubleChar(String str) {
    String s = new String();

    for (int i = 0; i < str.length(); i++) {
      s += str.substring(i, i +1) + str.substring(i, i + 1);
    }
    return s;
  }
}
