package com.mercadolibre.android.device.sdk;

import android.app.Application;
import android.content.Context;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.util.Map;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import static org.mockito.Mockito.spy;

@SuppressFBWarnings
@RunWith(RobolectricTestRunner.class)
public class DeviceSDKTest extends AbstractRobolectricTest{
    private Context context;

    @Before
    @Override
    public void setUp() {
        super.setUp();
        Application a = getApplication();

        context = a.getApplicationContext();

    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void startDeviceSDK_AsMap() {
        final DeviceSDK sdk = spy(DeviceSDK.class).getInstance();
        sdk.execute(context);

        Map<String, Object> d = sdk.getInfoAsMap();
        Assert.assertNotNull(d);
        Assert.assertNotNull(d.get("fingerprint"));
        Map<String, Object> fingerprint = (Map) d.get("fingerprint");
        Assert.assertEquals("robolectric", fingerprint.get("model"));
    }

    @Test
    public void startDeviceSDK_AsJsonString() {
        final DeviceSDK sdk = spy(DeviceSDK.class).getInstance();
        sdk.execute(context);

        String d = sdk.getInfoAsJsonString();
        Assert.assertNotNull(d);
    }

}
