// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetArchiveDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetArchiveDeploymentArgs Empty = new GetArchiveDeploymentArgs();

    @Import(name="archiveDeploymentId", required=true)
    private Output<String> archiveDeploymentId;

    public Output<String> archiveDeploymentId() {
        return this.archiveDeploymentId;
    }

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

    private GetArchiveDeploymentArgs() {}

    private GetArchiveDeploymentArgs(GetArchiveDeploymentArgs $) {
        this.archiveDeploymentId = $.archiveDeploymentId;
        this.environmentId = $.environmentId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetArchiveDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetArchiveDeploymentArgs $;

        public Builder() {
            $ = new GetArchiveDeploymentArgs();
        }

        public Builder(GetArchiveDeploymentArgs defaults) {
            $ = new GetArchiveDeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder archiveDeploymentId(Output<String> archiveDeploymentId) {
            $.archiveDeploymentId = archiveDeploymentId;
            return this;
        }

        public Builder archiveDeploymentId(String archiveDeploymentId) {
            return archiveDeploymentId(Output.of(archiveDeploymentId));
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

        public GetArchiveDeploymentArgs build() {
            $.archiveDeploymentId = Objects.requireNonNull($.archiveDeploymentId, "expected parameter 'archiveDeploymentId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}