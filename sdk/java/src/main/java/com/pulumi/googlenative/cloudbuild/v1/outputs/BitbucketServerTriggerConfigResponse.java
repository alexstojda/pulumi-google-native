// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1.outputs.BitbucketServerConfigResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PullRequestFilterResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PushFilterResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BitbucketServerTriggerConfigResponse {
    /**
     * @return The BitbucketServerConfig specified in the bitbucket_server_config_resource field.
     * 
     */
    private BitbucketServerConfigResponse bitbucketServerConfig;
    /**
     * @return The Bitbucket server config resource that this trigger config maps to.
     * 
     */
    private String bitbucketServerConfigResource;
    /**
     * @return Key of the project that the repo is in. For example: The key for https://mybitbucket.server/projects/TEST/repos/test-repo is &#34;TEST&#34;.
     * 
     */
    private String projectKey;
    /**
     * @return Filter to match changes in pull requests.
     * 
     */
    private PullRequestFilterResponse pullRequest;
    /**
     * @return Filter to match changes in refs like branches, tags.
     * 
     */
    private PushFilterResponse push;
    /**
     * @return Slug of the repository. A repository slug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. For example, if the repository name is &#39;test repo&#39;, in the URL it would become &#39;test-repo&#39; as in https://mybitbucket.server/projects/TEST/repos/test-repo.
     * 
     */
    private String repoSlug;

    private BitbucketServerTriggerConfigResponse() {}
    /**
     * @return The BitbucketServerConfig specified in the bitbucket_server_config_resource field.
     * 
     */
    public BitbucketServerConfigResponse bitbucketServerConfig() {
        return this.bitbucketServerConfig;
    }
    /**
     * @return The Bitbucket server config resource that this trigger config maps to.
     * 
     */
    public String bitbucketServerConfigResource() {
        return this.bitbucketServerConfigResource;
    }
    /**
     * @return Key of the project that the repo is in. For example: The key for https://mybitbucket.server/projects/TEST/repos/test-repo is &#34;TEST&#34;.
     * 
     */
    public String projectKey() {
        return this.projectKey;
    }
    /**
     * @return Filter to match changes in pull requests.
     * 
     */
    public PullRequestFilterResponse pullRequest() {
        return this.pullRequest;
    }
    /**
     * @return Filter to match changes in refs like branches, tags.
     * 
     */
    public PushFilterResponse push() {
        return this.push;
    }
    /**
     * @return Slug of the repository. A repository slug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. For example, if the repository name is &#39;test repo&#39;, in the URL it would become &#39;test-repo&#39; as in https://mybitbucket.server/projects/TEST/repos/test-repo.
     * 
     */
    public String repoSlug() {
        return this.repoSlug;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerTriggerConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BitbucketServerConfigResponse bitbucketServerConfig;
        private String bitbucketServerConfigResource;
        private String projectKey;
        private PullRequestFilterResponse pullRequest;
        private PushFilterResponse push;
        private String repoSlug;
        public Builder() {}
        public Builder(BitbucketServerTriggerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitbucketServerConfig = defaults.bitbucketServerConfig;
    	      this.bitbucketServerConfigResource = defaults.bitbucketServerConfigResource;
    	      this.projectKey = defaults.projectKey;
    	      this.pullRequest = defaults.pullRequest;
    	      this.push = defaults.push;
    	      this.repoSlug = defaults.repoSlug;
        }

        @CustomType.Setter
        public Builder bitbucketServerConfig(BitbucketServerConfigResponse bitbucketServerConfig) {
            this.bitbucketServerConfig = Objects.requireNonNull(bitbucketServerConfig);
            return this;
        }
        @CustomType.Setter
        public Builder bitbucketServerConfigResource(String bitbucketServerConfigResource) {
            this.bitbucketServerConfigResource = Objects.requireNonNull(bitbucketServerConfigResource);
            return this;
        }
        @CustomType.Setter
        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
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
        @CustomType.Setter
        public Builder repoSlug(String repoSlug) {
            this.repoSlug = Objects.requireNonNull(repoSlug);
            return this;
        }
        public BitbucketServerTriggerConfigResponse build() {
            final var o = new BitbucketServerTriggerConfigResponse();
            o.bitbucketServerConfig = bitbucketServerConfig;
            o.bitbucketServerConfigResource = bitbucketServerConfigResource;
            o.projectKey = projectKey;
            o.pullRequest = pullRequest;
            o.push = push;
            o.repoSlug = repoSlug;
            return o;
        }
    }
}