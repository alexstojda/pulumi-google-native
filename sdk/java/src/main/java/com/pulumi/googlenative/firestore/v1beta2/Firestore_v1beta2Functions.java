// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firestore.v1beta2.inputs.GetIndexArgs;
import com.pulumi.googlenative.firestore.v1beta2.inputs.GetIndexPlainArgs;
import com.pulumi.googlenative.firestore.v1beta2.outputs.GetIndexResult;
import java.util.concurrent.CompletableFuture;

public final class Firestore_v1beta2Functions {
    /**
     * Gets a composite index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args) {
        return getIndexPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a composite index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firestore/v1beta2:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firestore/v1beta2:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
}