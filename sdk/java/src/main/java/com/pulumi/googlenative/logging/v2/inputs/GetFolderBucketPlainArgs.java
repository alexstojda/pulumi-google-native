// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderBucketPlainArgs Empty = new GetFolderBucketPlainArgs();

    @Import(name="bucketId", required=true)
    private String bucketId;

    public String bucketId() {
        return this.bucketId;
    }

    @Import(name="folderId", required=true)
    private String folderId;

    public String folderId() {
        return this.folderId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    private GetFolderBucketPlainArgs() {}

    private GetFolderBucketPlainArgs(GetFolderBucketPlainArgs $) {
        this.bucketId = $.bucketId;
        this.folderId = $.folderId;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderBucketPlainArgs $;

        public Builder() {
            $ = new GetFolderBucketPlainArgs();
        }

        public Builder(GetFolderBucketPlainArgs defaults) {
            $ = new GetFolderBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketId(String bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder folderId(String folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public GetFolderBucketPlainArgs build() {
            $.bucketId = Objects.requireNonNull($.bucketId, "expected parameter 'bucketId' to be non-null");
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}