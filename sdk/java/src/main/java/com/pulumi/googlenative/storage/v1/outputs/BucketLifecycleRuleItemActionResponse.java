// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketLifecycleRuleItemActionResponse {
    /**
     * @return Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    private String storageClass;
    /**
     * @return Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
     * 
     */
    private String type;

    private BucketLifecycleRuleItemActionResponse() {}
    /**
     * @return Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * @return Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleItemActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String storageClass;
        private String type;
        public Builder() {}
        public Builder(BucketLifecycleRuleItemActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BucketLifecycleRuleItemActionResponse build() {
            final var o = new BucketLifecycleRuleItemActionResponse();
            o.storageClass = storageClass;
            o.type = type;
            return o;
        }
    }
}