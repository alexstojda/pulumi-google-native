// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.recaptchaenterprise.v1.KeyArgs;
import com.pulumi.googlenative.recaptchaenterprise.v1.outputs.GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse;
import com.pulumi.googlenative.recaptchaenterprise.v1.outputs.GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse;
import com.pulumi.googlenative.recaptchaenterprise.v1.outputs.GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse;
import com.pulumi.googlenative.recaptchaenterprise.v1.outputs.GoogleCloudRecaptchaenterpriseV1WafSettingsResponse;
import com.pulumi.googlenative.recaptchaenterprise.v1.outputs.GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new reCAPTCHA Enterprise key.
 * 
 */
@ResourceType(type="google-native:recaptchaenterprise/v1:Key")
public class Key extends com.pulumi.resources.CustomResource {
    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @Export(name="androidSettings", type=GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> androidSettings;

    /**
     * @return Settings for keys that can be used by Android apps.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse> androidSettings() {
        return this.androidSettings;
    }
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp corresponding to the creation of this Key.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable display name of this key. Modifiable by user.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @Export(name="iosSettings", type=GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> iosSettings;

    /**
     * @return Settings for keys that can be used by iOS apps.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse> iosSettings() {
        return this.iosSettings;
    }
    /**
     * See Creating and managing labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return See Creating and managing labels.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name for the Key in the format &#34;projects/{project}/keys/{key}&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Key in the format &#34;projects/{project}/keys/{key}&#34;.
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
     * Options for user acceptance testing.
     * 
     */
    @Export(name="testingOptions", type=GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> testingOptions;

    /**
     * @return Options for user acceptance testing.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1TestingOptionsResponse> testingOptions() {
        return this.testingOptions;
    }
    /**
     * Settings for WAF
     * 
     */
    @Export(name="wafSettings", type=GoogleCloudRecaptchaenterpriseV1WafSettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> wafSettings;

    /**
     * @return Settings for WAF
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsResponse> wafSettings() {
        return this.wafSettings;
    }
    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @Export(name="webSettings", type=GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse.class, parameters={})
    private Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> webSettings;

    /**
     * @return Settings for keys that can be used by websites.
     * 
     */
    public Output<GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse> webSettings() {
        return this.webSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, @Nullable KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, @Nullable KeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recaptchaenterprise/v1:Key", name, null, makeResourceOptions(options, id));
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
    public static Key get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}