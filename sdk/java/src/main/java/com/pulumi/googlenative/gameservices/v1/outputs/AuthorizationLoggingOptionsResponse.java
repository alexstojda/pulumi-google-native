// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AuthorizationLoggingOptionsResponse {
    /**
     * @return The type of the permission that was checked.
     * 
     */
    private String permissionType;

    private AuthorizationLoggingOptionsResponse() {}
    /**
     * @return The type of the permission that was checked.
     * 
     */
    public String permissionType() {
        return this.permissionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String permissionType;
        public Builder() {}
        public Builder(AuthorizationLoggingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        @CustomType.Setter
        public Builder permissionType(String permissionType) {
            this.permissionType = Objects.requireNonNull(permissionType);
            return this;
        }
        public AuthorizationLoggingOptionsResponse build() {
            final var o = new AuthorizationLoggingOptionsResponse();
            o.permissionType = permissionType;
            return o;
        }
    }
}