// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.ExprResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleMatcherConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleMatcherResponse {
    /**
     * @return The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    private SecurityPolicyRuleMatcherConfigResponse config;
    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    private ExprResponse expr;
    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    private String versionedExpr;

    private SecurityPolicyRuleMatcherResponse() {}
    /**
     * @return The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    public SecurityPolicyRuleMatcherConfigResponse config() {
        return this.config;
    }
    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    public ExprResponse expr() {
        return this.expr;
    }
    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    public String versionedExpr() {
        return this.versionedExpr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SecurityPolicyRuleMatcherConfigResponse config;
        private ExprResponse expr;
        private String versionedExpr;
        public Builder() {}
        public Builder(SecurityPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        @CustomType.Setter
        public Builder config(SecurityPolicyRuleMatcherConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder expr(ExprResponse expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }
        @CustomType.Setter
        public Builder versionedExpr(String versionedExpr) {
            this.versionedExpr = Objects.requireNonNull(versionedExpr);
            return this;
        }
        public SecurityPolicyRuleMatcherResponse build() {
            final var o = new SecurityPolicyRuleMatcherResponse();
            o.config = config;
            o.expr = expr;
            o.versionedExpr = versionedExpr;
            return o;
        }
    }
}