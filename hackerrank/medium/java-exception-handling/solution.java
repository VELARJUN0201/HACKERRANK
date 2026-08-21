
class MyCalculator {
   
     long power(int first, int second) throws Exception {
        if(first < 0 || second < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if (first == 0 && second == 0 ){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long)Math.pow(first,second);
        }
    }
    
}

