// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlServerAuditConfigArgs Empty = new SqlServerAuditConfigArgs();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return This is always sql#sqlServerAuditConfig
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * How long to keep generated audit files.
     * 
     */
    @Import(name="retentionInterval")
    private @Nullable Output<String> retentionInterval;

    /**
     * @return How long to keep generated audit files.
     * 
     */
    public Optional<Output<String>> retentionInterval() {
        return Optional.ofNullable(this.retentionInterval);
    }

    /**
     * How often to upload generated audit files.
     * 
     */
    @Import(name="uploadInterval")
    private @Nullable Output<String> uploadInterval;

    /**
     * @return How often to upload generated audit files.
     * 
     */
    public Optional<Output<String>> uploadInterval() {
        return Optional.ofNullable(this.uploadInterval);
    }

    private SqlServerAuditConfigArgs() {}

    private SqlServerAuditConfigArgs(SqlServerAuditConfigArgs $) {
        this.bucket = $.bucket;
        this.kind = $.kind;
        this.retentionInterval = $.retentionInterval;
        this.uploadInterval = $.uploadInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerAuditConfigArgs $;

        public Builder() {
            $ = new SqlServerAuditConfigArgs();
        }

        public Builder(SqlServerAuditConfigArgs defaults) {
            $ = new SqlServerAuditConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the destination bucket (e.g., gs://mybucket).
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the destination bucket (e.g., gs://mybucket).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param kind This is always sql#sqlServerAuditConfig
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind This is always sql#sqlServerAuditConfig
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param retentionInterval How long to keep generated audit files.
         * 
         * @return builder
         * 
         */
        public Builder retentionInterval(@Nullable Output<String> retentionInterval) {
            $.retentionInterval = retentionInterval;
            return this;
        }

        /**
         * @param retentionInterval How long to keep generated audit files.
         * 
         * @return builder
         * 
         */
        public Builder retentionInterval(String retentionInterval) {
            return retentionInterval(Output.of(retentionInterval));
        }

        /**
         * @param uploadInterval How often to upload generated audit files.
         * 
         * @return builder
         * 
         */
        public Builder uploadInterval(@Nullable Output<String> uploadInterval) {
            $.uploadInterval = uploadInterval;
            return this;
        }

        /**
         * @param uploadInterval How often to upload generated audit files.
         * 
         * @return builder
         * 
         */
        public Builder uploadInterval(String uploadInterval) {
            return uploadInterval(Output.of(uploadInterval));
        }

        public SqlServerAuditConfigArgs build() {
            return $;
        }
    }

}