// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.logging.v2.FolderBucketViewArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:logging/v2:FolderBucketView")
public class FolderBucketView extends com.pulumi.resources.CustomResource {
    @Export(name="bucketId", type=String.class, parameters={})
    private Output<String> bucketId;

    public Output<String> bucketId() {
        return this.bucketId;
    }
    /**
     * The creation timestamp of the view.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the view.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Describes this view.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Describes this view.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE(&#34;projects/myproject&#34;) AND resource.type = &#34;gce_instance&#34; AND LOG_ID(&#34;stdout&#34;)
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE(&#34;projects/myproject&#34;) AND resource.type = &#34;gce_instance&#34; AND LOG_ID(&#34;stdout&#34;)
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    @Export(name="folderId", type=String.class, parameters={})
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The last update timestamp of the view.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of the view.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Required. The id to use for this view.
     * 
     */
    @Export(name="viewId", type=String.class, parameters={})
    private Output<String> viewId;

    /**
     * @return Required. The id to use for this view.
     * 
     */
    public Output<String> viewId() {
        return this.viewId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FolderBucketView(String name) {
        this(name, FolderBucketViewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FolderBucketView(String name, FolderBucketViewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FolderBucketView(String name, FolderBucketViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:FolderBucketView", name, args == null ? FolderBucketViewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FolderBucketView(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:FolderBucketView", name, null, makeResourceOptions(options, id));
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
    public static FolderBucketView get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FolderBucketView(name, id, options);
    }
}