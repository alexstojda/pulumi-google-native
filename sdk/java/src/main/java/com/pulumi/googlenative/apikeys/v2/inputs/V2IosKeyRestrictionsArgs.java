// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The iOS apps that are allowed to use the key.
 * 
 */
public final class V2IosKeyRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2IosKeyRestrictionsArgs Empty = new V2IosKeyRestrictionsArgs();

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    @Import(name="allowedBundleIds")
    private @Nullable Output<List<String>> allowedBundleIds;

    /**
     * @return A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    public Optional<Output<List<String>>> allowedBundleIds() {
        return Optional.ofNullable(this.allowedBundleIds);
    }

    private V2IosKeyRestrictionsArgs() {}

    private V2IosKeyRestrictionsArgs(V2IosKeyRestrictionsArgs $) {
        this.allowedBundleIds = $.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2IosKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2IosKeyRestrictionsArgs $;

        public Builder() {
            $ = new V2IosKeyRestrictionsArgs();
        }

        public Builder(V2IosKeyRestrictionsArgs defaults) {
            $ = new V2IosKeyRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            $.allowedBundleIds = allowedBundleIds;
            return this;
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            return allowedBundleIds(Output.of(allowedBundleIds));
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }

        public V2IosKeyRestrictionsArgs build() {
            return $;
        }
    }

}