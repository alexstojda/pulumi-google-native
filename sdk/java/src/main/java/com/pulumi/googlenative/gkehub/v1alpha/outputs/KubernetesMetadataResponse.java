// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesMetadataResponse {
    /**
     * @return Kubernetes API server version string as reported by `/version`.
     * 
     */
    private String kubernetesApiServerVersion;
    /**
     * @return The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    private Integer memoryMb;
    /**
     * @return Node count as reported by Kubernetes nodes resources.
     * 
     */
    private Integer nodeCount;
    /**
     * @return Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    private String nodeProviderId;
    /**
     * @return The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    private String updateTime;
    /**
     * @return vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    private Integer vcpuCount;

    private KubernetesMetadataResponse() {}
    /**
     * @return Kubernetes API server version string as reported by `/version`.
     * 
     */
    public String kubernetesApiServerVersion() {
        return this.kubernetesApiServerVersion;
    }
    /**
     * @return The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    public Integer memoryMb() {
        return this.memoryMb;
    }
    /**
     * @return Node count as reported by Kubernetes nodes resources.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    public String nodeProviderId() {
        return this.nodeProviderId;
    }
    /**
     * @return The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    public Integer vcpuCount() {
        return this.vcpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesMetadataResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kubernetesApiServerVersion;
        private Integer memoryMb;
        private Integer nodeCount;
        private String nodeProviderId;
        private String updateTime;
        private Integer vcpuCount;
        public Builder() {}
        public Builder(KubernetesMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesApiServerVersion = defaults.kubernetesApiServerVersion;
    	      this.memoryMb = defaults.memoryMb;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeProviderId = defaults.nodeProviderId;
    	      this.updateTime = defaults.updateTime;
    	      this.vcpuCount = defaults.vcpuCount;
        }

        @CustomType.Setter
        public Builder kubernetesApiServerVersion(String kubernetesApiServerVersion) {
            this.kubernetesApiServerVersion = Objects.requireNonNull(kubernetesApiServerVersion);
            return this;
        }
        @CustomType.Setter
        public Builder memoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder nodeProviderId(String nodeProviderId) {
            this.nodeProviderId = Objects.requireNonNull(nodeProviderId);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        @CustomType.Setter
        public Builder vcpuCount(Integer vcpuCount) {
            this.vcpuCount = Objects.requireNonNull(vcpuCount);
            return this;
        }
        public KubernetesMetadataResponse build() {
            final var o = new KubernetesMetadataResponse();
            o.kubernetesApiServerVersion = kubernetesApiServerVersion;
            o.memoryMb = memoryMb;
            o.nodeCount = nodeCount;
            o.nodeProviderId = nodeProviderId;
            o.updateTime = updateTime;
            o.vcpuCount = vcpuCount;
            return o;
        }
    }
}