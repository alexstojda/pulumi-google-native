// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse {
    /**
     * @return The name of the header to set.
     * 
     */
    private String headerName;
    /**
     * @return The value to set the named header to.
     * 
     */
    private String headerValue;

    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse() {}
    /**
     * @return The name of the header to set.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return The value to set the named header to.
     * 
     */
    public String headerValue() {
        return this.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerName;
        private String headerValue;
        public Builder() {}
        public Builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse build() {
            final var o = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse();
            o.headerName = headerName;
            o.headerValue = headerValue;
            return o;
        }
    }
}