// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    /**
     * Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
     * 
     */
    @Import(name="backupId", required=true)
    private Output<String> backupId;

    /**
     * @return Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
     * 
     */
    public Output<String> backupId() {
        return this.backupId;
    }

    /**
     * Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Required. The encryption type of the backup.
     * 
     */
    @Import(name="encryptionConfigEncryptionType", required=true)
    private Output<String> encryptionConfigEncryptionType;

    /**
     * @return Required. The encryption type of the backup.
     * 
     */
    public Output<String> encryptionConfigEncryptionType() {
        return this.encryptionConfigEncryptionType;
    }

    /**
     * Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
     * 
     */
    @Import(name="encryptionConfigKmsKeyName")
    private @Nullable Output<String> encryptionConfigKmsKeyName;

    /**
     * @return Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
     * 
     */
    public Optional<Output<String>> encryptionConfigKmsKeyName() {
        return Optional.ofNullable(this.encryptionConfigKmsKeyName);
    }

    /**
     * Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
     * 
     */
    @Import(name="versionTime")
    private @Nullable Output<String> versionTime;

    /**
     * @return The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
     * 
     */
    public Optional<Output<String>> versionTime() {
        return Optional.ofNullable(this.versionTime);
    }

    private BackupArgs() {}

    private BackupArgs(BackupArgs $) {
        this.backupId = $.backupId;
        this.database = $.database;
        this.encryptionConfigEncryptionType = $.encryptionConfigEncryptionType;
        this.encryptionConfigKmsKeyName = $.encryptionConfigKmsKeyName;
        this.expireTime = $.expireTime;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.project = $.project;
        this.versionTime = $.versionTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupArgs $;

        public Builder() {
            $ = new BackupArgs();
        }

        public Builder(BackupArgs defaults) {
            $ = new BackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
         * 
         * @return builder
         * 
         */
        public Builder backupId(Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupId Required. The id of the backup to be created. The `backup_id` appended to `parent` forms the full backup name of the form `projects//instances//backups/`.
         * 
         * @return builder
         * 
         */
        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        /**
         * @param database Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param encryptionConfigEncryptionType Required. The encryption type of the backup.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfigEncryptionType(Output<String> encryptionConfigEncryptionType) {
            $.encryptionConfigEncryptionType = encryptionConfigEncryptionType;
            return this;
        }

        /**
         * @param encryptionConfigEncryptionType Required. The encryption type of the backup.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfigEncryptionType(String encryptionConfigEncryptionType) {
            return encryptionConfigEncryptionType(Output.of(encryptionConfigEncryptionType));
        }

        /**
         * @param encryptionConfigKmsKeyName Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfigKmsKeyName(@Nullable Output<String> encryptionConfigKmsKeyName) {
            $.encryptionConfigKmsKeyName = encryptionConfigKmsKeyName;
            return this;
        }

        /**
         * @param encryptionConfigKmsKeyName Optional. The Cloud KMS key that will be used to protect the backup. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfigKmsKeyName(String encryptionConfigKmsKeyName) {
            return encryptionConfigKmsKeyName(Output.of(encryptionConfigKmsKeyName));
        }

        /**
         * @param expireTime Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param versionTime The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
         * 
         * @return builder
         * 
         */
        public Builder versionTime(@Nullable Output<String> versionTime) {
            $.versionTime = versionTime;
            return this;
        }

        /**
         * @param versionTime The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
         * 
         * @return builder
         * 
         */
        public Builder versionTime(String versionTime) {
            return versionTime(Output.of(versionTime));
        }

        public BackupArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.encryptionConfigEncryptionType = Objects.requireNonNull($.encryptionConfigEncryptionType, "expected parameter 'encryptionConfigEncryptionType' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}