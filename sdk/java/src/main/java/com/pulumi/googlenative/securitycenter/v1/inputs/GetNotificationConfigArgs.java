// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationConfigArgs Empty = new GetNotificationConfigArgs();

    @Import(name="notificationConfigId", required=true)
    private Output<String> notificationConfigId;

    public Output<String> notificationConfigId() {
        return this.notificationConfigId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetNotificationConfigArgs() {}

    private GetNotificationConfigArgs(GetNotificationConfigArgs $) {
        this.notificationConfigId = $.notificationConfigId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationConfigArgs $;

        public Builder() {
            $ = new GetNotificationConfigArgs();
        }

        public Builder(GetNotificationConfigArgs defaults) {
            $ = new GetNotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder notificationConfigId(Output<String> notificationConfigId) {
            $.notificationConfigId = notificationConfigId;
            return this;
        }

        public Builder notificationConfigId(String notificationConfigId) {
            return notificationConfigId(Output.of(notificationConfigId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetNotificationConfigArgs build() {
            $.notificationConfigId = Objects.requireNonNull($.notificationConfigId, "expected parameter 'notificationConfigId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}