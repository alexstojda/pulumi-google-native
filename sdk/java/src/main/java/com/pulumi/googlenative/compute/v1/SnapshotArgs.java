// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.inputs.CustomerEncryptionKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    @Import(name="chainName")
    private @Nullable Output<String> chainName;

    /**
     * @return Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    public Optional<Output<String>> chainName() {
        return Optional.ofNullable(this.chainName);
    }

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
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint")
    private @Nullable Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public Optional<Output<String>> locationHint() {
        return Optional.ofNullable(this.locationHint);
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
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    @Import(name="snapshotEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey;

    /**
     * @return Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> snapshotEncryptionKey() {
        return Optional.ofNullable(this.snapshotEncryptionKey);
    }

    /**
     * The source disk used to create this snapshot.
     * 
     */
    @Import(name="sourceDisk")
    private @Nullable Output<String> sourceDisk;

    /**
     * @return The source disk used to create this snapshot.
     * 
     */
    public Optional<Output<String>> sourceDisk() {
        return Optional.ofNullable(this.sourceDisk);
    }

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="sourceDiskEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> sourceDiskEncryptionKey() {
        return Optional.ofNullable(this.sourceDiskEncryptionKey);
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.chainName = $.chainName;
        this.description = $.description;
        this.labels = $.labels;
        this.locationHint = $.locationHint;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.snapshotEncryptionKey = $.snapshotEncryptionKey;
        this.sourceDisk = $.sourceDisk;
        this.sourceDiskEncryptionKey = $.sourceDiskEncryptionKey;
        this.storageLocations = $.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chainName Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
         * 
         * @return builder
         * 
         */
        public Builder chainName(@Nullable Output<String> chainName) {
            $.chainName = chainName;
            return this;
        }

        /**
         * @param chainName Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
         * 
         * @return builder
         * 
         */
        public Builder chainName(String chainName) {
            return chainName(Output.of(chainName));
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
         * @param labels Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param locationHint An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(@Nullable Output<String> locationHint) {
            $.locationHint = locationHint;
            return this;
        }

        /**
         * @param locationHint An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(String locationHint) {
            return locationHint(Output.of(locationHint));
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
         * @param snapshotEncryptionKey Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> snapshotEncryptionKey) {
            $.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        /**
         * @param snapshotEncryptionKey Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(CustomerEncryptionKeyArgs snapshotEncryptionKey) {
            return snapshotEncryptionKey(Output.of(snapshotEncryptionKey));
        }

        /**
         * @param sourceDisk The source disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param sourceDisk The source disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            return sourceDisk(Output.of(sourceDisk));
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey) {
            $.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(CustomerEncryptionKeyArgs sourceDiskEncryptionKey) {
            return sourceDiskEncryptionKey(Output.of(sourceDiskEncryptionKey));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        public SnapshotArgs build() {
            return $;
        }
    }

}