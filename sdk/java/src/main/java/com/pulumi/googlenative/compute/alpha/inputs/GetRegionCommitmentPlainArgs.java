// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionCommitmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionCommitmentPlainArgs Empty = new GetRegionCommitmentPlainArgs();

    @Import(name="commitment", required=true)
    private String commitment;

    public String commitment() {
        return this.commitment;
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

    private GetRegionCommitmentPlainArgs() {}

    private GetRegionCommitmentPlainArgs(GetRegionCommitmentPlainArgs $) {
        this.commitment = $.commitment;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionCommitmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionCommitmentPlainArgs $;

        public Builder() {
            $ = new GetRegionCommitmentPlainArgs();
        }

        public Builder(GetRegionCommitmentPlainArgs defaults) {
            $ = new GetRegionCommitmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder commitment(String commitment) {
            $.commitment = commitment;
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

        public GetRegionCommitmentPlainArgs build() {
            $.commitment = Objects.requireNonNull($.commitment, "expected parameter 'commitment' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}