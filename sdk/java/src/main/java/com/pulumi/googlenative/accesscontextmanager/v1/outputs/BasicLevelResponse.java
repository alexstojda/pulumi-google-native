// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.accesscontextmanager.v1.outputs.ConditionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BasicLevelResponse {
    /**
     * @return How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    private String combiningFunction;
    /**
     * @return A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    private List<ConditionResponse> conditions;

    private BasicLevelResponse() {}
    /**
     * @return How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    public String combiningFunction() {
        return this.combiningFunction;
    }
    /**
     * @return A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    public List<ConditionResponse> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLevelResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String combiningFunction;
        private List<ConditionResponse> conditions;
        public Builder() {}
        public Builder(BasicLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder combiningFunction(String combiningFunction) {
            this.combiningFunction = Objects.requireNonNull(combiningFunction);
            return this;
        }
        @CustomType.Setter
        public Builder conditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public BasicLevelResponse build() {
            final var o = new BasicLevelResponse();
            o.combiningFunction = combiningFunction;
            o.conditions = conditions;
            return o;
        }
    }
}