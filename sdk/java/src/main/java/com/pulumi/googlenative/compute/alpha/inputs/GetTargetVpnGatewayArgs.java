// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetVpnGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetVpnGatewayArgs Empty = new GetTargetVpnGatewayArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="targetVpnGateway", required=true)
    private Output<String> targetVpnGateway;

    public Output<String> targetVpnGateway() {
        return this.targetVpnGateway;
    }

    private GetTargetVpnGatewayArgs() {}

    private GetTargetVpnGatewayArgs(GetTargetVpnGatewayArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.targetVpnGateway = $.targetVpnGateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetVpnGatewayArgs $;

        public Builder() {
            $ = new GetTargetVpnGatewayArgs();
        }

        public Builder(GetTargetVpnGatewayArgs defaults) {
            $ = new GetTargetVpnGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder targetVpnGateway(Output<String> targetVpnGateway) {
            $.targetVpnGateway = targetVpnGateway;
            return this;
        }

        public Builder targetVpnGateway(String targetVpnGateway) {
            return targetVpnGateway(Output.of(targetVpnGateway));
        }

        public GetTargetVpnGatewayArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.targetVpnGateway = Objects.requireNonNull($.targetVpnGateway, "expected parameter 'targetVpnGateway' to be non-null");
            return $;
        }
    }

}