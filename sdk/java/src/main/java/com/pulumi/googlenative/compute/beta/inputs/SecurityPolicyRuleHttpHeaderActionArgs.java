// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.inputs.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleHttpHeaderActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleHttpHeaderActionArgs Empty = new SecurityPolicyRuleHttpHeaderActionArgs();

    /**
     * The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    @Import(name="requestHeadersToAdds")
    private @Nullable Output<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds;

    /**
     * @return The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    public Optional<Output<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>>> requestHeadersToAdds() {
        return Optional.ofNullable(this.requestHeadersToAdds);
    }

    private SecurityPolicyRuleHttpHeaderActionArgs() {}

    private SecurityPolicyRuleHttpHeaderActionArgs(SecurityPolicyRuleHttpHeaderActionArgs $) {
        this.requestHeadersToAdds = $.requestHeadersToAdds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleHttpHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleHttpHeaderActionArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleHttpHeaderActionArgs();
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionArgs defaults) {
            $ = new SecurityPolicyRuleHttpHeaderActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestHeadersToAdds The list of request headers to add or overwrite if they&#39;re already present.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(@Nullable Output<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds) {
            $.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        /**
         * @param requestHeadersToAdds The list of request headers to add or overwrite if they&#39;re already present.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs> requestHeadersToAdds) {
            return requestHeadersToAdds(Output.of(requestHeadersToAdds));
        }

        /**
         * @param requestHeadersToAdds The list of request headers to add or overwrite if they&#39;re already present.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }

        public SecurityPolicyRuleHttpHeaderActionArgs build() {
            return $;
        }
    }

}