// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelConnectionArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelConnectionIamPolicyArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelConnectionIamPolicyPlainArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelConnectionPlainArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelIamPolicyArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelIamPolicyPlainArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetChannelPlainArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetTriggerArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetTriggerIamPolicyArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetTriggerIamPolicyPlainArgs;
import com.pulumi.googlenative.eventarc.v1.inputs.GetTriggerPlainArgs;
import com.pulumi.googlenative.eventarc.v1.outputs.GetChannelConnectionIamPolicyResult;
import com.pulumi.googlenative.eventarc.v1.outputs.GetChannelConnectionResult;
import com.pulumi.googlenative.eventarc.v1.outputs.GetChannelIamPolicyResult;
import com.pulumi.googlenative.eventarc.v1.outputs.GetChannelResult;
import com.pulumi.googlenative.eventarc.v1.outputs.GetTriggerIamPolicyResult;
import com.pulumi.googlenative.eventarc.v1.outputs.GetTriggerResult;
import java.util.concurrent.CompletableFuture;

public final class Eventarc_v1Functions {
    /**
     * Get a single Channel.
     * 
     */
    public static Output<GetChannelResult> getChannel(GetChannelArgs args) {
        return getChannel(args, InvokeOptions.Empty);
    }
    /**
     * Get a single Channel.
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannelPlain(GetChannelPlainArgs args) {
        return getChannelPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a single Channel.
     * 
     */
    public static Output<GetChannelResult> getChannel(GetChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single Channel.
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannelPlain(GetChannelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single ChannelConnection.
     * 
     */
    public static Output<GetChannelConnectionResult> getChannelConnection(GetChannelConnectionArgs args) {
        return getChannelConnection(args, InvokeOptions.Empty);
    }
    /**
     * Get a single ChannelConnection.
     * 
     */
    public static CompletableFuture<GetChannelConnectionResult> getChannelConnectionPlain(GetChannelConnectionPlainArgs args) {
        return getChannelConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a single ChannelConnection.
     * 
     */
    public static Output<GetChannelConnectionResult> getChannelConnection(GetChannelConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getChannelConnection", TypeShape.of(GetChannelConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single ChannelConnection.
     * 
     */
    public static CompletableFuture<GetChannelConnectionResult> getChannelConnectionPlain(GetChannelConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannelConnection", TypeShape.of(GetChannelConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetChannelConnectionIamPolicyResult> getChannelConnectionIamPolicy(GetChannelConnectionIamPolicyArgs args) {
        return getChannelConnectionIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelConnectionIamPolicyResult> getChannelConnectionIamPolicyPlain(GetChannelConnectionIamPolicyPlainArgs args) {
        return getChannelConnectionIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetChannelConnectionIamPolicyResult> getChannelConnectionIamPolicy(GetChannelConnectionIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getChannelConnectionIamPolicy", TypeShape.of(GetChannelConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelConnectionIamPolicyResult> getChannelConnectionIamPolicyPlain(GetChannelConnectionIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannelConnectionIamPolicy", TypeShape.of(GetChannelConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetChannelIamPolicyResult> getChannelIamPolicy(GetChannelIamPolicyArgs args) {
        return getChannelIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelIamPolicyResult> getChannelIamPolicyPlain(GetChannelIamPolicyPlainArgs args) {
        return getChannelIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetChannelIamPolicyResult> getChannelIamPolicy(GetChannelIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getChannelIamPolicy", TypeShape.of(GetChannelIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelIamPolicyResult> getChannelIamPolicyPlain(GetChannelIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannelIamPolicy", TypeShape.of(GetChannelIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single trigger.
     * 
     */
    public static Output<GetTriggerResult> getTrigger(GetTriggerArgs args) {
        return getTrigger(args, InvokeOptions.Empty);
    }
    /**
     * Get a single trigger.
     * 
     */
    public static CompletableFuture<GetTriggerResult> getTriggerPlain(GetTriggerPlainArgs args) {
        return getTriggerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a single trigger.
     * 
     */
    public static Output<GetTriggerResult> getTrigger(GetTriggerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getTrigger", TypeShape.of(GetTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single trigger.
     * 
     */
    public static CompletableFuture<GetTriggerResult> getTriggerPlain(GetTriggerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getTrigger", TypeShape.of(GetTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTriggerIamPolicyResult> getTriggerIamPolicy(GetTriggerIamPolicyArgs args) {
        return getTriggerIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTriggerIamPolicyResult> getTriggerIamPolicyPlain(GetTriggerIamPolicyPlainArgs args) {
        return getTriggerIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTriggerIamPolicyResult> getTriggerIamPolicy(GetTriggerIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:eventarc/v1:getTriggerIamPolicy", TypeShape.of(GetTriggerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTriggerIamPolicyResult> getTriggerIamPolicyPlain(GetTriggerIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getTriggerIamPolicy", TypeShape.of(GetTriggerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}