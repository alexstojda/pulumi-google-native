// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagementSettingsResponse {
    /**
     * @return The renewal method for this `Registration`.
     * 
     */
    private String renewalMethod;
    /**
     * @return Controls whether the domain can be transferred to another registrar.
     * 
     */
    private String transferLockState;

    private ManagementSettingsResponse() {}
    /**
     * @return The renewal method for this `Registration`.
     * 
     */
    public String renewalMethod() {
        return this.renewalMethod;
    }
    /**
     * @return Controls whether the domain can be transferred to another registrar.
     * 
     */
    public String transferLockState() {
        return this.transferLockState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String renewalMethod;
        private String transferLockState;
        public Builder() {}
        public Builder(ManagementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.renewalMethod = defaults.renewalMethod;
    	      this.transferLockState = defaults.transferLockState;
        }

        @CustomType.Setter
        public Builder renewalMethod(String renewalMethod) {
            this.renewalMethod = Objects.requireNonNull(renewalMethod);
            return this;
        }
        @CustomType.Setter
        public Builder transferLockState(String transferLockState) {
            this.transferLockState = Objects.requireNonNull(transferLockState);
            return this;
        }
        public ManagementSettingsResponse build() {
            final var o = new ManagementSettingsResponse();
            o.renewalMethod = renewalMethod;
            o.transferLockState = transferLockState;
            return o;
        }
    }
}