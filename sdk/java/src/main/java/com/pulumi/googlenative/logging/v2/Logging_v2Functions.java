// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountBucketArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountBucketPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountBucketViewArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountBucketViewPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountExclusionArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountExclusionPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountSinkArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBillingAccountSinkPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBucketArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBucketPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBucketViewArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetBucketViewPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetExclusionArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetExclusionPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderBucketArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderBucketPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderBucketViewArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderBucketViewPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderExclusionArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderExclusionPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderSinkArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetFolderSinkPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetMetricArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetMetricPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationBucketArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationBucketPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationBucketViewArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationBucketViewPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationExclusionArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationExclusionPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationSinkArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetOrganizationSinkPlainArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetSinkArgs;
import com.pulumi.googlenative.logging.v2.inputs.GetSinkPlainArgs;
import com.pulumi.googlenative.logging.v2.outputs.GetBillingAccountBucketResult;
import com.pulumi.googlenative.logging.v2.outputs.GetBillingAccountBucketViewResult;
import com.pulumi.googlenative.logging.v2.outputs.GetBillingAccountExclusionResult;
import com.pulumi.googlenative.logging.v2.outputs.GetBillingAccountSinkResult;
import com.pulumi.googlenative.logging.v2.outputs.GetBucketResult;
import com.pulumi.googlenative.logging.v2.outputs.GetBucketViewResult;
import com.pulumi.googlenative.logging.v2.outputs.GetExclusionResult;
import com.pulumi.googlenative.logging.v2.outputs.GetFolderBucketResult;
import com.pulumi.googlenative.logging.v2.outputs.GetFolderBucketViewResult;
import com.pulumi.googlenative.logging.v2.outputs.GetFolderExclusionResult;
import com.pulumi.googlenative.logging.v2.outputs.GetFolderSinkResult;
import com.pulumi.googlenative.logging.v2.outputs.GetMetricResult;
import com.pulumi.googlenative.logging.v2.outputs.GetOrganizationBucketResult;
import com.pulumi.googlenative.logging.v2.outputs.GetOrganizationBucketViewResult;
import com.pulumi.googlenative.logging.v2.outputs.GetOrganizationExclusionResult;
import com.pulumi.googlenative.logging.v2.outputs.GetOrganizationSinkResult;
import com.pulumi.googlenative.logging.v2.outputs.GetSinkResult;
import java.util.concurrent.CompletableFuture;

