// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.sqladmin.v1beta4.DatabaseArgs;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.SqlServerDatabaseDetailsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Inserts a resource containing information about a database inside a Cloud SQL instance.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1beta4:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * The Cloud SQL charset value.
     * 
     */
    @Export(name="charset", type=String.class, parameters={})
    private Output<String> charset;

    /**
     * @return The Cloud SQL charset value.
     * 
     */
    public Output<String> charset() {
        return this.charset;
    }
    /**
     * The Cloud SQL collation value.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output<String> collation;

    /**
     * @return The Cloud SQL collation value.
     * 
     */
    public Output<String> collation() {
        return this.collation;
    }
    /**
     * This field is deprecated and will be removed from a future version of the API.
     * 
     * @deprecated
     * This field is deprecated and will be removed from a future version of the API.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed from a future version of the API. */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return This field is deprecated and will be removed from a future version of the API.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    public Output<String> instance() {
        return this.instance;
    }
    /**
     * This is always `sql#database`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#database`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
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
     * The URI of this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    @Export(name="sqlserverDatabaseDetails", type=SqlServerDatabaseDetailsResponse.class, parameters={})
    private Output<SqlServerDatabaseDetailsResponse> sqlserverDatabaseDetails;

    public Output<SqlServerDatabaseDetailsResponse> sqlserverDatabaseDetails() {
        return this.sqlserverDatabaseDetails;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:Database", name, null, makeResourceOptions(options, id));
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
    public static Database get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}