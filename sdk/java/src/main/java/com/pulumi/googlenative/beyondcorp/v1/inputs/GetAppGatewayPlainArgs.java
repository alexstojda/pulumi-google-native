// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppGatewayPlainArgs Empty = new GetAppGatewayPlainArgs();

    @Import(name="appGatewayId", required=true)
    private String appGatewayId;

    public String appGatewayId() {
        return this.appGatewayId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAppGatewayPlainArgs() {}

    private GetAppGatewayPlainArgs(GetAppGatewayPlainArgs $) {
        this.appGatewayId = $.appGatewayId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppGatewayPlainArgs $;

        public Builder() {
            $ = new GetAppGatewayPlainArgs();
        }

        public Builder(GetAppGatewayPlainArgs defaults) {
            $ = new GetAppGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appGatewayId(String appGatewayId) {
            $.appGatewayId = appGatewayId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAppGatewayPlainArgs build() {
            $.appGatewayId = Objects.requireNonNull($.appGatewayId, "expected parameter 'appGatewayId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}