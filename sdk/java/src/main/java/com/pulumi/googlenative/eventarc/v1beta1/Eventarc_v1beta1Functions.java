// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.eventarc.v1beta1.inputs.GetTriggerArgs;
import com.pulumi.googlenative.eventarc.v1beta1.inputs.GetTriggerIamPolicyArgs;
import com.pulumi.googlenative.eventarc.v1beta1.inputs.GetTriggerIamPolicyPlainArgs;
import com.pulumi.googlenative.eventarc.v1beta1.inputs.GetTriggerPlainArgs;
import com.pulumi.googlenative.eventarc.v1beta1.outputs.GetTriggerIamPolicyResult;
import com.pulumi.googlenative.eventarc.v1beta1.outputs.GetTriggerResult;
import java.util.concurrent.CompletableFuture;

public final class Eventarc_v1beta1Functions {
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
        return Deployment.getInstance().invoke("google-native:eventarc/v1beta1:getTrigger", TypeShape.of(GetTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a single trigger.
     * 
     */
    public static CompletableFuture<GetTriggerResult> getTriggerPlain(GetTriggerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1beta1:getTrigger", TypeShape.of(GetTriggerResult.class), args, Utilities.withVersion(options));
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
        return Deployment.getInstance().invoke("google-native:eventarc/v1beta1:getTriggerIamPolicy", TypeShape.of(GetTriggerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTriggerIamPolicyResult> getTriggerIamPolicyPlain(GetTriggerIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1beta1:getTriggerIamPolicy", TypeShape.of(GetTriggerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}