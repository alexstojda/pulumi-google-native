// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransferJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransferJobArgs Empty = new GetTransferJobArgs();

    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    @Import(name="transferJobId", required=true)
    private Output<String> transferJobId;

    public Output<String> transferJobId() {
        return this.transferJobId;
    }

    private GetTransferJobArgs() {}

    private GetTransferJobArgs(GetTransferJobArgs $) {
        this.projectId = $.projectId;
        this.transferJobId = $.transferJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransferJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransferJobArgs $;

        public Builder() {
            $ = new GetTransferJobArgs();
        }

        public Builder(GetTransferJobArgs defaults) {
            $ = new GetTransferJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder transferJobId(Output<String> transferJobId) {
            $.transferJobId = transferJobId;
            return this;
        }

        public Builder transferJobId(String transferJobId) {
            return transferJobId(Output.of(transferJobId));
        }

        public GetTransferJobArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.transferJobId = Objects.requireNonNull($.transferJobId, "expected parameter 'transferJobId' to be non-null");
            return $;
        }
    }

}