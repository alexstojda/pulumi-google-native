// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.websecurityscanner.v1alpha.inputs.GetScanConfigArgs;
import com.pulumi.googlenative.websecurityscanner.v1alpha.inputs.GetScanConfigPlainArgs;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.GetScanConfigResult;
import java.util.concurrent.CompletableFuture;

public final class Websecurityscanner_v1alphaFunctions {
    /**
     * Gets a ScanConfig.
     * 
     */
    public static Output<GetScanConfigResult> getScanConfig(GetScanConfigArgs args) {
        return getScanConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ScanConfig.
     * 
     */
    public static CompletableFuture<GetScanConfigResult> getScanConfigPlain(GetScanConfigPlainArgs args) {
        return getScanConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ScanConfig.
     * 
     */
    public static Output<GetScanConfigResult> getScanConfig(GetScanConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:websecurityscanner/v1alpha:getScanConfig", TypeShape.of(GetScanConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ScanConfig.
     * 
     */
    public static CompletableFuture<GetScanConfigResult> getScanConfigPlain(GetScanConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:websecurityscanner/v1alpha:getScanConfig", TypeShape.of(GetScanConfigResult.class), args, Utilities.withVersion(options));
    }
}