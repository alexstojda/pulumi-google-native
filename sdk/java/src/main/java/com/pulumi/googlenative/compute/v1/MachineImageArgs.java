// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.inputs.CustomerEncryptionKeyArgs;
import com.pulumi.googlenative.compute.v1.inputs.SavedDiskArgs;
import com.pulumi.googlenative.compute.v1.inputs.SourceDiskEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineImageArgs Empty = new MachineImageArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process.
     * 
     */
    @Import(name="guestFlush")
    private @Nullable Output<Boolean> guestFlush;

    /**
     * @return [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process.
     * 
     */
    public Optional<Output<Boolean>> guestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }

    /**
     * Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    @Import(name="machineImageEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey;

    /**
     * @return Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> machineImageEncryptionKey() {
        return Optional.ofNullable(this.machineImageEncryptionKey);
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    @Import(name="savedDisks")
    private @Nullable Output<List<SavedDiskArgs>> savedDisks;

    /**
     * @return An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    public Optional<Output<List<SavedDiskArgs>>> savedDisks() {
        return Optional.ofNullable(this.savedDisks);
    }

    /**
     * [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="sourceDiskEncryptionKeys")
    private @Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys;

    /**
     * @return [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Optional<Output<List<SourceDiskEncryptionKeyArgs>>> sourceDiskEncryptionKeys() {
        return Optional.ofNullable(this.sourceDiskEncryptionKeys);
    }

    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Import(name="sourceInstance", required=true)
    private Output<String> sourceInstance;

    /**
     * @return The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    public Output<String> sourceInstance() {
        return this.sourceInstance;
    }

    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    /**
     * @return The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    private MachineImageArgs() {}

    private MachineImageArgs(MachineImageArgs $) {
        this.description = $.description;
        this.guestFlush = $.guestFlush;
        this.machineImageEncryptionKey = $.machineImageEncryptionKey;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.savedDisks = $.savedDisks;
        this.sourceDiskEncryptionKeys = $.sourceDiskEncryptionKeys;
        this.sourceInstance = $.sourceInstance;
        this.storageLocations = $.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineImageArgs $;

        public Builder() {
            $ = new MachineImageArgs();
        }

        public Builder(MachineImageArgs defaults) {
            $ = new MachineImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param guestFlush [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process.
         * 
         * @return builder
         * 
         */
        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            $.guestFlush = guestFlush;
            return this;
        }

        /**
         * @param guestFlush [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process.
         * 
         * @return builder
         * 
         */
        public Builder guestFlush(Boolean guestFlush) {
            return guestFlush(Output.of(guestFlush));
        }

        /**
         * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
         * 
         * @return builder
         * 
         */
        public Builder machineImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> machineImageEncryptionKey) {
            $.machineImageEncryptionKey = machineImageEncryptionKey;
            return this;
        }

        /**
         * @param machineImageEncryptionKey Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
         * 
         * @return builder
         * 
         */
        public Builder machineImageEncryptionKey(CustomerEncryptionKeyArgs machineImageEncryptionKey) {
            return machineImageEncryptionKey(Output.of(machineImageEncryptionKey));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param savedDisks An array of Machine Image specific properties for disks attached to the source instance
         * 
         * @return builder
         * 
         */
        public Builder savedDisks(@Nullable Output<List<SavedDiskArgs>> savedDisks) {
            $.savedDisks = savedDisks;
            return this;
        }

        /**
         * @param savedDisks An array of Machine Image specific properties for disks attached to the source instance
         * 
         * @return builder
         * 
         */
        public Builder savedDisks(List<SavedDiskArgs> savedDisks) {
            return savedDisks(Output.of(savedDisks));
        }

        /**
         * @param savedDisks An array of Machine Image specific properties for disks attached to the source instance
         * 
         * @return builder
         * 
         */
        public Builder savedDisks(SavedDiskArgs... savedDisks) {
            return savedDisks(List.of(savedDisks));
        }

        /**
         * @param sourceDiskEncryptionKeys [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKeys(@Nullable Output<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys) {
            $.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
            return this;
        }

        /**
         * @param sourceDiskEncryptionKeys [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKeys(List<SourceDiskEncryptionKeyArgs> sourceDiskEncryptionKeys) {
            return sourceDiskEncryptionKeys(Output.of(sourceDiskEncryptionKeys));
        }

        /**
         * @param sourceDiskEncryptionKeys [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKeys(SourceDiskEncryptionKeyArgs... sourceDiskEncryptionKeys) {
            return sourceDiskEncryptionKeys(List.of(sourceDiskEncryptionKeys));
        }

        /**
         * @param sourceInstance The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        /**
         * @param sourceInstance The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        /**
         * @param storageLocations The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        public MachineImageArgs build() {
            $.sourceInstance = Objects.requireNonNull($.sourceInstance, "expected parameter 'sourceInstance' to be non-null");
            return $;
        }
    }

}