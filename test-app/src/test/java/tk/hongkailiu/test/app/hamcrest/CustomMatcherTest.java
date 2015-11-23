package tk.hongkailiu.test.app.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ehongka on 11/17/15.
 */
public class CustomMatcherTest {
    @Test public void testTrivial() {
        Assert.assertTrue(true);
    }


    @Test  public void testSquareRootOfMinusOneIsNotANumber() {
        MatcherAssert.assertThat(Math.sqrt(-1), Matchers.is(IsNotANumber.notANumber()));
    }
}
