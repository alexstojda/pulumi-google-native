// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHl7V2StoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHl7V2StoreArgs Empty = new GetHl7V2StoreArgs();

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="hl7V2StoreId", required=true)
    private Output<String> hl7V2StoreId;

    public Output<String> hl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHl7V2StoreArgs() {}

    private GetHl7V2StoreArgs(GetHl7V2StoreArgs $) {
        this.datasetId = $.datasetId;
        this.hl7V2StoreId = $.hl7V2StoreId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHl7V2StoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHl7V2StoreArgs $;

        public Builder() {
            $ = new GetHl7V2StoreArgs();
        }

        public Builder(GetHl7V2StoreArgs defaults) {
            $ = new GetHl7V2StoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder hl7V2StoreId(Output<String> hl7V2StoreId) {
            $.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        public Builder hl7V2StoreId(String hl7V2StoreId) {
            return hl7V2StoreId(Output.of(hl7V2StoreId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetHl7V2StoreArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.hl7V2StoreId = Objects.requireNonNull($.hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}