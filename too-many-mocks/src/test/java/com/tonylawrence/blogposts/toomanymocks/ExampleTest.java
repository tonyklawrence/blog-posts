package com.tonylawrence.blogposts.toomanymocks;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExampleTest {

    @Test
    public void run() {
        assertThat(true, is(true));
    }
}
