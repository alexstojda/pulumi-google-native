// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationSourceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationSourceIamPolicyArgs Empty = new GetOrganizationSourceIamPolicyArgs();

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    private GetOrganizationSourceIamPolicyArgs() {}

    private GetOrganizationSourceIamPolicyArgs(GetOrganizationSourceIamPolicyArgs $) {
        this.organizationId = $.organizationId;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationSourceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationSourceIamPolicyArgs $;

        public Builder() {
            $ = new GetOrganizationSourceIamPolicyArgs();
        }

        public Builder(GetOrganizationSourceIamPolicyArgs defaults) {
            $ = new GetOrganizationSourceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public GetOrganizationSourceIamPolicyArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}