// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.enums.ConditionIam;
import com.pulumi.googlenative.compute.beta.enums.ConditionOp;
import com.pulumi.googlenative.compute.beta.enums.ConditionSys;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="iam")
    private @Nullable Output<ConditionIam> iam;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<ConditionIam>> iam() {
        return Optional.ofNullable(this.iam);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="op")
    private @Nullable Output<ConditionOp> op;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<ConditionOp>> op() {
        return Optional.ofNullable(this.op);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="svc")
    private @Nullable Output<String> svc;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<String>> svc() {
        return Optional.ofNullable(this.svc);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="sys")
    private @Nullable Output<ConditionSys> sys;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<ConditionSys>> sys() {
        return Optional.ofNullable(this.sys);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ConditionArgs() {}

    private ConditionArgs(ConditionArgs $) {
        this.iam = $.iam;
        this.op = $.op;
        this.svc = $.svc;
        this.sys = $.sys;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionArgs $;

        public Builder() {
            $ = new ConditionArgs();
        }

        public Builder(ConditionArgs defaults) {
            $ = new ConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iam This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder iam(@Nullable Output<ConditionIam> iam) {
            $.iam = iam;
            return this;
        }

        /**
         * @param iam This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder iam(ConditionIam iam) {
            return iam(Output.of(iam));
        }

        /**
         * @param op This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder op(@Nullable Output<ConditionOp> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder op(ConditionOp op) {
            return op(Output.of(op));
        }

        /**
         * @param svc This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder svc(@Nullable Output<String> svc) {
            $.svc = svc;
            return this;
        }

        /**
         * @param svc This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder svc(String svc) {
            return svc(Output.of(svc));
        }

        /**
         * @param sys This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder sys(@Nullable Output<ConditionSys> sys) {
            $.sys = sys;
            return this;
        }

        /**
         * @param sys This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder sys(ConditionSys sys) {
            return sys(Output.of(sys));
        }

        /**
         * @param values This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ConditionArgs build() {
            return $;
        }
    }

}