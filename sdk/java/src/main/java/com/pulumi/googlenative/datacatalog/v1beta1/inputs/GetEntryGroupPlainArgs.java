// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntryGroupPlainArgs Empty = new GetEntryGroupPlainArgs();

    @Import(name="entryGroupId", required=true)
    private String entryGroupId;

    public String entryGroupId() {
        return this.entryGroupId;
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

    @Import(name="readMask")
    private @Nullable String readMask;

    public Optional<String> readMask() {
        return Optional.ofNullable(this.readMask);
    }

    private GetEntryGroupPlainArgs() {}

    private GetEntryGroupPlainArgs(GetEntryGroupPlainArgs $) {
        this.entryGroupId = $.entryGroupId;
        this.location = $.location;
        this.project = $.project;
        this.readMask = $.readMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntryGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntryGroupPlainArgs $;

        public Builder() {
            $ = new GetEntryGroupPlainArgs();
        }

        public Builder(GetEntryGroupPlainArgs defaults) {
            $ = new GetEntryGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder entryGroupId(String entryGroupId) {
            $.entryGroupId = entryGroupId;
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

        public Builder readMask(@Nullable String readMask) {
            $.readMask = readMask;
            return this;
        }

        public GetEntryGroupPlainArgs build() {
            $.entryGroupId = Objects.requireNonNull($.entryGroupId, "expected parameter 'entryGroupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}