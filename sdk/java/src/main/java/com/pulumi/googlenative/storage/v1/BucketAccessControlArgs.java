// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage.v1.inputs.BucketAccessControlProjectTeamArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlArgs Empty = new BucketAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain associated with the entity, if any.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address associated with the entity, if any.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
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
    @Import(name="entity")
    private @Nullable Output<String> entity;

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
    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The ID for the entity, if any.
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    /**
     * @return The ID for the entity, if any.
     * 
     */
    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The ID of the access-control entry.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the access-control entry.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Import(name="projectTeam")
    private @Nullable Output<BucketAccessControlProjectTeamArgs> projectTeam;

    /**
     * @return The project team associated with the entity, if any.
     * 
     */
    public Optional<Output<BucketAccessControlProjectTeamArgs>> projectTeam() {
        return Optional.ofNullable(this.projectTeam);
    }

    /**
     * The access permission for the entity.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The access permission for the entity.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The link to this access-control entry.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The link to this access-control entry.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    @Import(name="userProject")
    private @Nullable Output<String> userProject;

    /**
     * @return The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    public Optional<Output<String>> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private BucketAccessControlArgs() {}

    private BucketAccessControlArgs(BucketAccessControlArgs $) {
        this.bucket = $.bucket;
        this.domain = $.domain;
        this.email = $.email;
        this.entity = $.entity;
        this.entityId = $.entityId;
        this.etag = $.etag;
        this.id = $.id;
        this.kind = $.kind;
        this.projectTeam = $.projectTeam;
        this.role = $.role;
        this.selfLink = $.selfLink;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccessControlArgs $;

        public Builder() {
            $ = new BucketAccessControlArgs();
        }

        public Builder(BucketAccessControlArgs defaults) {
            $ = new BucketAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param domain The domain associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param email The email address associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
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
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
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
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param entityId The ID for the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId The ID for the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param etag HTTP 1.1 Entity tag for the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag HTTP 1.1 Entity tag for the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param id The ID of the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kind The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param projectTeam The project team associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder projectTeam(@Nullable Output<BucketAccessControlProjectTeamArgs> projectTeam) {
            $.projectTeam = projectTeam;
            return this;
        }

        /**
         * @param projectTeam The project team associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder projectTeam(BucketAccessControlProjectTeamArgs projectTeam) {
            return projectTeam(Output.of(projectTeam));
        }

        /**
         * @param role The access permission for the entity.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The access permission for the entity.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param selfLink The link to this access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The link to this access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param userProject The project to be billed for this request. Required for Requester Pays buckets.
         * 
         * @return builder
         * 
         */
        public Builder userProject(@Nullable Output<String> userProject) {
            $.userProject = userProject;
            return this;
        }

        /**
         * @param userProject The project to be billed for this request. Required for Requester Pays buckets.
         * 
         * @return builder
         * 
         */
        public Builder userProject(String userProject) {
            return userProject(Output.of(userProject));
        }

        public BucketAccessControlArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}