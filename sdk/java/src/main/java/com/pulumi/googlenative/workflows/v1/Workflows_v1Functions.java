// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.workflows.v1.inputs.GetWorkflowArgs;
import com.pulumi.googlenative.workflows.v1.inputs.GetWorkflowPlainArgs;
import com.pulumi.googlenative.workflows.v1.outputs.GetWorkflowResult;
import java.util.concurrent.CompletableFuture;

public final class Workflows_v1Functions {
    /**
     * Gets details of a single Workflow.
     * 
     */
    public static Output<GetWorkflowResult> getWorkflow(GetWorkflowArgs args) {
        return getWorkflow(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Workflow.
     * 
     */
    public static CompletableFuture<GetWorkflowResult> getWorkflowPlain(GetWorkflowPlainArgs args) {
        return getWorkflowPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Workflow.
     * 
     */
    public static Output<GetWorkflowResult> getWorkflow(GetWorkflowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:workflows/v1:getWorkflow", TypeShape.of(GetWorkflowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Workflow.
     * 
     */
    public static CompletableFuture<GetWorkflowResult> getWorkflowPlain(GetWorkflowPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:workflows/v1:getWorkflow", TypeShape.of(GetWorkflowResult.class), args, Utilities.withVersion(options));
    }
}