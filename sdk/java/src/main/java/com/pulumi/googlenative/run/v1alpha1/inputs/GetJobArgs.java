// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    @Import(name="jobId", required=true)
    private Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId;
    }

    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    private GetJobArgs() {}

    private GetJobArgs(GetJobArgs $) {
        this.jobId = $.jobId;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobArgs $;

        public Builder() {
            $ = new GetJobArgs();
        }

        public Builder(GetJobArgs defaults) {
            $ = new GetJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public GetJobArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}