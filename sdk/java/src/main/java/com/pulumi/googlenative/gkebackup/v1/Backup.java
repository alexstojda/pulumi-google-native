// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gkebackup.v1.BackupArgs;
import com.pulumi.googlenative.gkebackup.v1.outputs.ClusterMetadataResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.EncryptionKeyResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.NamespacedNamesResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.NamespacesResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Backup for the given BackupPlan.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:gkebackup/v1:Backup")
public class Backup extends com.pulumi.resources.CustomResource {
    /**
     * If True, all namespaces were included in the Backup.
     * 
     */
    @Export(name="allNamespaces", type=Boolean.class, parameters={})
    private Output<Boolean> allNamespaces;

    /**
     * @return If True, all namespaces were included in the Backup.
     * 
     */
    public Output<Boolean> allNamespaces() {
        return this.allNamespaces;
    }
    /**
     * The client-provided short name for the Backup resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of Backups in this BackupPlan
     * 
     */
    @Export(name="backupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupId;

    /**
     * @return The client-provided short name for the Backup resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of Backups in this BackupPlan
     * 
     */
    public Output<Optional<String>> backupId() {
        return Codegen.optional(this.backupId);
    }
    @Export(name="backupPlanId", type=String.class, parameters={})
    private Output<String> backupPlanId;

    public Output<String> backupPlanId() {
        return this.backupPlanId;
    }
    /**
     * Information about the GKE cluster from which this Backup was created.
     * 
     */
    @Export(name="clusterMetadata", type=ClusterMetadataResponse.class, parameters={})
    private Output<ClusterMetadataResponse> clusterMetadata;

    /**
     * @return Information about the GKE cluster from which this Backup was created.
     * 
     */
    public Output<ClusterMetadataResponse> clusterMetadata() {
        return this.clusterMetadata;
    }
    /**
     * Completion time of the Backup
     * 
     */
    @Export(name="completeTime", type=String.class, parameters={})
    private Output<String> completeTime;

    /**
     * @return Completion time of the Backup
     * 
     */
    public Output<String> completeTime() {
        return this.completeTime;
    }
    /**
     * The size of the config backup in bytes.
     * 
     */
    @Export(name="configBackupSizeBytes", type=String.class, parameters={})
    private Output<String> configBackupSizeBytes;

    /**
     * @return The size of the config backup in bytes.
     * 
     */
    public Output<String> configBackupSizeBytes() {
        return this.configBackupSizeBytes;
    }
    /**
     * Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent BackupPlan&#39;s include_secrets value.
     * 
     */
    @Export(name="containsSecrets", type=Boolean.class, parameters={})
    private Output<Boolean> containsSecrets;

    /**
     * @return Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent BackupPlan&#39;s include_secrets value.
     * 
     */
    public Output<Boolean> containsSecrets() {
        return this.containsSecrets;
    }
    /**
     * Whether or not the Backup contains volume data. Controlled by the parent BackupPlan&#39;s include_volume_data value.
     * 
     */
    @Export(name="containsVolumeData", type=Boolean.class, parameters={})
    private Output<Boolean> containsVolumeData;

    /**
     * @return Whether or not the Backup contains volume data. Controlled by the parent BackupPlan&#39;s include_volume_data value.
     * 
     */
    public Output<Boolean> containsVolumeData() {
        return this.containsVolumeData;
    }
    /**
     * The timestamp when this Backup resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when this Backup resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Minimum age for this Backup (in days). If this field is set to a non-zero value, the Backup will be &#34;locked&#34; against deletion (either manual or automatic deletion) for the number of days provided (measured from the creation time of the Backup). MUST be an integer value between 0-90 (inclusive). Defaults to parent BackupPlan&#39;s backup_delete_lock_days setting and may only be increased (either at creation time or in a subsequent update).
     * 
     */
    @Export(name="deleteLockDays", type=Integer.class, parameters={})
    private Output<Integer> deleteLockDays;

    /**
     * @return Minimum age for this Backup (in days). If this field is set to a non-zero value, the Backup will be &#34;locked&#34; against deletion (either manual or automatic deletion) for the number of days provided (measured from the creation time of the Backup). MUST be an integer value between 0-90 (inclusive). Defaults to parent BackupPlan&#39;s backup_delete_lock_days setting and may only be increased (either at creation time or in a subsequent update).
     * 
     */
    public Output<Integer> deleteLockDays() {
        return this.deleteLockDays;
    }
    /**
     * The time at which an existing delete lock will expire for this backup (calculated from create_time + delete_lock_days).
     * 
     */
    @Export(name="deleteLockExpireTime", type=String.class, parameters={})
    private Output<String> deleteLockExpireTime;

    /**
     * @return The time at which an existing delete lock will expire for this backup (calculated from create_time + delete_lock_days).
     * 
     */
    public Output<String> deleteLockExpireTime() {
        return this.deleteLockExpireTime;
    }
    /**
     * User specified descriptive string for this Backup.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User specified descriptive string for this Backup.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The customer managed encryption key that was used to encrypt the Backup&#39;s artifacts. Inherited from the parent BackupPlan&#39;s encryption_key value.
     * 
     */
    @Export(name="encryptionKey", type=EncryptionKeyResponse.class, parameters={})
    private Output<EncryptionKeyResponse> encryptionKey;

    /**
     * @return The customer managed encryption key that was used to encrypt the Backup&#39;s artifacts. Inherited from the parent BackupPlan&#39;s encryption_key value.
     * 
     */
    public Output<EncryptionKeyResponse> encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform backup updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to ensure that their change will be applied to the same version of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform backup updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to ensure that their change will be applied to the same version of the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A set of custom labels supplied by user.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * This flag indicates whether this Backup resource was created manually by a user or via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
     * 
     */
    @Export(name="manual", type=Boolean.class, parameters={})
    private Output<Boolean> manual;

    /**
     * @return This flag indicates whether this Backup resource was created manually by a user or via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
     * 
     */
    public Output<Boolean> manual() {
        return this.manual;
    }
    /**
     * The fully qualified name of the Backup. projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified name of the Backup. projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The total number of Kubernetes Pods contained in the Backup.
     * 
     */
    @Export(name="podCount", type=Integer.class, parameters={})
    private Output<Integer> podCount;

    /**
     * @return The total number of Kubernetes Pods contained in the Backup.
     * 
     */
    public Output<Integer> podCount() {
        return this.podCount;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The total number of Kubernetes resources included in the Backup.
     * 
     */
    @Export(name="resourceCount", type=Integer.class, parameters={})
    private Output<Integer> resourceCount;

    /**
     * @return The total number of Kubernetes resources included in the Backup.
     * 
     */
    public Output<Integer> resourceCount() {
        return this.resourceCount;
    }
    /**
     * The age (in days) after which this Backup will be automatically deleted. Must be an integer value &gt;= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this must be &gt;= delete_lock_days. Once a Backup is created, this value may only be increased. Defaults to the parent BackupPlan&#39;s backup_retain_days value.
     * 
     */
    @Export(name="retainDays", type=Integer.class, parameters={})
    private Output<Integer> retainDays;

    /**
     * @return The age (in days) after which this Backup will be automatically deleted. Must be an integer value &gt;= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this must be &gt;= delete_lock_days. Once a Backup is created, this value may only be increased. Defaults to the parent BackupPlan&#39;s backup_retain_days value.
     * 
     */
    public Output<Integer> retainDays() {
        return this.retainDays;
    }
    /**
     * The time at which this Backup will be automatically deleted (calculated from create_time + retain_days).
     * 
     */
    @Export(name="retainExpireTime", type=String.class, parameters={})
    private Output<String> retainExpireTime;

    /**
     * @return The time at which this Backup will be automatically deleted (calculated from create_time + retain_days).
     * 
     */
    public Output<String> retainExpireTime() {
        return this.retainExpireTime;
    }
    /**
     * If set, the list of ProtectedApplications whose resources were included in the Backup.
     * 
     */
    @Export(name="selectedApplications", type=NamespacedNamesResponse.class, parameters={})
    private Output<NamespacedNamesResponse> selectedApplications;

    /**
     * @return If set, the list of ProtectedApplications whose resources were included in the Backup.
     * 
     */
    public Output<NamespacedNamesResponse> selectedApplications() {
        return this.selectedApplications;
    }
    /**
     * If set, the list of namespaces that were included in the Backup.
     * 
     */
    @Export(name="selectedNamespaces", type=NamespacesResponse.class, parameters={})
    private Output<NamespacesResponse> selectedNamespaces;

    /**
     * @return If set, the list of namespaces that were included in the Backup.
     * 
     */
    public Output<NamespacesResponse> selectedNamespaces() {
        return this.selectedNamespaces;
    }
    /**
     * The total size of the Backup in bytes = config backup size + sum(volume backup sizes)
     * 
     */
    @Export(name="sizeBytes", type=String.class, parameters={})
    private Output<String> sizeBytes;

    /**
     * @return The total size of the Backup in bytes = config backup size + sum(volume backup sizes)
     * 
     */
    public Output<String> sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * Current state of the Backup
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the Backup
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Human-readable description of why the backup is in the current `state`.
     * 
     */
    @Export(name="stateReason", type=String.class, parameters={})
    private Output<String> stateReason;

    /**
     * @return Human-readable description of why the backup is in the current `state`.
     * 
     */
    public Output<String> stateReason() {
        return this.stateReason;
    }
    /**
     * Server generated global unique identifier of [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Server generated global unique identifier of [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The timestamp when this Backup resource was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when this Backup resource was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The total number of volume backups contained in the Backup.
     * 
     */
    @Export(name="volumeCount", type=Integer.class, parameters={})
    private Output<Integer> volumeCount;

    /**
     * @return The total number of volume backups contained in the Backup.
     * 
     */
    public Output<Integer> volumeCount() {
        return this.volumeCount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backup(String name) {
        this(name, BackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backup(String name, BackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backup(String name, BackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkebackup/v1:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Backup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkebackup/v1:Backup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Backup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Backup(name, id, options);
    }
}