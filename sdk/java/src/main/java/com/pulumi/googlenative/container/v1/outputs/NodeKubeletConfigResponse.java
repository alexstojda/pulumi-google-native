// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeKubeletConfigResponse {
    /**
     * @return Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is &#39;true&#39; if unspecified.
     * 
     */
    private Boolean cpuCfsQuota;
    /**
     * @return Set the CPU CFS quota period value &#39;cpu.cfs_period_us&#39;. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as &#34;300ms&#34;. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. The value must be a positive duration.
     * 
     */
    private String cpuCfsQuotaPeriod;
    /**
     * @return Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * &#34;none&#34;: the default, which represents the existing scheduling behavior. * &#34;static&#34;: allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is &#39;none&#39; if unspecified.
     * 
     */
    private String cpuManagerPolicy;
    /**
     * @return Set the Pod PID limits. See https://kubernetes.io/docs/concepts/policy/pid-limiting/#pod-pid-limits Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
     * 
     */
    private String podPidsLimit;

    private NodeKubeletConfigResponse() {}
    /**
     * @return Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is &#39;true&#39; if unspecified.
     * 
     */
    public Boolean cpuCfsQuota() {
        return this.cpuCfsQuota;
    }
    /**
     * @return Set the CPU CFS quota period value &#39;cpu.cfs_period_us&#39;. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as &#34;300ms&#34;. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. The value must be a positive duration.
     * 
     */
    public String cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }
    /**
     * @return Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * &#34;none&#34;: the default, which represents the existing scheduling behavior. * &#34;static&#34;: allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is &#39;none&#39; if unspecified.
     * 
     */
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }
    /**
     * @return Set the Pod PID limits. See https://kubernetes.io/docs/concepts/policy/pid-limiting/#pod-pid-limits Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
     * 
     */
    public String podPidsLimit() {
        return this.podPidsLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeKubeletConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;
        private String podPidsLimit;
        public Builder() {}
        public Builder(NodeKubeletConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.podPidsLimit = defaults.podPidsLimit;
        }

        @CustomType.Setter
        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota);
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder podPidsLimit(String podPidsLimit) {
            this.podPidsLimit = Objects.requireNonNull(podPidsLimit);
            return this;
        }
        public NodeKubeletConfigResponse build() {
            final var o = new NodeKubeletConfigResponse();
            o.cpuCfsQuota = cpuCfsQuota;
            o.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            o.cpuManagerPolicy = cpuManagerPolicy;
            o.podPidsLimit = podPidsLimit;
            return o;
        }
    }
}