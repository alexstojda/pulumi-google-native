// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.CloudRepoSourceContextResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.GerritSourceContextResponse;
import com.pulumi.googlenative.containeranalysis.v1.outputs.GitSourceContextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SourceContextResponse {
    /**
     * @return A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    private CloudRepoSourceContextResponse cloudRepo;
    /**
     * @return A SourceContext referring to a Gerrit project.
     * 
     */
    private GerritSourceContextResponse gerrit;
    /**
     * @return A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    private GitSourceContextResponse git;
    /**
     * @return Labels with user defined metadata.
     * 
     */
    private Map<String,String> labels;

    private SourceContextResponse() {}
    /**
     * @return A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    public CloudRepoSourceContextResponse cloudRepo() {
        return this.cloudRepo;
    }
    /**
     * @return A SourceContext referring to a Gerrit project.
     * 
     */
    public GerritSourceContextResponse gerrit() {
        return this.gerrit;
    }
    /**
     * @return A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    public GitSourceContextResponse git() {
        return this.git;
    }
    /**
     * @return Labels with user defined metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceContextResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CloudRepoSourceContextResponse cloudRepo;
        private GerritSourceContextResponse gerrit;
        private GitSourceContextResponse git;
        private Map<String,String> labels;
        public Builder() {}
        public Builder(SourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        @CustomType.Setter
        public Builder cloudRepo(CloudRepoSourceContextResponse cloudRepo) {
            this.cloudRepo = Objects.requireNonNull(cloudRepo);
            return this;
        }
        @CustomType.Setter
        public Builder gerrit(GerritSourceContextResponse gerrit) {
            this.gerrit = Objects.requireNonNull(gerrit);
            return this;
        }
        @CustomType.Setter
        public Builder git(GitSourceContextResponse git) {
            this.git = Objects.requireNonNull(git);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public SourceContextResponse build() {
            final var o = new SourceContextResponse();
            o.cloudRepo = cloudRepo;
            o.gerrit = gerrit;
            o.git = git;
            o.labels = labels;
            return o;
        }
    }
}