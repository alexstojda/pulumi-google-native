// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.enums.DeploymentOccurrencePlatform;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The period during which some deployable was active in a runtime.
 * 
 */
public final class DeploymentOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentOccurrenceArgs Empty = new DeploymentOccurrenceArgs();

    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Address of the runtime element hosting this deployment.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Configuration used to create this deployment.
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return Configuration used to create this deployment.
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    @Import(name="deployTime", required=true)
    private Output<String> deployTime;

    /**
     * @return Beginning of the lifetime of this deployment.
     * 
     */
    public Output<String> deployTime() {
        return this.deployTime;
    }

    /**
     * Platform hosting this deployment.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<DeploymentOccurrencePlatform> platform;

    /**
     * @return Platform hosting this deployment.
     * 
     */
    public Optional<Output<DeploymentOccurrencePlatform>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * End of the lifetime of this deployment.
     * 
     */
    @Import(name="undeployTime")
    private @Nullable Output<String> undeployTime;

    /**
     * @return End of the lifetime of this deployment.
     * 
     */
    public Optional<Output<String>> undeployTime() {
        return Optional.ofNullable(this.undeployTime);
    }

    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    @Import(name="userEmail")
    private @Nullable Output<String> userEmail;

    /**
     * @return Identity of the user that triggered this deployment.
     * 
     */
    public Optional<Output<String>> userEmail() {
        return Optional.ofNullable(this.userEmail);
    }

    private DeploymentOccurrenceArgs() {}

    private DeploymentOccurrenceArgs(DeploymentOccurrenceArgs $) {
        this.address = $.address;
        this.config = $.config;
        this.deployTime = $.deployTime;
        this.platform = $.platform;
        this.undeployTime = $.undeployTime;
        this.userEmail = $.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentOccurrenceArgs $;

        public Builder() {
            $ = new DeploymentOccurrenceArgs();
        }

        public Builder(DeploymentOccurrenceArgs defaults) {
            $ = new DeploymentOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Address of the runtime element hosting this deployment.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Address of the runtime element hosting this deployment.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param config Configuration used to create this deployment.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration used to create this deployment.
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param deployTime Beginning of the lifetime of this deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployTime(Output<String> deployTime) {
            $.deployTime = deployTime;
            return this;
        }

        /**
         * @param deployTime Beginning of the lifetime of this deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployTime(String deployTime) {
            return deployTime(Output.of(deployTime));
        }

        /**
         * @param platform Platform hosting this deployment.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<DeploymentOccurrencePlatform> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Platform hosting this deployment.
         * 
         * @return builder
         * 
         */
        public Builder platform(DeploymentOccurrencePlatform platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param undeployTime End of the lifetime of this deployment.
         * 
         * @return builder
         * 
         */
        public Builder undeployTime(@Nullable Output<String> undeployTime) {
            $.undeployTime = undeployTime;
            return this;
        }

        /**
         * @param undeployTime End of the lifetime of this deployment.
         * 
         * @return builder
         * 
         */
        public Builder undeployTime(String undeployTime) {
            return undeployTime(Output.of(undeployTime));
        }

        /**
         * @param userEmail Identity of the user that triggered this deployment.
         * 
         * @return builder
         * 
         */
        public Builder userEmail(@Nullable Output<String> userEmail) {
            $.userEmail = userEmail;
            return this;
        }

        /**
         * @param userEmail Identity of the user that triggered this deployment.
         * 
         * @return builder
         * 
         */
        public Builder userEmail(String userEmail) {
            return userEmail(Output.of(userEmail));
        }

        public DeploymentOccurrenceArgs build() {
            $.deployTime = Objects.requireNonNull($.deployTime, "expected parameter 'deployTime' to be non-null");
            return $;
        }
    }

}