// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.memcache.v1.inputs.GetInstanceArgs;
import com.pulumi.googlenative.memcache.v1.inputs.GetInstancePlainArgs;
import com.pulumi.googlenative.memcache.v1.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class Memcache_v1Functions {
    /**
     * Gets details of a single Instance.
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args) {
        return getInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Instance.
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:memcache/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:memcache/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}