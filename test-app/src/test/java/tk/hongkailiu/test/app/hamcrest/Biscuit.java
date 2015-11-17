package tk.hongkailiu.test.app.hamcrest;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Created by ehongka on 11/17/15.
 */
public class Biscuit {
    private String name;

    public Biscuit(String name) {
        this.name = name;
    }

    @Override public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Biscuit other = (Biscuit) obj;
        return new EqualsBuilder().append(name, other.name).isEquals();
    }

    public int getChocolateChipCount() {
        return 10;
    }

    public int getHazelnutCount() {
        return 3;
    }
}
