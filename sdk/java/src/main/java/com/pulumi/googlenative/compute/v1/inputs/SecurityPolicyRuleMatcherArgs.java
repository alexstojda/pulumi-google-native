// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.SecurityPolicyRuleMatcherVersionedExpr;
import com.pulumi.googlenative.compute.v1.inputs.ExprArgs;
import com.pulumi.googlenative.compute.v1.inputs.SecurityPolicyRuleMatcherConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class SecurityPolicyRuleMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatcherArgs Empty = new SecurityPolicyRuleMatcherArgs();

    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    @Import(name="config")
    private @Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config;

    /**
     * @return The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    public Optional<Output<SecurityPolicyRuleMatcherConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    @Import(name="expr")
    private @Nullable Output<ExprArgs> expr;

    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    public Optional<Output<ExprArgs>> expr() {
        return Optional.ofNullable(this.expr);
    }

    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    @Import(name="versionedExpr")
    private @Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr;

    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    public Optional<Output<SecurityPolicyRuleMatcherVersionedExpr>> versionedExpr() {
        return Optional.ofNullable(this.versionedExpr);
    }

    private SecurityPolicyRuleMatcherArgs() {}

    private SecurityPolicyRuleMatcherArgs(SecurityPolicyRuleMatcherArgs $) {
        this.config = $.config;
        this.expr = $.expr;
        this.versionedExpr = $.versionedExpr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleMatcherArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleMatcherArgs();
        }

        public Builder(SecurityPolicyRuleMatcherArgs defaults) {
            $ = new SecurityPolicyRuleMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
         * 
         * @return builder
         * 
         */
        public Builder config(SecurityPolicyRuleMatcherConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
         * 
         * @return builder
         * 
         */
        public Builder expr(@Nullable Output<ExprArgs> expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
         * 
         * @return builder
         * 
         */
        public Builder expr(ExprArgs expr) {
            return expr(Output.of(expr));
        }

        /**
         * @param versionedExpr Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
         * 
         * @return builder
         * 
         */
        public Builder versionedExpr(@Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr) {
            $.versionedExpr = versionedExpr;
            return this;
        }

        /**
         * @param versionedExpr Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
         * 
         * @return builder
         * 
         */
        public Builder versionedExpr(SecurityPolicyRuleMatcherVersionedExpr versionedExpr) {
            return versionedExpr(Output.of(versionedExpr));
        }

        public SecurityPolicyRuleMatcherArgs build() {
            return $;
        }
    }

}