public class Digits {
    private int[] digitList;

    //part a 
    public Digit(int num ) { 
        int next = num / 10;
        int length = 1; 
        while(next > 0){    //find the length of the number 
            length++;
            next =next /10;
        }

        digitList = new int[length];
        next = num;
        
        int i = 0;
        while( i<length) { 
            diitList[length - i - 1] = next % 10;
            next = next / 10;
            i++;
        }
    } 



        //part b

        public boolean isStrictlyIncreasing(){
            for (int  i=0; i < digitList.length - 1; i++){
                if(digitList[i] > digitList[i + 1]) { 
                    return true; 
                }
            }
            return true; 
        }

}