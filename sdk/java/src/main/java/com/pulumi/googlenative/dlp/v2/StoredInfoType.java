// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dlp.v2.StoredInfoTypeArgs;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2StoredInfoTypeVersionResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dlp/v2:StoredInfoType")
public class StoredInfoType extends com.pulumi.resources.CustomResource {
    /**
     * Current version of the stored info type.
     * 
     */
    @Export(name="currentVersion", type=GooglePrivacyDlpV2StoredInfoTypeVersionResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2StoredInfoTypeVersionResponse> currentVersion;

    /**
     * @return Current version of the stored info type.
     * 
     */
    public Output<GooglePrivacyDlpV2StoredInfoTypeVersionResponse> currentVersion() {
        return this.currentVersion;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pending versions of the stored info type. Empty if no versions are pending.
     * 
     */
    @Export(name="pendingVersions", type=List.class, parameters={GooglePrivacyDlpV2StoredInfoTypeVersionResponse.class})
    private Output<List<GooglePrivacyDlpV2StoredInfoTypeVersionResponse>> pendingVersions;

    /**
     * @return Pending versions of the stored info type. Empty if no versions are pending.
     * 
     */
    public Output<List<GooglePrivacyDlpV2StoredInfoTypeVersionResponse>> pendingVersions() {
        return this.pendingVersions;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StoredInfoType(String name) {
        this(name, StoredInfoTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StoredInfoType(String name, StoredInfoTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StoredInfoType(String name, StoredInfoTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:StoredInfoType", name, args == null ? StoredInfoTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StoredInfoType(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:StoredInfoType", name, null, makeResourceOptions(options, id));
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
    public static StoredInfoType get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StoredInfoType(name, id, options);
    }
}