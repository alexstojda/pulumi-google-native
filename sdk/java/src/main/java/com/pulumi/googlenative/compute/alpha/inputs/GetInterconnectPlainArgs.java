// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInterconnectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInterconnectPlainArgs Empty = new GetInterconnectPlainArgs();

    @Import(name="interconnect", required=true)
    private String interconnect;

    public String interconnect() {
        return this.interconnect;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInterconnectPlainArgs() {}

    private GetInterconnectPlainArgs(GetInterconnectPlainArgs $) {
        this.interconnect = $.interconnect;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInterconnectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInterconnectPlainArgs $;

        public Builder() {
            $ = new GetInterconnectPlainArgs();
        }

        public Builder(GetInterconnectPlainArgs defaults) {
            $ = new GetInterconnectPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder interconnect(String interconnect) {
            $.interconnect = interconnect;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInterconnectPlainArgs build() {
            $.interconnect = Objects.requireNonNull($.interconnect, "expected parameter 'interconnect' to be non-null");
            return $;
        }
    }

}