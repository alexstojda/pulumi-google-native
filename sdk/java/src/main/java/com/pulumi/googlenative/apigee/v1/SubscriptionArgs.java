// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * Name of the API product for which the developer is purchasing a subscription.
     * 
     */
    @Import(name="apiproduct")
    private @Nullable Output<String> apiproduct;

    /**
     * @return Name of the API product for which the developer is purchasing a subscription.
     * 
     */
    public Optional<Output<String>> apiproduct() {
        return Optional.ofNullable(this.apiproduct);
    }

    @Import(name="developerId", required=true)
    private Output<String> developerId;

    public Output<String> developerId() {
        return this.developerId;
    }

    /**
     * Time when the API product subscription ends in milliseconds since epoch.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return Time when the API product subscription ends in milliseconds since epoch.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Time when the API product subscription starts in milliseconds since epoch.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Time when the API product subscription starts in milliseconds since epoch.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private SubscriptionArgs() {}

    private SubscriptionArgs(SubscriptionArgs $) {
        this.apiproduct = $.apiproduct;
        this.developerId = $.developerId;
        this.endTime = $.endTime;
        this.organizationId = $.organizationId;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionArgs $;

        public Builder() {
            $ = new SubscriptionArgs();
        }

        public Builder(SubscriptionArgs defaults) {
            $ = new SubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiproduct Name of the API product for which the developer is purchasing a subscription.
         * 
         * @return builder
         * 
         */
        public Builder apiproduct(@Nullable Output<String> apiproduct) {
            $.apiproduct = apiproduct;
            return this;
        }

        /**
         * @param apiproduct Name of the API product for which the developer is purchasing a subscription.
         * 
         * @return builder
         * 
         */
        public Builder apiproduct(String apiproduct) {
            return apiproduct(Output.of(apiproduct));
        }

        public Builder developerId(Output<String> developerId) {
            $.developerId = developerId;
            return this;
        }

        public Builder developerId(String developerId) {
            return developerId(Output.of(developerId));
        }

        /**
         * @param endTime Time when the API product subscription ends in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Time when the API product subscription ends in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param startTime Time when the API product subscription starts in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Time when the API product subscription starts in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public SubscriptionArgs build() {
            $.developerId = Objects.requireNonNull($.developerId, "expected parameter 'developerId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}