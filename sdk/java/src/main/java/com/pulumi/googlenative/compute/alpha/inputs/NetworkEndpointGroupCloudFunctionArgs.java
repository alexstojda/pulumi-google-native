// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a Cloud Function network endpoint group (NEG). The function must be provided explicitly or in the URL mask. Note: Cloud Function must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupCloudFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupCloudFunctionArgs Empty = new NetworkEndpointGroupCloudFunctionArgs();

    /**
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: &#34;func1&#34;.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    /**
     * @return A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: &#34;func1&#34;.
     * 
     */
    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs &#34; mydomain.com/function1&#34; and &#34;mydomain.com/function2&#34; can be backed by the same Serverless NEG with URL mask &#34;/&lt;function&gt;&#34;. The URL mask will parse them to { function = &#34;function1&#34; } and { function = &#34;function2&#34; } respectively.
     * 
     */
    @Import(name="urlMask")
    private @Nullable Output<String> urlMask;

    /**
     * @return A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs &#34; mydomain.com/function1&#34; and &#34;mydomain.com/function2&#34; can be backed by the same Serverless NEG with URL mask &#34;/&lt;function&gt;&#34;. The URL mask will parse them to { function = &#34;function1&#34; } and { function = &#34;function2&#34; } respectively.
     * 
     */
    public Optional<Output<String>> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    private NetworkEndpointGroupCloudFunctionArgs() {}

    private NetworkEndpointGroupCloudFunctionArgs(NetworkEndpointGroupCloudFunctionArgs $) {
        this.function = $.function;
        this.urlMask = $.urlMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkEndpointGroupCloudFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkEndpointGroupCloudFunctionArgs $;

        public Builder() {
            $ = new NetworkEndpointGroupCloudFunctionArgs();
        }

        public Builder(NetworkEndpointGroupCloudFunctionArgs defaults) {
            $ = new NetworkEndpointGroupCloudFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param function A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: &#34;func1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: &#34;func1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param urlMask A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs &#34; mydomain.com/function1&#34; and &#34;mydomain.com/function2&#34; can be backed by the same Serverless NEG with URL mask &#34;/&lt;function&gt;&#34;. The URL mask will parse them to { function = &#34;function1&#34; } and { function = &#34;function2&#34; } respectively.
         * 
         * @return builder
         * 
         */
        public Builder urlMask(@Nullable Output<String> urlMask) {
            $.urlMask = urlMask;
            return this;
        }

        /**
         * @param urlMask A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs &#34; mydomain.com/function1&#34; and &#34;mydomain.com/function2&#34; can be backed by the same Serverless NEG with URL mask &#34;/&lt;function&gt;&#34;. The URL mask will parse them to { function = &#34;function1&#34; } and { function = &#34;function2&#34; } respectively.
         * 
         * @return builder
         * 
         */
        public Builder urlMask(String urlMask) {
            return urlMask(Output.of(urlMask));
        }

        public NetworkEndpointGroupCloudFunctionArgs build() {
            return $;
        }
    }

}