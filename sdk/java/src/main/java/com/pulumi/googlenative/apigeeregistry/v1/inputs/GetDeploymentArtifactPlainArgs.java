// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentArtifactPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentArtifactPlainArgs Empty = new GetDeploymentArtifactPlainArgs();

    @Import(name="apiId", required=true)
    private String apiId;

    public String apiId() {
        return this.apiId;
    }

    @Import(name="artifactId", required=true)
    private String artifactId;

    public String artifactId() {
        return this.artifactId;
    }

    @Import(name="deploymentId", required=true)
    private String deploymentId;

    public String deploymentId() {
        return this.deploymentId;
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

    private GetDeploymentArtifactPlainArgs() {}

    private GetDeploymentArtifactPlainArgs(GetDeploymentArtifactPlainArgs $) {
        this.apiId = $.apiId;
        this.artifactId = $.artifactId;
        this.deploymentId = $.deploymentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentArtifactPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentArtifactPlainArgs $;

        public Builder() {
            $ = new GetDeploymentArtifactPlainArgs();
        }

        public Builder(GetDeploymentArtifactPlainArgs defaults) {
            $ = new GetDeploymentArtifactPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder artifactId(String artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
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

        public GetDeploymentArtifactPlainArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}