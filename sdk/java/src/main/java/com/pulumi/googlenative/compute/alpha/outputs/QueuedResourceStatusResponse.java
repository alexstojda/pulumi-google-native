// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.QueuedResourceStatusFailedDataResponse;
import com.pulumi.googlenative.compute.alpha.outputs.QueuingPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QueuedResourceStatusResponse {
    /**
     * @return Additional status detail for the FAILED state.
     * 
     */
    private QueuedResourceStatusFailedDataResponse failedData;
    /**
     * @return [Output only] Fully qualified URL of the provisioning GCE operation to track the provisioning along with provisioning errors. The referenced operation may not exist after having been deleted or expired.
     * 
     */
    private List<String> provisioningOperations;
    /**
     * @return Constraints for the time when the resource(s) start provisioning. Always exposed as absolute times.
     * 
     */
    private QueuingPolicyResponse queuingPolicy;

    private QueuedResourceStatusResponse() {}
    /**
     * @return Additional status detail for the FAILED state.
     * 
     */
    public QueuedResourceStatusFailedDataResponse failedData() {
        return this.failedData;
    }
    /**
     * @return [Output only] Fully qualified URL of the provisioning GCE operation to track the provisioning along with provisioning errors. The referenced operation may not exist after having been deleted or expired.
     * 
     */
    public List<String> provisioningOperations() {
        return this.provisioningOperations;
    }
    /**
     * @return Constraints for the time when the resource(s) start provisioning. Always exposed as absolute times.
     * 
     */
    public QueuingPolicyResponse queuingPolicy() {
        return this.queuingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueuedResourceStatusResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private QueuedResourceStatusFailedDataResponse failedData;
        private List<String> provisioningOperations;
        private QueuingPolicyResponse queuingPolicy;
        public Builder() {}
        public Builder(QueuedResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failedData = defaults.failedData;
    	      this.provisioningOperations = defaults.provisioningOperations;
    	      this.queuingPolicy = defaults.queuingPolicy;
        }

        @CustomType.Setter
        public Builder failedData(QueuedResourceStatusFailedDataResponse failedData) {
            this.failedData = Objects.requireNonNull(failedData);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningOperations(List<String> provisioningOperations) {
            this.provisioningOperations = Objects.requireNonNull(provisioningOperations);
            return this;
        }
        public Builder provisioningOperations(String... provisioningOperations) {
            return provisioningOperations(List.of(provisioningOperations));
        }
        @CustomType.Setter
        public Builder queuingPolicy(QueuingPolicyResponse queuingPolicy) {
            this.queuingPolicy = Objects.requireNonNull(queuingPolicy);
            return this;
        }
        public QueuedResourceStatusResponse build() {
            final var o = new QueuedResourceStatusResponse();
            o.failedData = failedData;
            o.provisioningOperations = provisioningOperations;
            o.queuingPolicy = queuingPolicy;
            return o;
        }
    }
}