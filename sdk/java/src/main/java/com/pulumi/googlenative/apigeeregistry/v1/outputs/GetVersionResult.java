// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVersionResult {
    /**
     * @return Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return Creation timestamp.
     * 
     */
    private String createTime;
    /**
     * @return A detailed description.
     * 
     */
    private String description;
    /**
     * @return Human-meaningful name.
     * 
     */
    private String displayName;
    /**
     * @return Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return A user-definable description of the lifecycle phase of this API version. Format: free-form, but we expect single words that describe API maturity, e.g. &#34;CONCEPT&#34;, &#34;DESIGN&#34;, &#34;DEVELOPMENT&#34;, &#34;STAGING&#34;, &#34;PRODUCTION&#34;, &#34;DEPRECATED&#34;, &#34;RETIRED&#34;.
     * 
     */
    private String state;
    /**
     * @return Last update timestamp.
     * 
     */
    private String updateTime;

    private GetVersionResult() {}
    /**
     * @return Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return Creation timestamp.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A detailed description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Human-meaningful name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A user-definable description of the lifecycle phase of this API version. Format: free-form, but we expect single words that describe API maturity, e.g. &#34;CONCEPT&#34;, &#34;DESIGN&#34;, &#34;DEVELOPMENT&#34;, &#34;STAGING&#34;, &#34;PRODUCTION&#34;, &#34;DEPRECATED&#34;, &#34;RETIRED&#34;.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Last update timestamp.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private String createTime;
        private String description;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        public Builder() {}
        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
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
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetVersionResult build() {
            final var o = new GetVersionResult();
            o.annotations = annotations;
            o.createTime = createTime;
            o.description = description;
            o.displayName = displayName;
            o.labels = labels;
            o.name = name;
            o.state = state;
            o.updateTime = updateTime;
            return o;
        }
    }
}