// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolePlainArgs Empty = new GetRolePlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="roleId", required=true)
    private String roleId;

    public String roleId() {
        return this.roleId;
    }

    private GetRolePlainArgs() {}

    private GetRolePlainArgs(GetRolePlainArgs $) {
        this.project = $.project;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolePlainArgs $;

        public Builder() {
            $ = new GetRolePlainArgs();
        }

        public Builder(GetRolePlainArgs defaults) {
            $ = new GetRolePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder roleId(String roleId) {
            $.roleId = roleId;
            return this;
        }

        public GetRolePlainArgs build() {
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            return $;
        }
    }

}