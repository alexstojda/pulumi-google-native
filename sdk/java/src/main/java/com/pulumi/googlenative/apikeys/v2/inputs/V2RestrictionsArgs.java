// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apikeys.v2.inputs.V2AndroidKeyRestrictionsArgs;
import com.pulumi.googlenative.apikeys.v2.inputs.V2ApiTargetArgs;
import com.pulumi.googlenative.apikeys.v2.inputs.V2BrowserKeyRestrictionsArgs;
import com.pulumi.googlenative.apikeys.v2.inputs.V2IosKeyRestrictionsArgs;
import com.pulumi.googlenative.apikeys.v2.inputs.V2ServerKeyRestrictionsArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the restrictions on the key.
 * 
 */
public final class V2RestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2RestrictionsArgs Empty = new V2RestrictionsArgs();

    /**
     * The Android apps that are allowed to use the key.
     * 
     */
    @Import(name="androidKeyRestrictions")
    private @Nullable Output<V2AndroidKeyRestrictionsArgs> androidKeyRestrictions;

    /**
     * @return The Android apps that are allowed to use the key.
     * 
     */
    public Optional<Output<V2AndroidKeyRestrictionsArgs>> androidKeyRestrictions() {
        return Optional.ofNullable(this.androidKeyRestrictions);
    }

    /**
     * A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * 
     */
    @Import(name="apiTargets")
    private @Nullable Output<List<V2ApiTargetArgs>> apiTargets;

    /**
     * @return A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * 
     */
    public Optional<Output<List<V2ApiTargetArgs>>> apiTargets() {
        return Optional.ofNullable(this.apiTargets);
    }

    /**
     * The HTTP referrers (websites) that are allowed to use the key.
     * 
     */
    @Import(name="browserKeyRestrictions")
    private @Nullable Output<V2BrowserKeyRestrictionsArgs> browserKeyRestrictions;

    /**
     * @return The HTTP referrers (websites) that are allowed to use the key.
     * 
     */
    public Optional<Output<V2BrowserKeyRestrictionsArgs>> browserKeyRestrictions() {
        return Optional.ofNullable(this.browserKeyRestrictions);
    }

    /**
     * The iOS apps that are allowed to use the key.
     * 
     */
    @Import(name="iosKeyRestrictions")
    private @Nullable Output<V2IosKeyRestrictionsArgs> iosKeyRestrictions;

    /**
     * @return The iOS apps that are allowed to use the key.
     * 
     */
    public Optional<Output<V2IosKeyRestrictionsArgs>> iosKeyRestrictions() {
        return Optional.ofNullable(this.iosKeyRestrictions);
    }

    /**
     * The IP addresses of callers that are allowed to use the key.
     * 
     */
    @Import(name="serverKeyRestrictions")
    private @Nullable Output<V2ServerKeyRestrictionsArgs> serverKeyRestrictions;

    /**
     * @return The IP addresses of callers that are allowed to use the key.
     * 
     */
    public Optional<Output<V2ServerKeyRestrictionsArgs>> serverKeyRestrictions() {
        return Optional.ofNullable(this.serverKeyRestrictions);
    }

    private V2RestrictionsArgs() {}

    private V2RestrictionsArgs(V2RestrictionsArgs $) {
        this.androidKeyRestrictions = $.androidKeyRestrictions;
        this.apiTargets = $.apiTargets;
        this.browserKeyRestrictions = $.browserKeyRestrictions;
        this.iosKeyRestrictions = $.iosKeyRestrictions;
        this.serverKeyRestrictions = $.serverKeyRestrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2RestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2RestrictionsArgs $;

        public Builder() {
            $ = new V2RestrictionsArgs();
        }

        public Builder(V2RestrictionsArgs defaults) {
            $ = new V2RestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidKeyRestrictions The Android apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder androidKeyRestrictions(@Nullable Output<V2AndroidKeyRestrictionsArgs> androidKeyRestrictions) {
            $.androidKeyRestrictions = androidKeyRestrictions;
            return this;
        }

        /**
         * @param androidKeyRestrictions The Android apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder androidKeyRestrictions(V2AndroidKeyRestrictionsArgs androidKeyRestrictions) {
            return androidKeyRestrictions(Output.of(androidKeyRestrictions));
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(@Nullable Output<List<V2ApiTargetArgs>> apiTargets) {
            $.apiTargets = apiTargets;
            return this;
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(List<V2ApiTargetArgs> apiTargets) {
            return apiTargets(Output.of(apiTargets));
        }

        /**
         * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
         * 
         * @return builder
         * 
         */
        public Builder apiTargets(V2ApiTargetArgs... apiTargets) {
            return apiTargets(List.of(apiTargets));
        }

        /**
         * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder browserKeyRestrictions(@Nullable Output<V2BrowserKeyRestrictionsArgs> browserKeyRestrictions) {
            $.browserKeyRestrictions = browserKeyRestrictions;
            return this;
        }

        /**
         * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder browserKeyRestrictions(V2BrowserKeyRestrictionsArgs browserKeyRestrictions) {
            return browserKeyRestrictions(Output.of(browserKeyRestrictions));
        }

        /**
         * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder iosKeyRestrictions(@Nullable Output<V2IosKeyRestrictionsArgs> iosKeyRestrictions) {
            $.iosKeyRestrictions = iosKeyRestrictions;
            return this;
        }

        /**
         * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder iosKeyRestrictions(V2IosKeyRestrictionsArgs iosKeyRestrictions) {
            return iosKeyRestrictions(Output.of(iosKeyRestrictions));
        }

        /**
         * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyRestrictions(@Nullable Output<V2ServerKeyRestrictionsArgs> serverKeyRestrictions) {
            $.serverKeyRestrictions = serverKeyRestrictions;
            return this;
        }

        /**
         * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyRestrictions(V2ServerKeyRestrictionsArgs serverKeyRestrictions) {
            return serverKeyRestrictions(Output.of(serverKeyRestrictions));
        }

        public V2RestrictionsArgs build() {
            return $;
        }
    }

}