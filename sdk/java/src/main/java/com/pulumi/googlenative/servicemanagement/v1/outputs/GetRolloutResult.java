// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement.v1.outputs.DeleteServiceStrategyResponse;
import com.pulumi.googlenative.servicemanagement.v1.outputs.TrafficPercentStrategyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRolloutResult {
    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    private String createTime;
    /**
     * @return The user who created the Rollout. Readonly.
     * 
     */
    private String createdBy;
    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    private DeleteServiceStrategyResponse deleteServiceStrategy;
    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    private String rolloutId;
    /**
     * @return The name of the service associated with this Rollout.
     * 
     */
    private String serviceName;
    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    private String status;
    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    private TrafficPercentStrategyResponse trafficPercentStrategy;

    private GetRolloutResult() {}
    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The user who created the Rollout. Readonly.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    public DeleteServiceStrategyResponse deleteServiceStrategy() {
        return this.deleteServiceStrategy;
    }
    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    public String rolloutId() {
        return this.rolloutId;
    }
    /**
     * @return The name of the service associated with this Rollout.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    public TrafficPercentStrategyResponse trafficPercentStrategy() {
        return this.trafficPercentStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolloutResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String createdBy;
        private DeleteServiceStrategyResponse deleteServiceStrategy;
        private String rolloutId;
        private String serviceName;
        private String status;
        private TrafficPercentStrategyResponse trafficPercentStrategy;
        public Builder() {}
        public Builder(GetRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.createdBy = defaults.createdBy;
    	      this.deleteServiceStrategy = defaults.deleteServiceStrategy;
    	      this.rolloutId = defaults.rolloutId;
    	      this.serviceName = defaults.serviceName;
    	      this.status = defaults.status;
    	      this.trafficPercentStrategy = defaults.trafficPercentStrategy;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        @CustomType.Setter
        public Builder deleteServiceStrategy(DeleteServiceStrategyResponse deleteServiceStrategy) {
            this.deleteServiceStrategy = Objects.requireNonNull(deleteServiceStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder rolloutId(String rolloutId) {
            this.rolloutId = Objects.requireNonNull(rolloutId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder trafficPercentStrategy(TrafficPercentStrategyResponse trafficPercentStrategy) {
            this.trafficPercentStrategy = Objects.requireNonNull(trafficPercentStrategy);
            return this;
        }
        public GetRolloutResult build() {
            final var o = new GetRolloutResult();
            o.createTime = createTime;
            o.createdBy = createdBy;
            o.deleteServiceStrategy = deleteServiceStrategy;
            o.rolloutId = rolloutId;
            o.serviceName = serviceName;
            o.status = status;
            o.trafficPercentStrategy = trafficPercentStrategy;
            return o;
        }
    }
}