// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseappcheck.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDebugTokenResult {
    /**
     * @return A human readable display name used to identify this debug token.
     * 
     */
    private String displayName;
    /**
     * @return The relative resource name of the debug token, in the format: ```projects/{project_number}/apps/{app_id}/debugTokens/{debug_token_id}```
     * 
     */
    private String name;
    /**
     * @return Input only. Immutable. The secret token itself. Must be provided during creation, and must be a UUID4, case insensitive. This field is immutable once set, and cannot be provided during an UpdateDebugToken request. You can, however, delete this debug token using DeleteDebugToken to revoke it. For security reasons, this field will never be populated in any response.
     * 
     */
    private String token;

    private GetDebugTokenResult() {}
    /**
     * @return A human readable display name used to identify this debug token.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The relative resource name of the debug token, in the format: ```projects/{project_number}/apps/{app_id}/debugTokens/{debug_token_id}```
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Input only. Immutable. The secret token itself. Must be provided during creation, and must be a UUID4, case insensitive. This field is immutable once set, and cannot be provided during an UpdateDebugToken request. You can, however, delete this debug token using DeleteDebugToken to revoke it. For security reasons, this field will never be populated in any response.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDebugTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String name;
        private String token;
        public Builder() {}
        public Builder(GetDebugTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.token = defaults.token;
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
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public GetDebugTokenResult build() {
            final var o = new GetDebugTokenResult();
            o.displayName = displayName;
            o.name = name;
            o.token = token;
            return o;
        }
    }
}