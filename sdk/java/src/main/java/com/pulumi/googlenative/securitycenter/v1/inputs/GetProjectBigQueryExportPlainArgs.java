// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectBigQueryExportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectBigQueryExportPlainArgs Empty = new GetProjectBigQueryExportPlainArgs();

    @Import(name="bigQueryExportId", required=true)
    private String bigQueryExportId;

    public String bigQueryExportId() {
        return this.bigQueryExportId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProjectBigQueryExportPlainArgs() {}

    private GetProjectBigQueryExportPlainArgs(GetProjectBigQueryExportPlainArgs $) {
        this.bigQueryExportId = $.bigQueryExportId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectBigQueryExportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectBigQueryExportPlainArgs $;

        public Builder() {
            $ = new GetProjectBigQueryExportPlainArgs();
        }

        public Builder(GetProjectBigQueryExportPlainArgs defaults) {
            $ = new GetProjectBigQueryExportPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigQueryExportId(String bigQueryExportId) {
            $.bigQueryExportId = bigQueryExportId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetProjectBigQueryExportPlainArgs build() {
            $.bigQueryExportId = Objects.requireNonNull($.bigQueryExportId, "expected parameter 'bigQueryExportId' to be non-null");
            return $;
        }
    }

}