// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.KnowledgeBaseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WindowsDetailResponse {
    /**
     * @return The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    private String cpeUri;
    /**
     * @return The description of this vulnerability.
     * 
     */
    private String description;
    /**
     * @return The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
     * 
     */
    private List<KnowledgeBaseResponse> fixingKbs;
    /**
     * @return The name of this vulnerability.
     * 
     */
    private String name;

    private WindowsDetailResponse() {}
    /**
     * @return The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    public String cpeUri() {
        return this.cpeUri;
    }
    /**
     * @return The description of this vulnerability.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
     * 
     */
    public List<KnowledgeBaseResponse> fixingKbs() {
        return this.fixingKbs;
    }
    /**
     * @return The name of this vulnerability.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsDetailResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cpeUri;
        private String description;
        private List<KnowledgeBaseResponse> fixingKbs;
        private String name;
        public Builder() {}
        public Builder(WindowsDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixingKbs = defaults.fixingKbs;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder fixingKbs(List<KnowledgeBaseResponse> fixingKbs) {
            this.fixingKbs = Objects.requireNonNull(fixingKbs);
            return this;
        }
        public Builder fixingKbs(KnowledgeBaseResponse... fixingKbs) {
            return fixingKbs(List.of(fixingKbs));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WindowsDetailResponse build() {
            final var o = new WindowsDetailResponse();
            o.cpeUri = cpeUri;
            o.description = description;
            o.fixingKbs = fixingKbs;
            o.name = name;
            return o;
        }
    }
}