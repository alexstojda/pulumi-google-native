// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpsHealthCheckArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpsHealthCheckArgs Empty = new GetHttpsHealthCheckArgs();

    @Import(name="httpsHealthCheck", required=true)
    private Output<String> httpsHealthCheck;

    public Output<String> httpsHealthCheck() {
        return this.httpsHealthCheck;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHttpsHealthCheckArgs() {}

    private GetHttpsHealthCheckArgs(GetHttpsHealthCheckArgs $) {
        this.httpsHealthCheck = $.httpsHealthCheck;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpsHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpsHealthCheckArgs $;

        public Builder() {
            $ = new GetHttpsHealthCheckArgs();
        }

        public Builder(GetHttpsHealthCheckArgs defaults) {
            $ = new GetHttpsHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpsHealthCheck(Output<String> httpsHealthCheck) {
            $.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder httpsHealthCheck(String httpsHealthCheck) {
            return httpsHealthCheck(Output.of(httpsHealthCheck));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetHttpsHealthCheckArgs build() {
            $.httpsHealthCheck = Objects.requireNonNull($.httpsHealthCheck, "expected parameter 'httpsHealthCheck' to be non-null");
            return $;
        }
    }

}