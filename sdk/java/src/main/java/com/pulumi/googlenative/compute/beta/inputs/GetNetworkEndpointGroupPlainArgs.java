// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkEndpointGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkEndpointGroupPlainArgs Empty = new GetNetworkEndpointGroupPlainArgs();

    @Import(name="networkEndpointGroup", required=true)
    private String networkEndpointGroup;

    public String networkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetNetworkEndpointGroupPlainArgs() {}

    private GetNetworkEndpointGroupPlainArgs(GetNetworkEndpointGroupPlainArgs $) {
        this.networkEndpointGroup = $.networkEndpointGroup;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkEndpointGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkEndpointGroupPlainArgs $;

        public Builder() {
            $ = new GetNetworkEndpointGroupPlainArgs();
        }

        public Builder(GetNetworkEndpointGroupPlainArgs defaults) {
            $ = new GetNetworkEndpointGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            $.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetNetworkEndpointGroupPlainArgs build() {
            $.networkEndpointGroup = Objects.requireNonNull($.networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}