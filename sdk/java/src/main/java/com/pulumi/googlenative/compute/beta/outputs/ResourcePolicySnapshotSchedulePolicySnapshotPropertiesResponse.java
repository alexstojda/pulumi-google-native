// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse {
    /**
     * @return Chain name that the snapshot is created in.
     * 
     */
    private String chainName;
    /**
     * @return Indication to perform a &#39;guest aware&#39; snapshot.
     * 
     */
    private Boolean guestFlush;
    /**
     * @return Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    private List<String> storageLocations;

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse() {}
    /**
     * @return Chain name that the snapshot is created in.
     * 
     */
    public String chainName() {
        return this.chainName;
    }
    /**
     * @return Indication to perform a &#39;guest aware&#39; snapshot.
     * 
     */
    public Boolean guestFlush() {
        return this.guestFlush;
    }
    /**
     * @return Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    public List<String> storageLocations() {
        return this.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String chainName;
        private Boolean guestFlush;
        private Map<String,String> labels;
        private List<String> storageLocations;
        public Builder() {}
        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        @CustomType.Setter
        public Builder chainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }
        @CustomType.Setter
        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }
        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse build() {
            final var o = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse();
            o.chainName = chainName;
            o.guestFlush = guestFlush;
            o.labels = labels;
            o.storageLocations = storageLocations;
            return o;
        }
    }
}