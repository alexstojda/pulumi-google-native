// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSharedflowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedflowArgs Empty = new GetSharedflowArgs();

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="sharedflowId", required=true)
    private Output<String> sharedflowId;

    public Output<String> sharedflowId() {
        return this.sharedflowId;
    }

    private GetSharedflowArgs() {}

    private GetSharedflowArgs(GetSharedflowArgs $) {
        this.organizationId = $.organizationId;
        this.sharedflowId = $.sharedflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedflowArgs $;

        public Builder() {
            $ = new GetSharedflowArgs();
        }

        public Builder(GetSharedflowArgs defaults) {
            $ = new GetSharedflowArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder sharedflowId(Output<String> sharedflowId) {
            $.sharedflowId = sharedflowId;
            return this;
        }

        public Builder sharedflowId(String sharedflowId) {
            return sharedflowId(Output.of(sharedflowId));
        }

        public GetSharedflowArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.sharedflowId = Objects.requireNonNull($.sharedflowId, "expected parameter 'sharedflowId' to be non-null");
            return $;
        }
    }

}