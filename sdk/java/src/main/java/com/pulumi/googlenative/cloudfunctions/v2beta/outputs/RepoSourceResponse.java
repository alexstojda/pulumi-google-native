// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RepoSourceResponse {
    /**
     * @return Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String branchName;
    /**
     * @return Explicit commit SHA to build.
     * 
     */
    private String commitSha;
    /**
     * @return Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
     * 
     */
    private String dir;
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private Boolean invertRegex;
    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    private String project;
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    private String repoName;
    /**
     * @return Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String tagName;

    private RepoSourceResponse() {}
    /**
     * @return Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return Explicit commit SHA to build.
     * 
     */
    public String commitSha() {
        return this.commitSha;
    }
    /**
     * @return Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
     * 
     */
    public String dir() {
        return this.dir;
    }
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Boolean invertRegex() {
        return this.invertRegex;
    }
    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSourceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branchName;
        private String commitSha;
        private String dir;
        private Boolean invertRegex;
        private String project;
        private String repoName;
        private String tagName;
        public Builder() {}
        public Builder(RepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        @CustomType.Setter
        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        @CustomType.Setter
        public Builder commitSha(String commitSha) {
            this.commitSha = Objects.requireNonNull(commitSha);
            return this;
        }
        @CustomType.Setter
        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        @CustomType.Setter
        public Builder invertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        @CustomType.Setter
        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        public RepoSourceResponse build() {
            final var o = new RepoSourceResponse();
            o.branchName = branchName;
            o.commitSha = commitSha;
            o.dir = dir;
            o.invertRegex = invertRegex;
            o.project = project;
            o.repoName = repoName;
            o.tagName = tagName;
            return o;
        }
    }
}