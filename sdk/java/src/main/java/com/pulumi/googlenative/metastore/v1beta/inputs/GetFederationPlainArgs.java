// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFederationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederationPlainArgs Empty = new GetFederationPlainArgs();

    @Import(name="federationId", required=true)
    private String federationId;

    public String federationId() {
        return this.federationId;
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

    private GetFederationPlainArgs() {}

    private GetFederationPlainArgs(GetFederationPlainArgs $) {
        this.federationId = $.federationId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederationPlainArgs $;

        public Builder() {
            $ = new GetFederationPlainArgs();
        }

        public Builder(GetFederationPlainArgs defaults) {
            $ = new GetFederationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder federationId(String federationId) {
            $.federationId = federationId;
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

        public GetFederationPlainArgs build() {
            $.federationId = Objects.requireNonNull($.federationId, "expected parameter 'federationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}