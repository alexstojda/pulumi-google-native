// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KnowledgeBaseResponse {
    /**
     * @return The KB name (generally of the form KB[0-9]+ i.e. KB123456).
     * 
     */
    private String name;
    /**
     * @return A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/
     * 
     */
    private String url;

    private KnowledgeBaseResponse() {}
    /**
     * @return The KB name (generally of the form KB[0-9]+ i.e. KB123456).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String url;
        public Builder() {}
        public Builder(KnowledgeBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public KnowledgeBaseResponse build() {
            final var o = new KnowledgeBaseResponse();
            o.name = name;
            o.url = url;
            return o;
        }
    }
}