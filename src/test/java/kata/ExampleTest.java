package kata;

import kata.Example;
import org.junit.Test;

public final class ExampleTest {
    
    @Test
    public void exampleUsingJunitAssertion() {
        org.junit.Assert.assertEquals(Example.sum(1,2,3), 6);
    }
    
    @Test
    public void exampleUsingHamcrestAssert() {
        org.hamcrest.MatcherAssert.assertThat(Example.sum(1,2,3), org.hamcrest.CoreMatchers.is(6));
    }
    
    @Test
    public void exampleUsingFestAssert() {
        org.fest.assertions.Assertions.assertThat(Example.sum(1,2,3)).isEqualTo(6);
    }
    
}
