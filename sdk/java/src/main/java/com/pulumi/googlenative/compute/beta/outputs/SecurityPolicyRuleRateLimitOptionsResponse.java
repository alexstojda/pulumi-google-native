// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleRateLimitOptionsThresholdResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleRateLimitOptionsResponse {
    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    private Integer banDurationSec;
    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    private SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;
    /**
     * @return Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    private String conformAction;
    /**
     * @return Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    private String enforceOnKey;
    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    private String enforceOnKeyName;
    /**
     * @return Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
     * 
     */
    private String exceedAction;
    /**
     * @return Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    private SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;
    /**
     * @return Threshold at which to begin ratelimiting.
     * 
     */
    private SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

    private SecurityPolicyRuleRateLimitOptionsResponse() {}
    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    public Integer banDurationSec() {
        return this.banDurationSec;
    }
    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold() {
        return this.banThreshold;
    }
    /**
     * @return Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    public String conformAction() {
        return this.conformAction;
    }
    /**
     * @return Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    public String enforceOnKey() {
        return this.enforceOnKey;
    }
    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    public String enforceOnKeyName() {
        return this.enforceOnKeyName;
    }
    /**
     * @return Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny(status)&#34;, where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceedRedirectOptions below.
     * 
     */
    public String exceedAction() {
        return this.exceedAction;
    }
    /**
     * @return Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    public SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions() {
        return this.exceedRedirectOptions;
    }
    /**
     * @return Threshold at which to begin ratelimiting.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer banDurationSec;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;
        private String conformAction;
        private String enforceOnKey;
        private String enforceOnKeyName;
        private String exceedAction;
        private SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;
        public Builder() {}
        public Builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banDurationSec = defaults.banDurationSec;
    	      this.banThreshold = defaults.banThreshold;
    	      this.conformAction = defaults.conformAction;
    	      this.enforceOnKey = defaults.enforceOnKey;
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.exceedAction = defaults.exceedAction;
    	      this.exceedRedirectOptions = defaults.exceedRedirectOptions;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        @CustomType.Setter
        public Builder banDurationSec(Integer banDurationSec) {
            this.banDurationSec = Objects.requireNonNull(banDurationSec);
            return this;
        }
        @CustomType.Setter
        public Builder banThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold) {
            this.banThreshold = Objects.requireNonNull(banThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder conformAction(String conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }
        @CustomType.Setter
        public Builder enforceOnKey(String enforceOnKey) {
            this.enforceOnKey = Objects.requireNonNull(enforceOnKey);
            return this;
        }
        @CustomType.Setter
        public Builder enforceOnKeyName(String enforceOnKeyName) {
            this.enforceOnKeyName = Objects.requireNonNull(enforceOnKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder exceedAction(String exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }
        @CustomType.Setter
        public Builder exceedRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions) {
            this.exceedRedirectOptions = Objects.requireNonNull(exceedRedirectOptions);
            return this;
        }
        @CustomType.Setter
        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsResponse build() {
            final var o = new SecurityPolicyRuleRateLimitOptionsResponse();
            o.banDurationSec = banDurationSec;
            o.banThreshold = banThreshold;
            o.conformAction = conformAction;
            o.enforceOnKey = enforceOnKey;
            o.enforceOnKeyName = enforceOnKeyName;
            o.exceedAction = exceedAction;
            o.exceedRedirectOptions = exceedRedirectOptions;
            o.rateLimitThreshold = rateLimitThreshold;
            return o;
        }
    }
}