// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.AndroidAppInfoResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.AndroidInstrumentationTestResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.AndroidRoboTestResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.AndroidTestLoopResponse;
import com.pulumi.googlenative.toolresults.v1beta3.outputs.DurationResponse;
import java.util.Objects;

@CustomType
public final class AndroidTestResponse {
    /**
     * @return Information about the application under test.
     * 
     */
    private AndroidAppInfoResponse androidAppInfo;
    /**
     * @return An Android instrumentation test.
     * 
     */
    private AndroidInstrumentationTestResponse androidInstrumentationTest;
    /**
     * @return An Android robo test.
     * 
     */
    private AndroidRoboTestResponse androidRoboTest;
    /**
     * @return An Android test loop.
     * 
     */
    private AndroidTestLoopResponse androidTestLoop;
    /**
     * @return Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    private DurationResponse testTimeout;

    private AndroidTestResponse() {}
    /**
     * @return Information about the application under test.
     * 
     */
    public AndroidAppInfoResponse androidAppInfo() {
        return this.androidAppInfo;
    }
    /**
     * @return An Android instrumentation test.
     * 
     */
    public AndroidInstrumentationTestResponse androidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }
    /**
     * @return An Android robo test.
     * 
     */
    public AndroidRoboTestResponse androidRoboTest() {
        return this.androidRoboTest;
    }
    /**
     * @return An Android test loop.
     * 
     */
    public AndroidTestLoopResponse androidTestLoop() {
        return this.androidTestLoop;
    }
    /**
     * @return Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    public DurationResponse testTimeout() {
        return this.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AndroidAppInfoResponse androidAppInfo;
        private AndroidInstrumentationTestResponse androidInstrumentationTest;
        private AndroidRoboTestResponse androidRoboTest;
        private AndroidTestLoopResponse androidTestLoop;
        private DurationResponse testTimeout;
        public Builder() {}
        public Builder(AndroidTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidAppInfo = defaults.androidAppInfo;
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.testTimeout = defaults.testTimeout;
        }

        @CustomType.Setter
        public Builder androidAppInfo(AndroidAppInfoResponse androidAppInfo) {
            this.androidAppInfo = Objects.requireNonNull(androidAppInfo);
            return this;
        }
        @CustomType.Setter
        public Builder androidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest);
            return this;
        }
        @CustomType.Setter
        public Builder androidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            this.androidRoboTest = Objects.requireNonNull(androidRoboTest);
            return this;
        }
        @CustomType.Setter
        public Builder androidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            this.androidTestLoop = Objects.requireNonNull(androidTestLoop);
            return this;
        }
        @CustomType.Setter
        public Builder testTimeout(DurationResponse testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }
        public AndroidTestResponse build() {
            final var o = new AndroidTestResponse();
            o.androidAppInfo = androidAppInfo;
            o.androidInstrumentationTest = androidInstrumentationTest;
            o.androidRoboTest = androidRoboTest;
            o.androidTestLoop = androidTestLoop;
            o.testTimeout = testTimeout;
            return o;
        }
    }
}