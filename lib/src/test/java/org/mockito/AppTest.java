package org.mockito;

import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest extends TestCase {

    public void testBuildGreeting() {
        App app = mock(App.class);
        app.buildGreeting("bill");
        verify(app).buildGreeting("bob");
    }
}
