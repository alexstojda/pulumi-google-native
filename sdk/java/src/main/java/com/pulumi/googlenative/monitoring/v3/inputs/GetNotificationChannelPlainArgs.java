// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotificationChannelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationChannelPlainArgs Empty = new GetNotificationChannelPlainArgs();

    @Import(name="notificationChannelId", required=true)
    private String notificationChannelId;

    public String notificationChannelId() {
        return this.notificationChannelId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNotificationChannelPlainArgs() {}

    private GetNotificationChannelPlainArgs(GetNotificationChannelPlainArgs $) {
        this.notificationChannelId = $.notificationChannelId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationChannelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationChannelPlainArgs $;

        public Builder() {
            $ = new GetNotificationChannelPlainArgs();
        }

        public Builder(GetNotificationChannelPlainArgs defaults) {
            $ = new GetNotificationChannelPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder notificationChannelId(String notificationChannelId) {
            $.notificationChannelId = notificationChannelId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNotificationChannelPlainArgs build() {
            $.notificationChannelId = Objects.requireNonNull($.notificationChannelId, "expected parameter 'notificationChannelId' to be non-null");
            return $;
        }
    }

}