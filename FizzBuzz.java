public class FizzBuzz {
    public String fizzBuzz(int number) {
        String fb = "";

        if(number % 3 == 0 && number % 5 == 0){
            fb = "FizzBuzz";
        }
        else if(number % 3 == 0){
            fb = "Fizz";
        }
        else if(number % 5 == 0){
            fb = "Buzz";
        }
        else{
            fb = String.valueOf(number);
        }

        return fb;
    }
}