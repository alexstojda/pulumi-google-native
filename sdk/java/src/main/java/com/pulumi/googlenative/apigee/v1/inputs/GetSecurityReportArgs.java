// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityReportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityReportArgs Empty = new GetSecurityReportArgs();

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="securityReportId", required=true)
    private Output<String> securityReportId;

    public Output<String> securityReportId() {
        return this.securityReportId;
    }

    private GetSecurityReportArgs() {}

    private GetSecurityReportArgs(GetSecurityReportArgs $) {
        this.environmentId = $.environmentId;
        this.organizationId = $.organizationId;
        this.securityReportId = $.securityReportId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityReportArgs $;

        public Builder() {
            $ = new GetSecurityReportArgs();
        }

        public Builder(GetSecurityReportArgs defaults) {
            $ = new GetSecurityReportArgs(Objects.requireNonNull(defaults));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder securityReportId(Output<String> securityReportId) {
            $.securityReportId = securityReportId;
            return this;
        }

        public Builder securityReportId(String securityReportId) {
            return securityReportId(Output.of(securityReportId));
        }

        public GetSecurityReportArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.securityReportId = Objects.requireNonNull($.securityReportId, "expected parameter 'securityReportId' to be non-null");
            return $;
        }
    }

}