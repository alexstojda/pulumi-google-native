// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecResponse {
    /**
     * @return Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    private String description;
    /**
     * @return The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    private String displayName;
    /**
     * @return This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: &#34;dog&#34;, index: 0 }` and one AnnotationSpec with `{ display_name: &#34;cat&#34;, index: 1 }`. This is especially useful for model training as it encodes the string labels into numeric values.
     * 
     */
    private Integer index;

    private GoogleCloudDatalabelingV1beta1AnnotationSpecResponse() {}
    /**
     * @return Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: &#34;dog&#34;, index: 0 }` and one AnnotationSpec with `{ display_name: &#34;cat&#34;, index: 1 }`. This is especially useful for model training as it encodes the string labels into numeric values.
     * 
     */
    public Integer index() {
        return this.index;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String displayName;
        private Integer index;
        public Builder() {}
        public Builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.index = defaults.index;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1AnnotationSpecResponse build() {
            final var o = new GoogleCloudDatalabelingV1beta1AnnotationSpecResponse();
            o.description = description;
            o.displayName = displayName;
            o.index = index;
            return o;
        }
    }
}