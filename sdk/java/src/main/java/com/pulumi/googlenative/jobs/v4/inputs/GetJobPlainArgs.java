// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobPlainArgs Empty = new GetJobPlainArgs();

    @Import(name="jobId", required=true)
    private String jobId;

    public String jobId() {
        return this.jobId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    private GetJobPlainArgs() {}

    private GetJobPlainArgs(GetJobPlainArgs $) {
        this.jobId = $.jobId;
        this.project = $.project;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobPlainArgs $;

        public Builder() {
            $ = new GetJobPlainArgs();
        }

        public Builder(GetJobPlainArgs defaults) {
            $ = new GetJobPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(String jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public GetJobPlainArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}