// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationExclusionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationExclusionArgs Empty = new GetOrganizationExclusionArgs();

    @Import(name="exclusionId", required=true)
    private Output<String> exclusionId;

    public Output<String> exclusionId() {
        return this.exclusionId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetOrganizationExclusionArgs() {}

    private GetOrganizationExclusionArgs(GetOrganizationExclusionArgs $) {
        this.exclusionId = $.exclusionId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationExclusionArgs $;

        public Builder() {
            $ = new GetOrganizationExclusionArgs();
        }

        public Builder(GetOrganizationExclusionArgs defaults) {
            $ = new GetOrganizationExclusionArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclusionId(Output<String> exclusionId) {
            $.exclusionId = exclusionId;
            return this;
        }

        public Builder exclusionId(String exclusionId) {
            return exclusionId(Output.of(exclusionId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetOrganizationExclusionArgs build() {
            $.exclusionId = Objects.requireNonNull($.exclusionId, "expected parameter 'exclusionId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}