public final class Logging_v2Functions {
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetBillingAccountBucketResult> getBillingAccountBucket(GetBillingAccountBucketArgs args) {
        return getBillingAccountBucket(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetBillingAccountBucketResult> getBillingAccountBucketPlain(GetBillingAccountBucketPlainArgs args) {
        return getBillingAccountBucketPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetBillingAccountBucketResult> getBillingAccountBucket(GetBillingAccountBucketArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBillingAccountBucket", TypeShape.of(GetBillingAccountBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetBillingAccountBucketResult> getBillingAccountBucketPlain(GetBillingAccountBucketPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBillingAccountBucket", TypeShape.of(GetBillingAccountBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetBillingAccountBucketViewResult> getBillingAccountBucketView(GetBillingAccountBucketViewArgs args) {
        return getBillingAccountBucketView(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetBillingAccountBucketViewResult> getBillingAccountBucketViewPlain(GetBillingAccountBucketViewPlainArgs args) {
        return getBillingAccountBucketViewPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetBillingAccountBucketViewResult> getBillingAccountBucketView(GetBillingAccountBucketViewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBillingAccountBucketView", TypeShape.of(GetBillingAccountBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetBillingAccountBucketViewResult> getBillingAccountBucketViewPlain(GetBillingAccountBucketViewPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBillingAccountBucketView", TypeShape.of(GetBillingAccountBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetBillingAccountExclusionResult> getBillingAccountExclusion(GetBillingAccountExclusionArgs args) {
        return getBillingAccountExclusion(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetBillingAccountExclusionResult> getBillingAccountExclusionPlain(GetBillingAccountExclusionPlainArgs args) {
        return getBillingAccountExclusionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetBillingAccountExclusionResult> getBillingAccountExclusion(GetBillingAccountExclusionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBillingAccountExclusion", TypeShape.of(GetBillingAccountExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetBillingAccountExclusionResult> getBillingAccountExclusionPlain(GetBillingAccountExclusionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBillingAccountExclusion", TypeShape.of(GetBillingAccountExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetBillingAccountSinkResult> getBillingAccountSink(GetBillingAccountSinkArgs args) {
        return getBillingAccountSink(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetBillingAccountSinkResult> getBillingAccountSinkPlain(GetBillingAccountSinkPlainArgs args) {
        return getBillingAccountSinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetBillingAccountSinkResult> getBillingAccountSink(GetBillingAccountSinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBillingAccountSink", TypeShape.of(GetBillingAccountSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetBillingAccountSinkResult> getBillingAccountSinkPlain(GetBillingAccountSinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBillingAccountSink", TypeShape.of(GetBillingAccountSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetBucketResult> getBucket(GetBucketArgs args) {
        return getBucket(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetBucketResult> getBucketPlain(GetBucketPlainArgs args) {
        return getBucketPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetBucketResult> getBucket(GetBucketArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBucket", TypeShape.of(GetBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetBucketResult> getBucketPlain(GetBucketPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBucket", TypeShape.of(GetBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetBucketViewResult> getBucketView(GetBucketViewArgs args) {
        return getBucketView(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetBucketViewResult> getBucketViewPlain(GetBucketViewPlainArgs args) {
        return getBucketViewPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetBucketViewResult> getBucketView(GetBucketViewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getBucketView", TypeShape.of(GetBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetBucketViewResult> getBucketViewPlain(GetBucketViewPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getBucketView", TypeShape.of(GetBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetExclusionResult> getExclusion(GetExclusionArgs args) {
        return getExclusion(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetExclusionResult> getExclusionPlain(GetExclusionPlainArgs args) {
        return getExclusionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetExclusionResult> getExclusion(GetExclusionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getExclusion", TypeShape.of(GetExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetExclusionResult> getExclusionPlain(GetExclusionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getExclusion", TypeShape.of(GetExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetFolderBucketResult> getFolderBucket(GetFolderBucketArgs args) {
        return getFolderBucket(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetFolderBucketResult> getFolderBucketPlain(GetFolderBucketPlainArgs args) {
        return getFolderBucketPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetFolderBucketResult> getFolderBucket(GetFolderBucketArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getFolderBucket", TypeShape.of(GetFolderBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetFolderBucketResult> getFolderBucketPlain(GetFolderBucketPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getFolderBucket", TypeShape.of(GetFolderBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetFolderBucketViewResult> getFolderBucketView(GetFolderBucketViewArgs args) {
        return getFolderBucketView(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetFolderBucketViewResult> getFolderBucketViewPlain(GetFolderBucketViewPlainArgs args) {
        return getFolderBucketViewPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetFolderBucketViewResult> getFolderBucketView(GetFolderBucketViewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getFolderBucketView", TypeShape.of(GetFolderBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetFolderBucketViewResult> getFolderBucketViewPlain(GetFolderBucketViewPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getFolderBucketView", TypeShape.of(GetFolderBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetFolderExclusionResult> getFolderExclusion(GetFolderExclusionArgs args) {
        return getFolderExclusion(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetFolderExclusionResult> getFolderExclusionPlain(GetFolderExclusionPlainArgs args) {
        return getFolderExclusionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetFolderExclusionResult> getFolderExclusion(GetFolderExclusionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getFolderExclusion", TypeShape.of(GetFolderExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetFolderExclusionResult> getFolderExclusionPlain(GetFolderExclusionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getFolderExclusion", TypeShape.of(GetFolderExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetFolderSinkResult> getFolderSink(GetFolderSinkArgs args) {
        return getFolderSink(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetFolderSinkResult> getFolderSinkPlain(GetFolderSinkPlainArgs args) {
        return getFolderSinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetFolderSinkResult> getFolderSink(GetFolderSinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getFolderSink", TypeShape.of(GetFolderSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetFolderSinkResult> getFolderSinkPlain(GetFolderSinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getFolderSink", TypeShape.of(GetFolderSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a logs-based metric.
     * 
     */
    public static Output<GetMetricResult> getMetric(GetMetricArgs args) {
        return getMetric(args, InvokeOptions.Empty);
    }
    /**
     * Gets a logs-based metric.
     * 
     */
    public static CompletableFuture<GetMetricResult> getMetricPlain(GetMetricPlainArgs args) {
        return getMetricPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a logs-based metric.
     * 
     */
    public static Output<GetMetricResult> getMetric(GetMetricArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getMetric", TypeShape.of(GetMetricResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a logs-based metric.
     * 
     */
    public static CompletableFuture<GetMetricResult> getMetricPlain(GetMetricPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getMetric", TypeShape.of(GetMetricResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetOrganizationBucketResult> getOrganizationBucket(GetOrganizationBucketArgs args) {
        return getOrganizationBucket(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetOrganizationBucketResult> getOrganizationBucketPlain(GetOrganizationBucketPlainArgs args) {
        return getOrganizationBucketPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static Output<GetOrganizationBucketResult> getOrganizationBucket(GetOrganizationBucketArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getOrganizationBucket", TypeShape.of(GetOrganizationBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a log bucket.
     * 
     */
    public static CompletableFuture<GetOrganizationBucketResult> getOrganizationBucketPlain(GetOrganizationBucketPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getOrganizationBucket", TypeShape.of(GetOrganizationBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetOrganizationBucketViewResult> getOrganizationBucketView(GetOrganizationBucketViewArgs args) {
        return getOrganizationBucketView(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetOrganizationBucketViewResult> getOrganizationBucketViewPlain(GetOrganizationBucketViewPlainArgs args) {
        return getOrganizationBucketViewPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static Output<GetOrganizationBucketViewResult> getOrganizationBucketView(GetOrganizationBucketViewArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getOrganizationBucketView", TypeShape.of(GetOrganizationBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a view on a log bucket..
     * 
     */
    public static CompletableFuture<GetOrganizationBucketViewResult> getOrganizationBucketViewPlain(GetOrganizationBucketViewPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getOrganizationBucketView", TypeShape.of(GetOrganizationBucketViewResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetOrganizationExclusionResult> getOrganizationExclusion(GetOrganizationExclusionArgs args) {
        return getOrganizationExclusion(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetOrganizationExclusionResult> getOrganizationExclusionPlain(GetOrganizationExclusionPlainArgs args) {
        return getOrganizationExclusionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static Output<GetOrganizationExclusionResult> getOrganizationExclusion(GetOrganizationExclusionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getOrganizationExclusion", TypeShape.of(GetOrganizationExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the description of an exclusion in the _Default sink.
     * 
     */
    public static CompletableFuture<GetOrganizationExclusionResult> getOrganizationExclusionPlain(GetOrganizationExclusionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getOrganizationExclusion", TypeShape.of(GetOrganizationExclusionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetOrganizationSinkResult> getOrganizationSink(GetOrganizationSinkArgs args) {
        return getOrganizationSink(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetOrganizationSinkResult> getOrganizationSinkPlain(GetOrganizationSinkPlainArgs args) {
        return getOrganizationSinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetOrganizationSinkResult> getOrganizationSink(GetOrganizationSinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getOrganizationSink", TypeShape.of(GetOrganizationSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetOrganizationSinkResult> getOrganizationSinkPlain(GetOrganizationSinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getOrganizationSink", TypeShape.of(GetOrganizationSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetSinkResult> getSink(GetSinkArgs args) {
        return getSink(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetSinkResult> getSinkPlain(GetSinkPlainArgs args) {
        return getSinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a sink.
     * 
     */
    public static Output<GetSinkResult> getSink(GetSinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:logging/v2:getSink", TypeShape.of(GetSinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a sink.
     * 
     */
    public static CompletableFuture<GetSinkResult> getSinkPlain(GetSinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:logging/v2:getSink", TypeShape.of(GetSinkResult.class), args, Utilities.withVersion(options));
    }
}