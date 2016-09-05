package inaka.com.myapplication;

import com.ad.android.tools.lint.Lint;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Rule public Lint lint = new Lint(new MyCustomRule(), MyCustomRule.ISSUE);


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}