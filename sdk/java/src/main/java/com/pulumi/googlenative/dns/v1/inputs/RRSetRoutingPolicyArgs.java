// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns.v1.inputs.RRSetRoutingPolicyGeoPolicyArgs;
import com.pulumi.googlenative.dns.v1.inputs.RRSetRoutingPolicyWrrPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the response varying based on configured properties such as geolocation or by weighted random selection.
 * 
 */
public final class RRSetRoutingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyArgs Empty = new RRSetRoutingPolicyArgs();

    @Import(name="geo")
    private @Nullable Output<RRSetRoutingPolicyGeoPolicyArgs> geo;

    public Optional<Output<RRSetRoutingPolicyGeoPolicyArgs>> geo() {
        return Optional.ofNullable(this.geo);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    @Import(name="wrr")
    private @Nullable Output<RRSetRoutingPolicyWrrPolicyArgs> wrr;

    public Optional<Output<RRSetRoutingPolicyWrrPolicyArgs>> wrr() {
        return Optional.ofNullable(this.wrr);
    }

    private RRSetRoutingPolicyArgs() {}

    private RRSetRoutingPolicyArgs(RRSetRoutingPolicyArgs $) {
        this.geo = $.geo;
        this.kind = $.kind;
        this.wrr = $.wrr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RRSetRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyArgs $;

        public Builder() {
            $ = new RRSetRoutingPolicyArgs();
        }

        public Builder(RRSetRoutingPolicyArgs defaults) {
            $ = new RRSetRoutingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder geo(@Nullable Output<RRSetRoutingPolicyGeoPolicyArgs> geo) {
            $.geo = geo;
            return this;
        }

        public Builder geo(RRSetRoutingPolicyGeoPolicyArgs geo) {
            return geo(Output.of(geo));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder wrr(@Nullable Output<RRSetRoutingPolicyWrrPolicyArgs> wrr) {
            $.wrr = wrr;
            return this;
        }

        public Builder wrr(RRSetRoutingPolicyWrrPolicyArgs wrr) {
            return wrr(Output.of(wrr));
        }

        public RRSetRoutingPolicyArgs build() {
            return $;
        }
    }

}