// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMembershipPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipPlainArgs Empty = new GetMembershipPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="membershipId", required=true)
    private String membershipId;

    public String membershipId() {
        return this.membershipId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMembershipPlainArgs() {}

    private GetMembershipPlainArgs(GetMembershipPlainArgs $) {
        this.location = $.location;
        this.membershipId = $.membershipId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMembershipPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMembershipPlainArgs $;

        public Builder() {
            $ = new GetMembershipPlainArgs();
        }

        public Builder(GetMembershipPlainArgs defaults) {
            $ = new GetMembershipPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder membershipId(String membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetMembershipPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}