// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupPlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPlanPlainArgs Empty = new GetBackupPlanPlainArgs();

    @Import(name="backupPlanId", required=true)
    private String backupPlanId;

    public String backupPlanId() {
        return this.backupPlanId;
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

    private GetBackupPlanPlainArgs() {}

    private GetBackupPlanPlainArgs(GetBackupPlanPlainArgs $) {
        this.backupPlanId = $.backupPlanId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPlanPlainArgs $;

        public Builder() {
            $ = new GetBackupPlanPlainArgs();
        }

        public Builder(GetBackupPlanPlainArgs defaults) {
            $ = new GetBackupPlanPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPlanId(String backupPlanId) {
            $.backupPlanId = backupPlanId;
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

        public GetBackupPlanPlainArgs build() {
            $.backupPlanId = Objects.requireNonNull($.backupPlanId, "expected parameter 'backupPlanId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}