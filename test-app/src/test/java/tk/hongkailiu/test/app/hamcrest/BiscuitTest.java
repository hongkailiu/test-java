package tk.hongkailiu.test.app.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ehongka on 11/17/15.
 */
public class BiscuitTest {
    @Test public void testTrivial() {
        Assert.assertTrue(true);
    }

    @Test public void testEquals() {
        Biscuit theBiscuit = new Biscuit("Ginger");
        Biscuit myBiscuit = new Biscuit("Ginger");
        MatcherAssert.assertThat(theBiscuit, Matchers.equalTo(myBiscuit));

        MatcherAssert.assertThat("chocolate chips", theBiscuit.getChocolateChipCount(), Matchers.equalTo(
            10));
        MatcherAssert.assertThat("hazelnuts", theBiscuit.getHazelnutCount(), Matchers.equalTo(3));
    }
}
