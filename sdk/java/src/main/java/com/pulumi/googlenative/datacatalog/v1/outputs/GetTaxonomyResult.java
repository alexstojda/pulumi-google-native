// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTaxonomyResult {
    /**
     * @return Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    private List<String> activatedPolicyTypes;
    /**
     * @return Optional. Description of this taxonomy. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns, and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    private String description;
    /**
     * @return User-defined name of this taxonomy. The name can&#39;t start or end with spaces, must contain only Unicode letters, numbers, underscores, dashes, and spaces, and be at most 200 bytes long when encoded in UTF-8. The taxonomy display name must be unique within an organization.
     * 
     */
    private String displayName;
    /**
     * @return Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
     * 
     */
    private String name;
    /**
     * @return Number of policy tags in this taxonomy.
     * 
     */
    private Integer policyTagCount;
    /**
     * @return Creation and modification timestamps of this taxonomy.
     * 
     */
    private GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;

    private GetTaxonomyResult() {}
    /**
     * @return Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    public List<String> activatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * @return Optional. Description of this taxonomy. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns, and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return User-defined name of this taxonomy. The name can&#39;t start or end with spaces, must contain only Unicode letters, numbers, underscores, dashes, and spaces, and be at most 200 bytes long when encoded in UTF-8. The taxonomy display name must be unique within an organization.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of policy tags in this taxonomy.
     * 
     */
    public Integer policyTagCount() {
        return this.policyTagCount;
    }
    /**
     * @return Creation and modification timestamps of this taxonomy.
     * 
     */
    public GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> activatedPolicyTypes;
        private String description;
        private String displayName;
        private String name;
        private Integer policyTagCount;
        private GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;
        public Builder() {}
        public Builder(GetTaxonomyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyTagCount = defaults.policyTagCount;
    	      this.taxonomyTimestamps = defaults.taxonomyTimestamps;
        }

        @CustomType.Setter
        public Builder activatedPolicyTypes(List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
            return this;
        }
        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder policyTagCount(Integer policyTagCount) {
            this.policyTagCount = Objects.requireNonNull(policyTagCount);
            return this;
        }
        @CustomType.Setter
        public Builder taxonomyTimestamps(GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps) {
            this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
            return this;
        }
        public GetTaxonomyResult build() {
            final var o = new GetTaxonomyResult();
            o.activatedPolicyTypes = activatedPolicyTypes;
            o.description = description;
            o.displayName = displayName;
            o.name = name;
            o.policyTagCount = policyTagCount;
            o.taxonomyTimestamps = taxonomyTimestamps;
            return o;
        }
    }
}