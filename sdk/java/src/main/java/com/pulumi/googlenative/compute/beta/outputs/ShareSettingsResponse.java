// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ShareSettingsResponse {
    /**
     * @return A map of project id and project config. This is only valid when share_type&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    private Map<String,String> projectMap;
    /**
     * @return A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    private List<String> projects;
    /**
     * @return Type of sharing for this shared-reservation
     * 
     */
    private String shareType;

    private ShareSettingsResponse() {}
    /**
     * @return A map of project id and project config. This is only valid when share_type&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    public Map<String,String> projectMap() {
        return this.projectMap;
    }
    /**
     * @return A List of Project names to specify consumer projects for this shared-reservation. This is only valid when share_type&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    public List<String> projects() {
        return this.projects;
    }
    /**
     * @return Type of sharing for this shared-reservation
     * 
     */
    public String shareType() {
        return this.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> projectMap;
        private List<String> projects;
        private String shareType;
        public Builder() {}
        public Builder(ShareSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMap = defaults.projectMap;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        @CustomType.Setter
        public Builder projectMap(Map<String,String> projectMap) {
            this.projectMap = Objects.requireNonNull(projectMap);
            return this;
        }
        @CustomType.Setter
        public Builder projects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }
        @CustomType.Setter
        public Builder shareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }
        public ShareSettingsResponse build() {
            final var o = new ShareSettingsResponse();
            o.projectMap = projectMap;
            o.projects = projects;
            o.shareType = shareType;
            return o;
        }
    }
}