// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudbuild.v1beta1.inputs.GetWorkerPoolArgs;
import com.pulumi.googlenative.cloudbuild.v1beta1.inputs.GetWorkerPoolPlainArgs;
import com.pulumi.googlenative.cloudbuild.v1beta1.outputs.GetWorkerPoolResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudbuild_v1beta1Functions {
    /**
     * Returns details of a `WorkerPool`.
     * 
     */
    public static Output<GetWorkerPoolResult> getWorkerPool(GetWorkerPoolArgs args) {
        return getWorkerPool(args, InvokeOptions.Empty);
    }
    /**
     * Returns details of a `WorkerPool`.
     * 
     */
    public static CompletableFuture<GetWorkerPoolResult> getWorkerPoolPlain(GetWorkerPoolPlainArgs args) {
        return getWorkerPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns details of a `WorkerPool`.
     * 
     */
    public static Output<GetWorkerPoolResult> getWorkerPool(GetWorkerPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudbuild/v1beta1:getWorkerPool", TypeShape.of(GetWorkerPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns details of a `WorkerPool`.
     * 
     */
    public static CompletableFuture<GetWorkerPoolResult> getWorkerPoolPlain(GetWorkerPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbuild/v1beta1:getWorkerPool", TypeShape.of(GetWorkerPoolResult.class), args, Utilities.withVersion(options));
    }
}