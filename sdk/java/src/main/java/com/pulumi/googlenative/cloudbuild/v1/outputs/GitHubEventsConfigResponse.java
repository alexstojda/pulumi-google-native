// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PullRequestFilterResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PushFilterResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitHubEventsConfigResponse {
    /**
     * @return Optional. The resource name of the github enterprise config that should be applied to this installation. For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    private String enterpriseConfigResourceName;
    /**
     * @return The installationID that emits the GitHub event.
     * 
     */
    private String installationId;
    /**
     * @return Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is &#34;cloud-builders&#34;.
     * 
     */
    private String name;
    /**
     * @return Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is &#34;googlecloudplatform&#34;.
     * 
     */
    private String owner;
    /**
     * @return filter to match changes in pull requests.
     * 
     */
    private PullRequestFilterResponse pullRequest;
    /**
     * @return filter to match changes in refs like branches, tags.
     * 
     */
    private PushFilterResponse push;

    private GitHubEventsConfigResponse() {}
    /**
     * @return Optional. The resource name of the github enterprise config that should be applied to this installation. For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    public String enterpriseConfigResourceName() {
        return this.enterpriseConfigResourceName;
    }
    /**
     * @return The installationID that emits the GitHub event.
     * 
     */
    public String installationId() {
        return this.installationId;
    }
    /**
     * @return Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is &#34;cloud-builders&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is &#34;googlecloudplatform&#34;.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return filter to match changes in pull requests.
     * 
     */
    public PullRequestFilterResponse pullRequest() {
        return this.pullRequest;
    }
    /**
     * @return filter to match changes in refs like branches, tags.
     * 
     */
    public PushFilterResponse push() {
        return this.push;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubEventsConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String enterpriseConfigResourceName;
        private String installationId;
        private String name;
        private String owner;
        private PullRequestFilterResponse pullRequest;
        private PushFilterResponse push;
        public Builder() {}
        public Builder(GitHubEventsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enterpriseConfigResourceName = defaults.enterpriseConfigResourceName;
    	      this.installationId = defaults.installationId;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.pullRequest = defaults.pullRequest;
    	      this.push = defaults.push;
        }

        @CustomType.Setter
        public Builder enterpriseConfigResourceName(String enterpriseConfigResourceName) {
            this.enterpriseConfigResourceName = Objects.requireNonNull(enterpriseConfigResourceName);
            return this;
        }
        @CustomType.Setter
        public Builder installationId(String installationId) {
            this.installationId = Objects.requireNonNull(installationId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder pullRequest(PullRequestFilterResponse pullRequest) {
            this.pullRequest = Objects.requireNonNull(pullRequest);
            return this;
        }
        @CustomType.Setter
        public Builder push(PushFilterResponse push) {
            this.push = Objects.requireNonNull(push);
            return this;
        }
        public GitHubEventsConfigResponse build() {
            final var o = new GitHubEventsConfigResponse();
            o.enterpriseConfigResourceName = enterpriseConfigResourceName;
            o.installationId = installationId;
            o.name = name;
            o.owner = owner;
            o.pullRequest = pullRequest;
            o.push = push;
            return o;
        }
    }
}