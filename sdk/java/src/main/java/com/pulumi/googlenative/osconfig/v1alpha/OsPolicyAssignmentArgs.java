// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyAssignmentInstanceFilterArgs;
import com.pulumi.googlenative.osconfig.v1alpha.inputs.OSPolicyAssignmentRolloutArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentArgs Empty = new OsPolicyAssignmentArgs();

    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Filter to select VMs.
     * 
     */
    @Import(name="instanceFilter", required=true)
    private Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter;

    /**
     * @return Filter to select VMs.
     * 
     */
    public Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter() {
        return this.instanceFilter;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of OS policies to be applied to the VMs.
     * 
     */
    @Import(name="osPolicies", required=true)
    private Output<List<OSPolicyArgs>> osPolicies;

    /**
     * @return List of OS policies to be applied to the VMs.
     * 
     */
    public Output<List<OSPolicyArgs>> osPolicies() {
        return this.osPolicies;
    }

    /**
     * Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    @Import(name="osPolicyAssignmentId", required=true)
    private Output<String> osPolicyAssignmentId;

    /**
     * @return Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    public Output<String> osPolicyAssignmentId() {
        return this.osPolicyAssignmentId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    @Import(name="rollout", required=true)
    private Output<OSPolicyAssignmentRolloutArgs> rollout;

    /**
     * @return Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    public Output<OSPolicyAssignmentRolloutArgs> rollout() {
        return this.rollout;
    }

    private OsPolicyAssignmentArgs() {}

    private OsPolicyAssignmentArgs(OsPolicyAssignmentArgs $) {
        this.description = $.description;
        this.etag = $.etag;
        this.instanceFilter = $.instanceFilter;
        this.location = $.location;
        this.name = $.name;
        this.osPolicies = $.osPolicies;
        this.osPolicyAssignmentId = $.osPolicyAssignmentId;
        this.project = $.project;
        this.rollout = $.rollout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentArgs();
        }

        public Builder(OsPolicyAssignmentArgs defaults) {
            $ = new OsPolicyAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description OS policy assignment description. Length of the description is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description OS policy assignment description. Length of the description is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The etag for this OS policy assignment. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param instanceFilter Filter to select VMs.
         * 
         * @return builder
         * 
         */
        public Builder instanceFilter(Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter) {
            $.instanceFilter = instanceFilter;
            return this;
        }

        /**
         * @param instanceFilter Filter to select VMs.
         * 
         * @return builder
         * 
         */
        public Builder instanceFilter(OSPolicyAssignmentInstanceFilterArgs instanceFilter) {
            return instanceFilter(Output.of(instanceFilter));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osPolicies List of OS policies to be applied to the VMs.
         * 
         * @return builder
         * 
         */
        public Builder osPolicies(Output<List<OSPolicyArgs>> osPolicies) {
            $.osPolicies = osPolicies;
            return this;
        }

        /**
         * @param osPolicies List of OS policies to be applied to the VMs.
         * 
         * @return builder
         * 
         */
        public Builder osPolicies(List<OSPolicyArgs> osPolicies) {
            return osPolicies(Output.of(osPolicies));
        }

        /**
         * @param osPolicies List of OS policies to be applied to the VMs.
         * 
         * @return builder
         * 
         */
        public Builder osPolicies(OSPolicyArgs... osPolicies) {
            return osPolicies(List.of(osPolicies));
        }

        /**
         * @param osPolicyAssignmentId Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
         * 
         * @return builder
         * 
         */
        public Builder osPolicyAssignmentId(Output<String> osPolicyAssignmentId) {
            $.osPolicyAssignmentId = osPolicyAssignmentId;
            return this;
        }

        /**
         * @param osPolicyAssignmentId Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
         * 
         * @return builder
         * 
         */
        public Builder osPolicyAssignmentId(String osPolicyAssignmentId) {
            return osPolicyAssignmentId(Output.of(osPolicyAssignmentId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rollout Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
         * 
         * @return builder
         * 
         */
        public Builder rollout(Output<OSPolicyAssignmentRolloutArgs> rollout) {
            $.rollout = rollout;
            return this;
        }

        /**
         * @param rollout Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
         * 
         * @return builder
         * 
         */
        public Builder rollout(OSPolicyAssignmentRolloutArgs rollout) {
            return rollout(Output.of(rollout));
        }

        public OsPolicyAssignmentArgs build() {
            $.instanceFilter = Objects.requireNonNull($.instanceFilter, "expected parameter 'instanceFilter' to be non-null");
            $.osPolicies = Objects.requireNonNull($.osPolicies, "expected parameter 'osPolicies' to be non-null");
            $.osPolicyAssignmentId = Objects.requireNonNull($.osPolicyAssignmentId, "expected parameter 'osPolicyAssignmentId' to be non-null");
            $.rollout = Objects.requireNonNull($.rollout, "expected parameter 'rollout' to be non-null");
            return $;
        }
    }

}