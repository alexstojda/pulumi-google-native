// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse {
    /**
     * @return Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    private List<Double> values;

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse() {}
    /**
     * @return Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    public List<Double> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Double> values;
        public Builder() {}
        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder values(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(Double... values) {
            return values(List.of(values));
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse build() {
            final var o = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse();
            o.values = values;
            return o;
        }
    }
}