// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage.v1.BucketAccessControlArgs;
import com.pulumi.googlenative.storage.v1.outputs.BucketAccessControlProjectTeamResponse;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new ACL entry on the specified bucket.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:storage/v1:BucketAccessControl")
public class BucketAccessControl extends com.pulumi.resources.CustomResource {
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain associated with the entity, if any.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address associated with the entity, if any.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    public Output<String> entity() {
        return this.entity;
    }
    /**
     * The ID for the entity, if any.
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return The ID for the entity, if any.
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Export(name="projectTeam", type=BucketAccessControlProjectTeamResponse.class, parameters={})
    private Output<BucketAccessControlProjectTeamResponse> projectTeam;

    /**
     * @return The project team associated with the entity, if any.
     * 
     */
    public Output<BucketAccessControlProjectTeamResponse> projectTeam() {
        return this.projectTeam;
    }
    /**
     * The access permission for the entity.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The link to this access-control entry.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The link to this access-control entry.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    @Export(name="userProject", type=String.class, parameters={})
    private Output</* @Nullable */ String> userProject;

    /**
     * @return The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    public Output<Optional<String>> userProject() {
        return Codegen.optional(this.userProject);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketAccessControl(String name) {
        this(name, BucketAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketAccessControl", name, args == null ? BucketAccessControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketAccessControl(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketAccessControl", name, null, makeResourceOptions(options, id));
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
    public static BucketAccessControl get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketAccessControl(name, id, options);
    }
}