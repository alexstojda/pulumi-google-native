// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.certificatemanager.v1.outputs.GclbTargetResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateMapResult {
    /**
     * @return The creation timestamp of a Certificate Map.
     * 
     */
    private String createTime;
    /**
     * @return One or more paragraphs of text description of a certificate map.
     * 
     */
    private String description;
    /**
     * @return A list of GCLB targets which use this Certificate Map.
     * 
     */
    private List<GclbTargetResponse> gclbTargets;
    /**
     * @return Set of labels associated with a Certificate Map.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return A user-defined name of the Certificate Map. Certificate Map names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*`.
     * 
     */
    private String name;
    /**
     * @return The update timestamp of a Certificate Map.
     * 
     */
    private String updateTime;

    private GetCertificateMapResult() {}
    /**
     * @return The creation timestamp of a Certificate Map.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return One or more paragraphs of text description of a certificate map.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of GCLB targets which use this Certificate Map.
     * 
     */
    public List<GclbTargetResponse> gclbTargets() {
        return this.gclbTargets;
    }
    /**
     * @return Set of labels associated with a Certificate Map.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return A user-defined name of the Certificate Map. Certificate Map names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The update timestamp of a Certificate Map.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateMapResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private List<GclbTargetResponse> gclbTargets;
        private Map<String,String> labels;
        private String name;
        private String updateTime;
        public Builder() {}
        public Builder(GetCertificateMapResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.gclbTargets = defaults.gclbTargets;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder gclbTargets(List<GclbTargetResponse> gclbTargets) {
            this.gclbTargets = Objects.requireNonNull(gclbTargets);
            return this;
        }
        public Builder gclbTargets(GclbTargetResponse... gclbTargets) {
            return gclbTargets(List.of(gclbTargets));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetCertificateMapResult build() {
            final var o = new GetCertificateMapResult();
            o.createTime = createTime;
            o.description = description;
            o.gclbTargets = gclbTargets;
            o.labels = labels;
            o.name = name;
            o.updateTime = updateTime;
            return o;
        }
    }
}