// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1beta1a;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsub.v1beta1a.inputs.GetSubscriptionArgs;
import com.pulumi.googlenative.pubsub.v1beta1a.inputs.GetSubscriptionPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta1a.inputs.GetTopicArgs;
import com.pulumi.googlenative.pubsub.v1beta1a.inputs.GetTopicPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta1a.outputs.GetSubscriptionResult;
import com.pulumi.googlenative.pubsub.v1beta1a.outputs.GetTopicResult;
import java.util.concurrent.CompletableFuture;

public final class Pubsub_v1beta1aFunctions {
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static Output<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args) {
        return getSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscriptionPlain(GetSubscriptionPlainArgs args) {
        return getSubscriptionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static Output<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta1a:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscriptionPlain(GetSubscriptionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta1a:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration of a topic. Since the topic only has the name attribute, this method is only useful to check the existence of a topic. If other attributes are added in the future, they will be returned here.
     * 
     */
    public static Output<GetTopicResult> getTopic(GetTopicArgs args) {
        return getTopic(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration of a topic. Since the topic only has the name attribute, this method is only useful to check the existence of a topic. If other attributes are added in the future, they will be returned here.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopicPlain(GetTopicPlainArgs args) {
        return getTopicPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration of a topic. Since the topic only has the name attribute, this method is only useful to check the existence of a topic. If other attributes are added in the future, they will be returned here.
     * 
     */
    public static Output<GetTopicResult> getTopic(GetTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta1a:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration of a topic. Since the topic only has the name attribute, this method is only useful to check the existence of a topic. If other attributes are added in the future, they will be returned here.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopicPlain(GetTopicPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta1a:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
}