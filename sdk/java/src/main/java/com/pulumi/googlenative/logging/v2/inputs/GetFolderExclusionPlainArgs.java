// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderExclusionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderExclusionPlainArgs Empty = new GetFolderExclusionPlainArgs();

    @Import(name="exclusionId", required=true)
    private String exclusionId;

    public String exclusionId() {
        return this.exclusionId;
    }

    @Import(name="folderId", required=true)
    private String folderId;

    public String folderId() {
        return this.folderId;
    }

    private GetFolderExclusionPlainArgs() {}

    private GetFolderExclusionPlainArgs(GetFolderExclusionPlainArgs $) {
        this.exclusionId = $.exclusionId;
        this.folderId = $.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderExclusionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderExclusionPlainArgs $;

        public Builder() {
            $ = new GetFolderExclusionPlainArgs();
        }

        public Builder(GetFolderExclusionPlainArgs defaults) {
            $ = new GetFolderExclusionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclusionId(String exclusionId) {
            $.exclusionId = exclusionId;
            return this;
        }

        public Builder folderId(String folderId) {
            $.folderId = folderId;
            return this;
        }

        public GetFolderExclusionPlainArgs build() {
            $.exclusionId = Objects.requireNonNull($.exclusionId, "expected parameter 'exclusionId' to be non-null");
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}