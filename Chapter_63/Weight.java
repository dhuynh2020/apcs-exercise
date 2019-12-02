class Weight
{
  private int[] data;

  public Weight(int[] init)
  {
    int []data = new int[init.length];

    for (int j = 0; j < init.length; j++)
    {
      data[j] = init[j];
    }

    System.out.println(toString(data, init));
    System.out.println("Average: " + Average(data, init));
    System.out.println("Average between days 5 and 25: " + subAverage(5,25, data, init));
  }

  public String toString(int[] data, int[] init){
    String dataString = "";
    for(int i = 0; i < init.length; i++) {
      dataString += (data[i] + ", ");
    }
    return dataString;
  }

  public int Average(int[] data, int[] init) {
    int average = 0;
    int t = 0;
    for(int i = 0; i < init.length; i++) {
      average += data[i];
      t++;
    }
    return average / t;
  }

  public int subAverage(int start, int end, int[] data, int[] init) {
    int average = 0;
    int t = 0;
    for(int i = start; i < (end - (start - 1)); i++) {
      average += data[i];
      t++;
    }
    return average / t;
  }
}

