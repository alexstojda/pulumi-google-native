// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.AndroidAppInfoArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.AndroidInstrumentationTestArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.AndroidRoboTestArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.AndroidTestLoopArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.DurationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Android mobile test specification.
 * 
 */
public final class AndroidTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidTestArgs Empty = new AndroidTestArgs();

    /**
     * Information about the application under test.
     * 
     */
    @Import(name="androidAppInfo")
    private @Nullable Output<AndroidAppInfoArgs> androidAppInfo;

    /**
     * @return Information about the application under test.
     * 
     */
    public Optional<Output<AndroidAppInfoArgs>> androidAppInfo() {
        return Optional.ofNullable(this.androidAppInfo);
    }

    /**
     * An Android instrumentation test.
     * 
     */
    @Import(name="androidInstrumentationTest")
    private @Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest;

    /**
     * @return An Android instrumentation test.
     * 
     */
    public Optional<Output<AndroidInstrumentationTestArgs>> androidInstrumentationTest() {
        return Optional.ofNullable(this.androidInstrumentationTest);
    }

    /**
     * An Android robo test.
     * 
     */
    @Import(name="androidRoboTest")
    private @Nullable Output<AndroidRoboTestArgs> androidRoboTest;

    /**
     * @return An Android robo test.
     * 
     */
    public Optional<Output<AndroidRoboTestArgs>> androidRoboTest() {
        return Optional.ofNullable(this.androidRoboTest);
    }

    /**
     * An Android test loop.
     * 
     */
    @Import(name="androidTestLoop")
    private @Nullable Output<AndroidTestLoopArgs> androidTestLoop;

    /**
     * @return An Android test loop.
     * 
     */
    public Optional<Output<AndroidTestLoopArgs>> androidTestLoop() {
        return Optional.ofNullable(this.androidTestLoop);
    }

    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    @Import(name="testTimeout")
    private @Nullable Output<DurationArgs> testTimeout;

    /**
     * @return Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    public Optional<Output<DurationArgs>> testTimeout() {
        return Optional.ofNullable(this.testTimeout);
    }

    private AndroidTestArgs() {}

    private AndroidTestArgs(AndroidTestArgs $) {
        this.androidAppInfo = $.androidAppInfo;
        this.androidInstrumentationTest = $.androidInstrumentationTest;
        this.androidRoboTest = $.androidRoboTest;
        this.androidTestLoop = $.androidTestLoop;
        this.testTimeout = $.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidTestArgs $;

        public Builder() {
            $ = new AndroidTestArgs();
        }

        public Builder(AndroidTestArgs defaults) {
            $ = new AndroidTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidAppInfo Information about the application under test.
         * 
         * @return builder
         * 
         */
        public Builder androidAppInfo(@Nullable Output<AndroidAppInfoArgs> androidAppInfo) {
            $.androidAppInfo = androidAppInfo;
            return this;
        }

        /**
         * @param androidAppInfo Information about the application under test.
         * 
         * @return builder
         * 
         */
        public Builder androidAppInfo(AndroidAppInfoArgs androidAppInfo) {
            return androidAppInfo(Output.of(androidAppInfo));
        }

        /**
         * @param androidInstrumentationTest An Android instrumentation test.
         * 
         * @return builder
         * 
         */
        public Builder androidInstrumentationTest(@Nullable Output<AndroidInstrumentationTestArgs> androidInstrumentationTest) {
            $.androidInstrumentationTest = androidInstrumentationTest;
            return this;
        }

        /**
         * @param androidInstrumentationTest An Android instrumentation test.
         * 
         * @return builder
         * 
         */
        public Builder androidInstrumentationTest(AndroidInstrumentationTestArgs androidInstrumentationTest) {
            return androidInstrumentationTest(Output.of(androidInstrumentationTest));
        }

        /**
         * @param androidRoboTest An Android robo test.
         * 
         * @return builder
         * 
         */
        public Builder androidRoboTest(@Nullable Output<AndroidRoboTestArgs> androidRoboTest) {
            $.androidRoboTest = androidRoboTest;
            return this;
        }

        /**
         * @param androidRoboTest An Android robo test.
         * 
         * @return builder
         * 
         */
        public Builder androidRoboTest(AndroidRoboTestArgs androidRoboTest) {
            return androidRoboTest(Output.of(androidRoboTest));
        }

        /**
         * @param androidTestLoop An Android test loop.
         * 
         * @return builder
         * 
         */
        public Builder androidTestLoop(@Nullable Output<AndroidTestLoopArgs> androidTestLoop) {
            $.androidTestLoop = androidTestLoop;
            return this;
        }

        /**
         * @param androidTestLoop An Android test loop.
         * 
         * @return builder
         * 
         */
        public Builder androidTestLoop(AndroidTestLoopArgs androidTestLoop) {
            return androidTestLoop(Output.of(androidTestLoop));
        }

        /**
         * @param testTimeout Max time a test is allowed to run before it is automatically cancelled.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(@Nullable Output<DurationArgs> testTimeout) {
            $.testTimeout = testTimeout;
            return this;
        }

        /**
         * @param testTimeout Max time a test is allowed to run before it is automatically cancelled.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(DurationArgs testTimeout) {
            return testTimeout(Output.of(testTimeout));
        }

        public AndroidTestArgs build() {
            return $;
        }
    }

}