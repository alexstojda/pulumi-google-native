// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPlanArgs Empty = new GetBackupPlanArgs();

    @Import(name="backupPlanId", required=true)
    private Output<String> backupPlanId;

    public Output<String> backupPlanId() {
        return this.backupPlanId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackupPlanArgs() {}

    private GetBackupPlanArgs(GetBackupPlanArgs $) {
        this.backupPlanId = $.backupPlanId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPlanArgs $;

        public Builder() {
            $ = new GetBackupPlanArgs();
        }

        public Builder(GetBackupPlanArgs defaults) {
            $ = new GetBackupPlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPlanId(Output<String> backupPlanId) {
            $.backupPlanId = backupPlanId;
            return this;
        }

        public Builder backupPlanId(String backupPlanId) {
            return backupPlanId(Output.of(backupPlanId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetBackupPlanArgs build() {
            $.backupPlanId = Objects.requireNonNull($.backupPlanId, "expected parameter 'backupPlanId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}