// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing.v1.inputs.LauncherActivityIntentArgs;
import com.pulumi.googlenative.testing.v1.inputs.StartActivityIntentArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message for specifying the start activities to crawl.
 * 
 */
public final class RoboStartingIntentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoboStartingIntentArgs Empty = new RoboStartingIntentArgs();

    /**
     * An intent that starts the main launcher activity.
     * 
     */
    @Import(name="launcherActivity")
    private @Nullable Output<LauncherActivityIntentArgs> launcherActivity;

    /**
     * @return An intent that starts the main launcher activity.
     * 
     */
    public Optional<Output<LauncherActivityIntentArgs>> launcherActivity() {
        return Optional.ofNullable(this.launcherActivity);
    }

    /**
     * An intent that starts an activity with specific details.
     * 
     */
    @Import(name="startActivity")
    private @Nullable Output<StartActivityIntentArgs> startActivity;

    /**
     * @return An intent that starts an activity with specific details.
     * 
     */
    public Optional<Output<StartActivityIntentArgs>> startActivity() {
        return Optional.ofNullable(this.startActivity);
    }

    /**
     * Timeout in seconds for each intent.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Timeout in seconds for each intent.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private RoboStartingIntentArgs() {}

    private RoboStartingIntentArgs(RoboStartingIntentArgs $) {
        this.launcherActivity = $.launcherActivity;
        this.startActivity = $.startActivity;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoboStartingIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoboStartingIntentArgs $;

        public Builder() {
            $ = new RoboStartingIntentArgs();
        }

        public Builder(RoboStartingIntentArgs defaults) {
            $ = new RoboStartingIntentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param launcherActivity An intent that starts the main launcher activity.
         * 
         * @return builder
         * 
         */
        public Builder launcherActivity(@Nullable Output<LauncherActivityIntentArgs> launcherActivity) {
            $.launcherActivity = launcherActivity;
            return this;
        }

        /**
         * @param launcherActivity An intent that starts the main launcher activity.
         * 
         * @return builder
         * 
         */
        public Builder launcherActivity(LauncherActivityIntentArgs launcherActivity) {
            return launcherActivity(Output.of(launcherActivity));
        }

        /**
         * @param startActivity An intent that starts an activity with specific details.
         * 
         * @return builder
         * 
         */
        public Builder startActivity(@Nullable Output<StartActivityIntentArgs> startActivity) {
            $.startActivity = startActivity;
            return this;
        }

        /**
         * @param startActivity An intent that starts an activity with specific details.
         * 
         * @return builder
         * 
         */
        public Builder startActivity(StartActivityIntentArgs startActivity) {
            return startActivity(Output.of(startActivity));
        }

        /**
         * @param timeout Timeout in seconds for each intent.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout in seconds for each intent.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public RoboStartingIntentArgs build() {
            return $;
        }
    }

}