package theakki.synctool;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Wizzard_NewFtpConnection_Test
{
    @Rule
    public ActivityTestRule<Wizzard_NewFtpConnection> mActivityRule = new ActivityTestRule<>(Wizzard_NewFtpConnection.class);

    @Test
    public void findAllViews() throws Exception
    {
    }
}