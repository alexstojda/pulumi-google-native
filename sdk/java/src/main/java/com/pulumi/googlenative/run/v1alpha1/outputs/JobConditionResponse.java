// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobConditionResponse {
    /**
     * @return Optional. Last time the condition transitioned from one status to another.
     * 
     */
    private String lastTransitionTime;
    /**
     * @return Optional. Human readable message indicating details about the current status.
     * 
     */
    private String message;
    /**
     * @return Optional. One-word CamelCase reason for the condition&#39;s last transition.
     * 
     */
    private String reason;
    /**
     * @return Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    private String severity;
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    private String status;
    /**
     * @return Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * &#34;Completed&#34;: True when the Job has successfully completed. * &#34;Started&#34;: True when the Job has successfully started running. * &#34;ResourcesAvailable&#34;: True when underlying resources have been provisioned.
     * 
     */
    private String type;

    private JobConditionResponse() {}
    /**
     * @return Optional. Last time the condition transitioned from one status to another.
     * 
     */
    public String lastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * @return Optional. Human readable message indicating details about the current status.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Optional. One-word CamelCase reason for the condition&#39;s last transition.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * &#34;Completed&#34;: True when the Job has successfully completed. * &#34;Started&#34;: True when the Job has successfully started running. * &#34;ResourcesAvailable&#34;: True when underlying resources have been provisioned.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConditionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;
        public Builder() {}
        public Builder(JobConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JobConditionResponse build() {
            final var o = new JobConditionResponse();
            o.lastTransitionTime = lastTransitionTime;
            o.message = message;
            o.reason = reason;
            o.severity = severity;
            o.status = status;
            o.type = type;
            return o;
        }
    }
}