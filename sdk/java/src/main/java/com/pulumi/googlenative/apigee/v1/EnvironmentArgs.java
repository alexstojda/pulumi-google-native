// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.enums.EnvironmentApiProxyType;
import com.pulumi.googlenative.apigee.v1.enums.EnvironmentDeploymentType;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1PropertiesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    @Import(name="apiProxyType")
    private @Nullable Output<EnvironmentApiProxyType> apiProxyType;

    /**
     * @return Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    public Optional<Output<EnvironmentApiProxyType>> apiProxyType() {
        return Optional.ofNullable(this.apiProxyType);
    }

    /**
     * Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    @Import(name="deploymentType")
    private @Nullable Output<EnvironmentDeploymentType> deploymentType;

    /**
     * @return Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    public Optional<Output<EnvironmentDeploymentType>> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    /**
     * Optional. Description of the environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Display name for this environment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. Display name for this environment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Optional. Url of the forward proxy to be applied to the runtime instances in this environment. Must be in the format of {scheme}://{hostname}:{port}. Note that scheme must be one of &#34;http&#34; or &#34;https&#34;, and port must be supplied.
     * 
     */
    @Import(name="forwardProxyUri")
    private @Nullable Output<String> forwardProxyUri;

    /**
     * @return Optional. Url of the forward proxy to be applied to the runtime instances in this environment. Must be in the format of {scheme}://{hostname}:{port}. Note that scheme must be one of &#34;http&#34; or &#34;https&#34;, and port must be supplied.
     * 
     */
    public Optional<Output<String>> forwardProxyUri() {
        return Optional.ofNullable(this.forwardProxyUri);
    }

    /**
     * Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<GoogleCloudApigeeV1PropertiesArgs> properties;

    /**
     * @return Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1PropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.apiProxyType = $.apiProxyType;
        this.deploymentType = $.deploymentType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.forwardProxyUri = $.forwardProxyUri;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiProxyType Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder apiProxyType(@Nullable Output<EnvironmentApiProxyType> apiProxyType) {
            $.apiProxyType = apiProxyType;
            return this;
        }

        /**
         * @param apiProxyType Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder apiProxyType(EnvironmentApiProxyType apiProxyType) {
            return apiProxyType(Output.of(apiProxyType));
        }

        /**
         * @param deploymentType Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(@Nullable Output<EnvironmentDeploymentType> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(EnvironmentDeploymentType deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param description Optional. Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Optional. Display name for this environment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. Display name for this environment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param forwardProxyUri Optional. Url of the forward proxy to be applied to the runtime instances in this environment. Must be in the format of {scheme}://{hostname}:{port}. Note that scheme must be one of &#34;http&#34; or &#34;https&#34;, and port must be supplied.
         * 
         * @return builder
         * 
         */
        public Builder forwardProxyUri(@Nullable Output<String> forwardProxyUri) {
            $.forwardProxyUri = forwardProxyUri;
            return this;
        }

        /**
         * @param forwardProxyUri Optional. Url of the forward proxy to be applied to the runtime instances in this environment. Must be in the format of {scheme}://{hostname}:{port}. Note that scheme must be one of &#34;http&#34; or &#34;https&#34;, and port must be supplied.
         * 
         * @return builder
         * 
         */
        public Builder forwardProxyUri(String forwardProxyUri) {
            return forwardProxyUri(Output.of(forwardProxyUri));
        }

        /**
         * @param name Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param properties Optional. Key-value pairs that may be used for customizing the environment.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<GoogleCloudApigeeV1PropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. Key-value pairs that may be used for customizing the environment.
         * 
         * @return builder
         * 
         */
        public Builder properties(GoogleCloudApigeeV1PropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public EnvironmentArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}