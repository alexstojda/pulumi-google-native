// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleFirestoreAdminV1beta1IndexFieldResponse {
    /**
     * @return The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
     */
    private String fieldPath;
    /**
     * @return The field&#39;s mode.
     * 
     */
    private String mode;

    private GoogleFirestoreAdminV1beta1IndexFieldResponse() {}
    /**
     * @return The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
     */
    public String fieldPath() {
        return this.fieldPath;
    }
    /**
     * @return The field&#39;s mode.
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldPath;
        private String mode;
        public Builder() {}
        public Builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPath = defaults.fieldPath;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder fieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GoogleFirestoreAdminV1beta1IndexFieldResponse build() {
            final var o = new GoogleFirestoreAdminV1beta1IndexFieldResponse();
            o.fieldPath = fieldPath;
            o.mode = mode;
            return o;
        }
    }
}