// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.analyticshub.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListingArgs Empty = new GetListingArgs();

    @Import(name="dataExchangeId", required=true)
    private Output<String> dataExchangeId;

    public Output<String> dataExchangeId() {
        return this.dataExchangeId;
    }

    @Import(name="listingId", required=true)
    private Output<String> listingId;

    public Output<String> listingId() {
        return this.listingId;
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

    private GetListingArgs() {}

    private GetListingArgs(GetListingArgs $) {
        this.dataExchangeId = $.dataExchangeId;
        this.listingId = $.listingId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListingArgs $;

        public Builder() {
            $ = new GetListingArgs();
        }

        public Builder(GetListingArgs defaults) {
            $ = new GetListingArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataExchangeId(Output<String> dataExchangeId) {
            $.dataExchangeId = dataExchangeId;
            return this;
        }

        public Builder dataExchangeId(String dataExchangeId) {
            return dataExchangeId(Output.of(dataExchangeId));
        }

        public Builder listingId(Output<String> listingId) {
            $.listingId = listingId;
            return this;
        }

        public Builder listingId(String listingId) {
            return listingId(Output.of(listingId));
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

        public GetListingArgs build() {
            $.dataExchangeId = Objects.requireNonNull($.dataExchangeId, "expected parameter 'dataExchangeId' to be non-null");
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}