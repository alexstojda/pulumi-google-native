// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudkms.v1.ImportJobArgs;
import com.pulumi.googlenative.cloudkms.v1.outputs.KeyOperationAttestationResponse;
import com.pulumi.googlenative.cloudkms.v1.outputs.WrappingPublicKeyResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a new ImportJob within a KeyRing. ImportJob.import_method is required.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudkms/v1:ImportJob")
public class ImportJob extends com.pulumi.resources.CustomResource {
    /**
     * Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    @Export(name="attestation", type=KeyOperationAttestationResponse.class, parameters={})
    private Output<KeyOperationAttestationResponse> attestation;

    /**
     * @return Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    public Output<KeyOperationAttestationResponse> attestation() {
        return this.attestation;
    }
    /**
     * The time at which this ImportJob was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this ImportJob was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    @Export(name="expireEventTime", type=String.class, parameters={})
    private Output<String> expireEventTime;

    /**
     * @return The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    public Output<String> expireEventTime() {
        return this.expireEventTime;
    }
    /**
     * The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * The time this ImportJob&#39;s key material was generated.
     * 
     */
    @Export(name="generateTime", type=String.class, parameters={})
    private Output<String> generateTime;

    /**
     * @return The time this ImportJob&#39;s key material was generated.
     * 
     */
    public Output<String> generateTime() {
        return this.generateTime;
    }
    /**
     * Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    @Export(name="importJobId", type=String.class, parameters={})
    private Output<String> importJobId;

    /**
     * @return Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    public Output<String> importJobId() {
        return this.importJobId;
    }
    /**
     * Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    @Export(name="importMethod", type=String.class, parameters={})
    private Output<String> importMethod;

    /**
     * @return Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    public Output<String> importMethod() {
        return this.importMethod;
    }
    @Export(name="keyRingId", type=String.class, parameters={})
    private Output<String> keyRingId;

    public Output<String> keyRingId() {
        return this.keyRingId;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    @Export(name="protectionLevel", type=String.class, parameters={})
    private Output<String> protectionLevel;

    /**
     * @return Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    public Output<String> protectionLevel() {
        return this.protectionLevel;
    }
    /**
     * The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    @Export(name="publicKey", type=WrappingPublicKeyResponse.class, parameters={})
    private Output<WrappingPublicKeyResponse> publicKey;

    /**
     * @return The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    public Output<WrappingPublicKeyResponse> publicKey() {
        return this.publicKey;
    }
    /**
     * The current state of the ImportJob, indicating if it can be used.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the ImportJob, indicating if it can be used.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImportJob(String name) {
        this(name, ImportJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImportJob(String name, ImportJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImportJob(String name, ImportJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:ImportJob", name, args == null ? ImportJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImportJob(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:ImportJob", name, null, makeResourceOptions(options, id));
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
    public static ImportJob get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImportJob(name, id, options);
    }
}