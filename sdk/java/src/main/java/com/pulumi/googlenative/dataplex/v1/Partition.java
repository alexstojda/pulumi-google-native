// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataplex.v1.PartitionArgs;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Create a metadata partition.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataplex/v1:Partition")
public class Partition extends com.pulumi.resources.CustomResource {
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * Optional. The etag for this partition.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Optional. The etag for this partition.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="lakeId", type=String.class, parameters={})
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Partition values used in the HTTP URL must be double encoded. For example, url_encode(url_encode(value)) can be used to encode &#34;US:CA/CA#Sunnyvale so that the request URL ends with &#34;/partitions/US%253ACA/CA%2523Sunnyvale&#34;. The name field in the response retains the encoded format.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Partition values used in the HTTP URL must be double encoded. For example, url_encode(url_encode(value)) can be used to encode &#34;US:CA/CA#Sunnyvale so that the request URL ends with &#34;/partitions/US%253ACA/CA%2523Sunnyvale&#34;. The name field in the response retains the encoded format.
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
     * Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
    }
    /**
     * Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    @Export(name="values", type=List.class, parameters={String.class})
    private Output<List<String>> values;

    /**
     * @return Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Partition(String name) {
        this(name, PartitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Partition(String name, PartitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Partition(String name, PartitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataplex/v1:Partition", name, args == null ? PartitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Partition(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataplex/v1:Partition", name, null, makeResourceOptions(options, id));
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
    public static Partition get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Partition(name, id, options);
    }
}