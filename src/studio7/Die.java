public class Die {
    private int side;

    public Die(int iniSide) {
        side = iniSide;
    }
    public int Throw() {
        int n = side;
        int val = (int)(Math.random()*(n))+1;
        return val;
    }
  public static void main(String[] args) {
        Die a = new Die(6);
        System.out.println(a.Throw());
    }

}

