// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GoogleCloudOrgpolicyV2AlternatePolicySpecArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GoogleCloudOrgpolicyV2PolicySpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderPolicyArgs Empty = new FolderPolicyArgs();

    /**
     * Deprecated.
     * 
     * @deprecated
     * Deprecated.
     * 
     */
    @Deprecated /* Deprecated. */
    @Import(name="alternate")
    private @Nullable Output<GoogleCloudOrgpolicyV2AlternatePolicySpecArgs> alternate;

    /**
     * @return Deprecated.
     * 
     * @deprecated
     * Deprecated.
     * 
     */
    @Deprecated /* Deprecated. */
    public Optional<Output<GoogleCloudOrgpolicyV2AlternatePolicySpecArgs>> alternate() {
        return Optional.ofNullable(this.alternate);
    }

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, &#34;projects/123/policies/compute.disableSerialPortAccess&#34;. Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, &#34;projects/123/policies/compute.disableSerialPortAccess&#34;. Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Basic information about the Organization Policy.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

    /**
     * @return Basic information about the Organization Policy.
     * 
     */
    public Optional<Output<GoogleCloudOrgpolicyV2PolicySpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private FolderPolicyArgs() {}

    private FolderPolicyArgs(FolderPolicyArgs $) {
        this.alternate = $.alternate;
        this.folderId = $.folderId;
        this.name = $.name;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderPolicyArgs $;

        public Builder() {
            $ = new FolderPolicyArgs();
        }

        public Builder(FolderPolicyArgs defaults) {
            $ = new FolderPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternate Deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated.
         * 
         */
        @Deprecated /* Deprecated. */
        public Builder alternate(@Nullable Output<GoogleCloudOrgpolicyV2AlternatePolicySpecArgs> alternate) {
            $.alternate = alternate;
            return this;
        }

        /**
         * @param alternate Deprecated.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated.
         * 
         */
        @Deprecated /* Deprecated. */
        public Builder alternate(GoogleCloudOrgpolicyV2AlternatePolicySpecArgs alternate) {
            return alternate(Output.of(alternate));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param name Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, &#34;projects/123/policies/compute.disableSerialPortAccess&#34;. Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, &#34;projects/123/policies/compute.disableSerialPortAccess&#34;. Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param spec Basic information about the Organization Policy.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Basic information about the Organization Policy.
         * 
         * @return builder
         * 
         */
        public Builder spec(GoogleCloudOrgpolicyV2PolicySpecArgs spec) {
            return spec(Output.of(spec));
        }

        public FolderPolicyArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}