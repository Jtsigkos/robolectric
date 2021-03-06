package com.xtremelabs.robolectric.internal;

import com.xtremelabs.robolectric.RobolectricConfig;

import java.lang.reflect.Method;

public interface RobolectricTestRunnerInterface {
    Object createTest() throws Exception;

    void internalBeforeTest(Method method);

    void internalAfterTest(Method method);

    void setRobolectricConfig(RobolectricConfig config);
}
