/*
 * package com.saucelabs.appium;
 *
 * import static org.junit.Assert.assertEquals;
 * import io.appium.java_client.AppiumDriver;
 * import io.appium.java_client.ios.IOSDriver;
 *
 * import java.net.URL;
 * import java.text.MessageFormat;
 * import java.util.ArrayList;
 * import java.util.List;
 * import java.util.Random;
 *
 * import org.junit.After;
 * import org.junit.Before;
 * import org.junit.Rule;
 * import org.junit.Test;
 * import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.remote.DesiredCapabilities;
 *
 * import com.saucelabs.common.SauceOnDemandAuthentication;
 * import com.saucelabs.common.SauceOnDemandSessionIdProvider;
 * import com.saucelabs.junit.SauceOnDemandTestWatcher;
 *
 */
/**
 * Simple test which demonstrates how to run an <a href="https://github.com/appium/appium">Appium</a>
 * using <a href="http://saucelabs.com">Sauce Labs</a>.
 *
 * This test also includes the <a href="https://github.com/saucelabs/sauce-java/tree/master/junit">Sauce JUnit</a> helper classes, which will use the Sauce REST API to mark the Sauce Job as passed/failed.
 *
 * In order to use the {@link SauceOnDemandTestWatcher}, the test must implement the {@link SauceOnDemandSessionIdProvider} interface.
 *
 * <p/>
 * The test relies on SAUCE_USER_NAME and SAUCE_ACCESS_KEY environment variables being set which reference
 * the Sauce username/access key.
 *
 * @author Ross Rowe
 */
/*
 *
 * public class SauceTest implements SauceOnDemandSessionIdProvider {
 *
 * private AppiumDriver driver;
 *
 * private List<Integer> values;
 *
 * private static final int MINIMUM = 0;
 * private static final int MAXIMUM = 10;
 *
 * private String sessionId;
 *
 */
/**
     * Constructs a {@link SauceOnDemandAuthentication} instance using the supplied user name/access key.  To use the authentication
     * supplied by environment variables or from an external file, use the no-arg {@link SauceOnDemandAuthentication} constructor.
     */
/*
 *
 * public SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication();
 *
 */
/**
     * JUnit Rule which will mark the Sauce Job as passed/failed when the test succeeds or fails.
     */
/*
 *
 * public @Rule
 * SauceOnDemandTestWatcher resultReportingTestWatcher = new SauceOnDemandTestWatcher(this, authentication);
 *
 */
/**
     * Sets up appium.  You will need to either explictly set the sauce username/access key variables, or set
     * SAUCE_USERNAME and SAUCE_ACCESS_KEY environment variables to reference your Sauce account details.
     *
     * @throws Exception
     */
/*
 *
 * @Before
 * public void setUp() throws Exception {
 * String sauceUserName = authentication.getUsername();
 * String sauceAccessKey = authentication.getAccessKey();
 * DesiredCapabilities capabilities = new DesiredCapabilities();
 * capabilities.setCapability("platformVersion", "7.1");
 * capabilities.setCapability("deviceName", "iPhone Simulator");
 * capabilities.setCapability("appiumVersion", "1.3.4");
 * capabilities.setCapability("app", "https://appium.s3.amazonaws.com/TestApp7.1.app.zip");
 *
 * driver = new IOSDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub", sauceUserName,
 * sauceAccessKey)),
 *       capabilities);
 * this.sessionId = driver.getSessionId().toString();
 * values = new ArrayList<Integer>();
 * }
 *
 * @After
 * public void tearDown() throws Exception {
 * driver.quit();
 * }
 *
 * private void populate() {
 * //populate text fields with two random number
 * List<WebElement> elems = driver.findElementsByClassName("UIATextField");
 * Random random = new Random();
 * for (WebElement elem : elems) {
 *   int rndNum = random.nextInt(MAXIMUM - MINIMUM + 1) + MINIMUM;
 *   elem.sendKeys(String.valueOf(rndNum));
 *   values.add(rndNum);
 * }
 * }
 *
 * @Test
 * public void testUIComputation() throws Exception {
 *
 * // populate text fields with values
 * populate();
 * // trigger computation by using the button
 * WebElement button = driver.findElementByClassName("UIAButton");
 * button.click();
 * // is sum equal ?
 * WebElement texts = driver.findElementByClassName("UIAStaticText");
 * assertEquals(String.valueOf(values.get(0) + values.get(1)), texts.getText());
 * }
 *
 * public String getSessionId() {
 * return sessionId;
 * }
 * }
 */
