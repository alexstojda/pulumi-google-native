// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionHealthCheckServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionHealthCheckServicePlainArgs Empty = new GetRegionHealthCheckServicePlainArgs();

    @Import(name="healthCheckService", required=true)
    private String healthCheckService;

    public String healthCheckService() {
        return this.healthCheckService;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetRegionHealthCheckServicePlainArgs() {}

    private GetRegionHealthCheckServicePlainArgs(GetRegionHealthCheckServicePlainArgs $) {
        this.healthCheckService = $.healthCheckService;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionHealthCheckServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionHealthCheckServicePlainArgs $;

        public Builder() {
            $ = new GetRegionHealthCheckServicePlainArgs();
        }

        public Builder(GetRegionHealthCheckServicePlainArgs defaults) {
            $ = new GetRegionHealthCheckServicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheckService(String healthCheckService) {
            $.healthCheckService = healthCheckService;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRegionHealthCheckServicePlainArgs build() {
            $.healthCheckService = Objects.requireNonNull($.healthCheckService, "expected parameter 'healthCheckService' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}