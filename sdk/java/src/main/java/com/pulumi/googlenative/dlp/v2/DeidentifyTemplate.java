// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dlp.v2.DeidentifyTemplateArgs;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2DeidentifyConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a DeidentifyTemplate for re-using frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dlp/v2:DeidentifyTemplate")
public class DeidentifyTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The creation timestamp of an inspectTemplate.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of an inspectTemplate.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The core content of the template.
     * 
     */
    @Export(name="deidentifyConfig", type=GooglePrivacyDlpV2DeidentifyConfigResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2DeidentifyConfigResponse> deidentifyConfig;

    /**
     * @return The core content of the template.
     * 
     */
    public Output<GooglePrivacyDlpV2DeidentifyConfigResponse> deidentifyConfig() {
        return this.deidentifyConfig;
    }
    /**
     * Short description (max 256 chars).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Short description (max 256 chars).
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Display name (max 256 chars).
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name (max 256 chars).
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The template name. The template will have one of the following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
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
     * The last update timestamp of an inspectTemplate.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of an inspectTemplate.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeidentifyTemplate(String name) {
        this(name, DeidentifyTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeidentifyTemplate(String name, @Nullable DeidentifyTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeidentifyTemplate(String name, @Nullable DeidentifyTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:DeidentifyTemplate", name, args == null ? DeidentifyTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeidentifyTemplate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:DeidentifyTemplate", name, null, makeResourceOptions(options, id));
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
    public static DeidentifyTemplate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeidentifyTemplate(name, id, options);
    }
}