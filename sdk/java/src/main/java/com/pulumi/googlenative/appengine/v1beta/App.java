// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.appengine.v1beta.AppArgs;
import com.pulumi.googlenative.appengine.v1beta.outputs.FeatureSettingsResponse;
import com.pulumi.googlenative.appengine.v1beta.outputs.IdentityAwareProxyResponse;
import com.pulumi.googlenative.appengine.v1beta.outputs.UrlDispatchRuleResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an App Engine application for a Google Cloud Platform project. Required fields: id - The ID of the target Cloud Platform project. location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/standard/python/console/).
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:appengine/v1beta:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
     */
    @Export(name="authDomain", type=String.class, parameters={})
    private Output<String> authDomain;

    /**
     * @return Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
     */
    public Output<String> authDomain() {
        return this.authDomain;
    }
    /**
     * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.
     * 
     */
    @Export(name="codeBucket", type=String.class, parameters={})
    private Output<String> codeBucket;

    /**
     * @return Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.
     * 
     */
    public Output<String> codeBucket() {
        return this.codeBucket;
    }
    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    @Export(name="databaseType", type=String.class, parameters={})
    private Output<String> databaseType;

    /**
     * @return The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    public Output<String> databaseType() {
        return this.databaseType;
    }
    /**
     * Google Cloud Storage bucket that can be used by this application to store content.
     * 
     */
    @Export(name="defaultBucket", type=String.class, parameters={})
    private Output<String> defaultBucket;

    /**
     * @return Google Cloud Storage bucket that can be used by this application to store content.
     * 
     */
    public Output<String> defaultBucket() {
        return this.defaultBucket;
    }
    /**
     * Cookie expiration policy for this application.
     * 
     */
    @Export(name="defaultCookieExpiration", type=String.class, parameters={})
    private Output<String> defaultCookieExpiration;

    /**
     * @return Cookie expiration policy for this application.
     * 
     */
    public Output<String> defaultCookieExpiration() {
        return this.defaultCookieExpiration;
    }
    /**
     * Hostname used to reach this application, as resolved by App Engine.
     * 
     */
    @Export(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return Hostname used to reach this application, as resolved by App Engine.
     * 
     */
    public Output<String> defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
     */
    @Export(name="dispatchRules", type=List.class, parameters={UrlDispatchRuleResponse.class})
    private Output<List<UrlDispatchRuleResponse>> dispatchRules;

    /**
     * @return HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
     */
    public Output<List<UrlDispatchRuleResponse>> dispatchRules() {
        return this.dispatchRules;
    }
    /**
     * The feature specific settings to be used in the application.
     * 
     */
    @Export(name="featureSettings", type=FeatureSettingsResponse.class, parameters={})
    private Output<FeatureSettingsResponse> featureSettings;

    /**
     * @return The feature specific settings to be used in the application.
     * 
     */
    public Output<FeatureSettingsResponse> featureSettings() {
        return this.featureSettings;
    }
    /**
     * The Google Container Registry domain used for storing managed build docker images for this application.
     * 
     */
    @Export(name="gcrDomain", type=String.class, parameters={})
    private Output<String> gcrDomain;

    /**
     * @return The Google Container Registry domain used for storing managed build docker images for this application.
     * 
     */
    public Output<String> gcrDomain() {
        return this.gcrDomain;
    }
    @Export(name="iap", type=IdentityAwareProxyResponse.class, parameters={})
    private Output<IdentityAwareProxyResponse> iap;

    public Output<IdentityAwareProxyResponse> iap() {
        return this.iap;
    }
    /**
     * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Full path to the Application resource in the API. Example: apps/myapp.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full path to the Application resource in the API. Example: apps/myapp.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Serving status of this application.
     * 
     */
    @Export(name="servingStatus", type=String.class, parameters={})
    private Output<String> servingStatus;

    /**
     * @return Serving status of this application.
     * 
     */
    public Output<String> servingStatus() {
        return this.servingStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, @Nullable AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, @Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1beta:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1beta:App", name, null, makeResourceOptions(options, id));
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
    public static App get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}