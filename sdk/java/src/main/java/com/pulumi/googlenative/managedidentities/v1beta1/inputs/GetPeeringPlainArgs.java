// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringPlainArgs Empty = new GetPeeringPlainArgs();

    @Import(name="peeringId", required=true)
    private String peeringId;

    public String peeringId() {
        return this.peeringId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetPeeringPlainArgs() {}

    private GetPeeringPlainArgs(GetPeeringPlainArgs $) {
        this.peeringId = $.peeringId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringPlainArgs $;

        public Builder() {
            $ = new GetPeeringPlainArgs();
        }

        public Builder(GetPeeringPlainArgs defaults) {
            $ = new GetPeeringPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder peeringId(String peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetPeeringPlainArgs build() {
            $.peeringId = Objects.requireNonNull($.peeringId, "expected parameter 'peeringId' to be non-null");
            return $;
        }
    }

}