// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionAutoscalerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionAutoscalerArgs Empty = new GetRegionAutoscalerArgs();

    @Import(name="autoscaler", required=true)
    private Output<String> autoscaler;

    public Output<String> autoscaler() {
        return this.autoscaler;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetRegionAutoscalerArgs() {}

    private GetRegionAutoscalerArgs(GetRegionAutoscalerArgs $) {
        this.autoscaler = $.autoscaler;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionAutoscalerArgs $;

        public Builder() {
            $ = new GetRegionAutoscalerArgs();
        }

        public Builder(GetRegionAutoscalerArgs defaults) {
            $ = new GetRegionAutoscalerArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaler(Output<String> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        public Builder autoscaler(String autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetRegionAutoscalerArgs build() {
            $.autoscaler = Objects.requireNonNull($.autoscaler, "expected parameter 'autoscaler' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}