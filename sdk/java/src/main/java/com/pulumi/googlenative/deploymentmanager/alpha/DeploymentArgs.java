// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager.alpha.inputs.CredentialArgs;
import com.pulumi.googlenative.deploymentmanager.alpha.inputs.DeploymentLabelEntryArgs;
import com.pulumi.googlenative.deploymentmanager.alpha.inputs.TargetConfigurationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Sets the policy to use for creating new resources.
     * 
     */
    @Import(name="createPolicy")
    private @Nullable Output<String> createPolicy;

    /**
     * @return Sets the policy to use for creating new resources.
     * 
     */
    public Optional<Output<String>> createPolicy() {
        return Optional.ofNullable(this.createPolicy);
    }

    /**
     * User provided default credential for the deployment.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialArgs> credential;

    /**
     * @return User provided default credential for the deployment.
     * 
     */
    public Optional<Output<CredentialArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * An optional user-provided description of the deployment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional user-provided description of the deployment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<DeploymentLabelEntryArgs>> labels;

    /**
     * @return Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    public Optional<Output<List<DeploymentLabelEntryArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If set to true, creates a deployment and creates &#34;shell&#34; resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the `update()` method or you can use the `cancelPreview()` method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
     * 
     */
    @Import(name="preview")
    private @Nullable Output<String> preview;

    /**
     * @return If set to true, creates a deployment and creates &#34;shell&#34; resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the `update()` method or you can use the `cancelPreview()` method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
     * 
     */
    public Optional<Output<String>> preview() {
        return Optional.ofNullable(this.preview);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    @Import(name="target")
    private @Nullable Output<TargetConfigurationArgs> target;

    /**
     * @return [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    public Optional<Output<TargetConfigurationArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.createPolicy = $.createPolicy;
        this.credential = $.credential;
        this.description = $.description;
        this.id = $.id;
        this.labels = $.labels;
        this.name = $.name;
        this.preview = $.preview;
        this.project = $.project;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createPolicy Sets the policy to use for creating new resources.
         * 
         * @return builder
         * 
         */
        public Builder createPolicy(@Nullable Output<String> createPolicy) {
            $.createPolicy = createPolicy;
            return this;
        }

        /**
         * @param createPolicy Sets the policy to use for creating new resources.
         * 
         * @return builder
         * 
         */
        public Builder createPolicy(String createPolicy) {
            return createPolicy(Output.of(createPolicy));
        }

        /**
         * @param credential User provided default credential for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CredentialArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential User provided default credential for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder credential(CredentialArgs credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param description An optional user-provided description of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional user-provided description of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<DeploymentLabelEntryArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<DeploymentLabelEntryArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(DeploymentLabelEntryArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preview If set to true, creates a deployment and creates &#34;shell&#34; resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the `update()` method or you can use the `cancelPreview()` method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
         * 
         * @return builder
         * 
         */
        public Builder preview(@Nullable Output<String> preview) {
            $.preview = preview;
            return this;
        }

        /**
         * @param preview If set to true, creates a deployment and creates &#34;shell&#34; resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the `update()` method or you can use the `cancelPreview()` method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
         * 
         * @return builder
         * 
         */
        public Builder preview(String preview) {
            return preview(Output.of(preview));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param target [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<TargetConfigurationArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
         * 
         * @return builder
         * 
         */
        public Builder target(TargetConfigurationArgs target) {
            return target(Output.of(target));
        }

        public DeploymentArgs build() {
            return $;
        }
    }

}