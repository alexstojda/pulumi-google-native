// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogItemPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogItemPlainArgs Empty = new GetCatalogItemPlainArgs();

    @Import(name="catalogId", required=true)
    private String catalogId;

    public String catalogId() {
        return this.catalogId;
    }

    @Import(name="catalogItemId", required=true)
    private String catalogItemId;

    public String catalogItemId() {
        return this.catalogItemId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCatalogItemPlainArgs() {}

    private GetCatalogItemPlainArgs(GetCatalogItemPlainArgs $) {
        this.catalogId = $.catalogId;
        this.catalogItemId = $.catalogItemId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogItemPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogItemPlainArgs $;

        public Builder() {
            $ = new GetCatalogItemPlainArgs();
        }

        public Builder(GetCatalogItemPlainArgs defaults) {
            $ = new GetCatalogItemPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogItemId(String catalogItemId) {
            $.catalogItemId = catalogItemId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCatalogItemPlainArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.catalogItemId = Objects.requireNonNull($.catalogItemId, "expected parameter 'catalogItemId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}