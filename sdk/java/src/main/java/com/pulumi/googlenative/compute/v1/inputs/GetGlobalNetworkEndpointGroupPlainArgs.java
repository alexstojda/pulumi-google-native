// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalNetworkEndpointGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalNetworkEndpointGroupPlainArgs Empty = new GetGlobalNetworkEndpointGroupPlainArgs();

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

    private GetGlobalNetworkEndpointGroupPlainArgs() {}

    private GetGlobalNetworkEndpointGroupPlainArgs(GetGlobalNetworkEndpointGroupPlainArgs $) {
        this.networkEndpointGroup = $.networkEndpointGroup;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalNetworkEndpointGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalNetworkEndpointGroupPlainArgs $;

        public Builder() {
            $ = new GetGlobalNetworkEndpointGroupPlainArgs();
        }

        public Builder(GetGlobalNetworkEndpointGroupPlainArgs defaults) {
            $ = new GetGlobalNetworkEndpointGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            $.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetGlobalNetworkEndpointGroupPlainArgs build() {
            $.networkEndpointGroup = Objects.requireNonNull($.networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
            return $;
        }
    }

}