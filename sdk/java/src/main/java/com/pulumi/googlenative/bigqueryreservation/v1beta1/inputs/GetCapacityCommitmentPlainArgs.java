// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityCommitmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapacityCommitmentPlainArgs Empty = new GetCapacityCommitmentPlainArgs();

    @Import(name="capacityCommitmentId", required=true)
    private String capacityCommitmentId;

    public String capacityCommitmentId() {
        return this.capacityCommitmentId;
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

    private GetCapacityCommitmentPlainArgs() {}

    private GetCapacityCommitmentPlainArgs(GetCapacityCommitmentPlainArgs $) {
        this.capacityCommitmentId = $.capacityCommitmentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityCommitmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityCommitmentPlainArgs $;

        public Builder() {
            $ = new GetCapacityCommitmentPlainArgs();
        }

        public Builder(GetCapacityCommitmentPlainArgs defaults) {
            $ = new GetCapacityCommitmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityCommitmentId(String capacityCommitmentId) {
            $.capacityCommitmentId = capacityCommitmentId;
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

        public GetCapacityCommitmentPlainArgs build() {
            $.capacityCommitmentId = Objects.requireNonNull($.capacityCommitmentId, "expected parameter 'capacityCommitmentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}