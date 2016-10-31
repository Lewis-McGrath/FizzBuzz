import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    @Test
    public void returnNonSpecialNumbers(){
        assertThat(FizzBuzzGame.FizzBuzz(1), is("1"));
        assertThat(FizzBuzzGame.FizzBuzz(2), is("2"));
        assertThat(FizzBuzzGame.FizzBuzz(4), is("4"));
        assertThat(FizzBuzzGame.FizzBuzz(7), is("7"));
    }

    @Test
    public void returnFizzBuzz(){
        assertThat(FizzBuzzGame.FizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzzGame.FizzBuzz(30), is("FizzBuzz"));
        assertThat(FizzBuzzGame.FizzBuzz(45), is("FizzBuzz"));
        assertThat(FizzBuzzGame.FizzBuzz(60), is("FizzBuzz"));
    }

    @Test
    public void returnFizz(){
        assertThat(FizzBuzzGame.FizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzzGame.FizzBuzz(6), is("Fizz"));
        assertThat(FizzBuzzGame.FizzBuzz(9), is("Fizz"));
        assertThat(FizzBuzzGame.FizzBuzz(12), is("Fizz"));
    }

    @Test
    public void returnBuzz(){
        assertThat(FizzBuzzGame.FizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzzGame.FizzBuzz(10), is("Buzz"));
        assertThat(FizzBuzzGame.FizzBuzz(20), is("Buzz"));
        assertThat(FizzBuzzGame.FizzBuzz(25), is("Buzz"));
    }


}
