// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasePlainArgs Empty = new GetDatabasePlainArgs();

    @Import(name="databaseId", required=true)
    private String databaseId;

    public String databaseId() {
        return this.databaseId;
    }

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDatabasePlainArgs() {}

    private GetDatabasePlainArgs(GetDatabasePlainArgs $) {
        this.databaseId = $.databaseId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasePlainArgs $;

        public Builder() {
            $ = new GetDatabasePlainArgs();
        }

        public Builder(GetDatabasePlainArgs defaults) {
            $ = new GetDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseId(String databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDatabasePlainArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}