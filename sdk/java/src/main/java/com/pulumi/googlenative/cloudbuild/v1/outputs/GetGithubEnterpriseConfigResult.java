// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1.outputs.GitHubEnterpriseSecretsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGithubEnterpriseConfigResult {
    /**
     * @return The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    private String appId;
    /**
     * @return Time when the installation was associated with the project.
     * 
     */
    private String createTime;
    /**
     * @return Name to display for this config.
     * 
     */
    private String displayName;
    /**
     * @return The URL of the github enterprise host the configuration is for.
     * 
     */
    private String hostUrl;
    /**
     * @return Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    private String name;
    /**
     * @return Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    private String peeredNetwork;
    /**
     * @return Names of secrets in Secret Manager.
     * 
     */
    private GitHubEnterpriseSecretsResponse secrets;
    /**
     * @return Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    private String sslCa;
    /**
     * @return The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    private String webhookKey;

    private GetGithubEnterpriseConfigResult() {}
    /**
     * @return The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return Time when the installation was associated with the project.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Name to display for this config.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The URL of the github enterprise host the configuration is for.
     * 
     */
    public String hostUrl() {
        return this.hostUrl;
    }
    /**
     * @return Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    public String peeredNetwork() {
        return this.peeredNetwork;
    }
    /**
     * @return Names of secrets in Secret Manager.
     * 
     */
    public GitHubEnterpriseSecretsResponse secrets() {
        return this.secrets;
    }
    /**
     * @return Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    public String sslCa() {
        return this.sslCa;
    }
    /**
     * @return The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    public String webhookKey() {
        return this.webhookKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGithubEnterpriseConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String createTime;
        private String displayName;
        private String hostUrl;
        private String name;
        private String peeredNetwork;
        private GitHubEnterpriseSecretsResponse secrets;
        private String sslCa;
        private String webhookKey;
        public Builder() {}
        public Builder(GetGithubEnterpriseConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.hostUrl = defaults.hostUrl;
    	      this.name = defaults.name;
    	      this.peeredNetwork = defaults.peeredNetwork;
    	      this.secrets = defaults.secrets;
    	      this.sslCa = defaults.sslCa;
    	      this.webhookKey = defaults.webhookKey;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder hostUrl(String hostUrl) {
            this.hostUrl = Objects.requireNonNull(hostUrl);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder secrets(GitHubEnterpriseSecretsResponse secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        @CustomType.Setter
        public Builder sslCa(String sslCa) {
            this.sslCa = Objects.requireNonNull(sslCa);
            return this;
        }
        @CustomType.Setter
        public Builder webhookKey(String webhookKey) {
            this.webhookKey = Objects.requireNonNull(webhookKey);
            return this;
        }
        public GetGithubEnterpriseConfigResult build() {
            final var o = new GetGithubEnterpriseConfigResult();
            o.appId = appId;
            o.createTime = createTime;
            o.displayName = displayName;
            o.hostUrl = hostUrl;
            o.name = name;
            o.peeredNetwork = peeredNetwork;
            o.secrets = secrets;
            o.sslCa = sslCa;
            o.webhookKey = webhookKey;
            return o;
        }
    }
}