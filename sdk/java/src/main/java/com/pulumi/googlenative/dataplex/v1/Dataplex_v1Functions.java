// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataplex.v1.inputs.GetAssetArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetAssetPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetContentArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetContentPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetContentitemArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetContentitemPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetEntityArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetEntityPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetEnvironmentArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetEnvironmentPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeAssetIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeAssetIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeContentIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeContentIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeContentitemIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeContentitemIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeEnvironmentIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeEnvironmentIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakePlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeTaskIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeTaskIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeZoneIamPolicyArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetLakeZoneIamPolicyPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetPartitionArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetPartitionPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetTaskArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetTaskPlainArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetZoneArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GetZonePlainArgs;
import com.pulumi.googlenative.dataplex.v1.outputs.GetAssetResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetContentResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetContentitemResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetEntityResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetEnvironmentResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeAssetIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeContentIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeContentitemIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeEnvironmentIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeTaskIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetLakeZoneIamPolicyResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetPartitionResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetTaskResult;
import com.pulumi.googlenative.dataplex.v1.outputs.GetZoneResult;
import java.util.concurrent.CompletableFuture;

public final class Dataplex_v1Functions {
    /**
     * Retrieves an asset resource.
     * 
     */
    public static Output<GetAssetResult> getAsset(GetAssetArgs args) {
        return getAsset(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an asset resource.
     * 
     */
    public static CompletableFuture<GetAssetResult> getAssetPlain(GetAssetPlainArgs args) {
        return getAssetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an asset resource.
     * 
     */
    public static Output<GetAssetResult> getAsset(GetAssetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getAsset", TypeShape.of(GetAssetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves an asset resource.
     * 
     */
    public static CompletableFuture<GetAssetResult> getAssetPlain(GetAssetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getAsset", TypeShape.of(GetAssetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a content resource.
     * 
     */
    public static Output<GetContentResult> getContent(GetContentArgs args) {
        return getContent(args, InvokeOptions.Empty);
    }
    /**
     * Get a content resource.
     * 
     */
    public static CompletableFuture<GetContentResult> getContentPlain(GetContentPlainArgs args) {
        return getContentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a content resource.
     * 
     */
    public static Output<GetContentResult> getContent(GetContentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getContent", TypeShape.of(GetContentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a content resource.
     * 
     */
    public static CompletableFuture<GetContentResult> getContentPlain(GetContentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getContent", TypeShape.of(GetContentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a content resource.
     * 
     */
    public static Output<GetContentitemResult> getContentitem(GetContentitemArgs args) {
        return getContentitem(args, InvokeOptions.Empty);
    }
    /**
     * Get a content resource.
     * 
     */
    public static CompletableFuture<GetContentitemResult> getContentitemPlain(GetContentitemPlainArgs args) {
        return getContentitemPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a content resource.
     * 
     */
    public static Output<GetContentitemResult> getContentitem(GetContentitemArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getContentitem", TypeShape.of(GetContentitemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a content resource.
     * 
     */
    public static CompletableFuture<GetContentitemResult> getContentitemPlain(GetContentitemPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getContentitem", TypeShape.of(GetContentitemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a metadata entity.
     * 
     */
    public static Output<GetEntityResult> getEntity(GetEntityArgs args) {
        return getEntity(args, InvokeOptions.Empty);
    }
    /**
     * Get a metadata entity.
     * 
     */
    public static CompletableFuture<GetEntityResult> getEntityPlain(GetEntityPlainArgs args) {
        return getEntityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a metadata entity.
     * 
     */
    public static Output<GetEntityResult> getEntity(GetEntityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getEntity", TypeShape.of(GetEntityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a metadata entity.
     * 
     */
    public static CompletableFuture<GetEntityResult> getEntityPlain(GetEntityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getEntity", TypeShape.of(GetEntityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get environment resource.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Get environment resource.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args) {
        return getEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get environment resource.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get environment resource.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a lake resource.
     * 
     */
    public static Output<GetLakeResult> getLake(GetLakeArgs args) {
        return getLake(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a lake resource.
     * 
     */
    public static CompletableFuture<GetLakeResult> getLakePlain(GetLakePlainArgs args) {
        return getLakePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a lake resource.
     * 
     */
    public static Output<GetLakeResult> getLake(GetLakeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLake", TypeShape.of(GetLakeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a lake resource.
     * 
     */
    public static CompletableFuture<GetLakeResult> getLakePlain(GetLakePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLake", TypeShape.of(GetLakeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeAssetIamPolicyResult> getLakeAssetIamPolicy(GetLakeAssetIamPolicyArgs args) {
        return getLakeAssetIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeAssetIamPolicyResult> getLakeAssetIamPolicyPlain(GetLakeAssetIamPolicyPlainArgs args) {
        return getLakeAssetIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeAssetIamPolicyResult> getLakeAssetIamPolicy(GetLakeAssetIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeAssetIamPolicy", TypeShape.of(GetLakeAssetIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeAssetIamPolicyResult> getLakeAssetIamPolicyPlain(GetLakeAssetIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeAssetIamPolicy", TypeShape.of(GetLakeAssetIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static Output<GetLakeContentIamPolicyResult> getLakeContentIamPolicy(GetLakeContentIamPolicyArgs args) {
        return getLakeContentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static CompletableFuture<GetLakeContentIamPolicyResult> getLakeContentIamPolicyPlain(GetLakeContentIamPolicyPlainArgs args) {
        return getLakeContentIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static Output<GetLakeContentIamPolicyResult> getLakeContentIamPolicy(GetLakeContentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeContentIamPolicy", TypeShape.of(GetLakeContentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static CompletableFuture<GetLakeContentIamPolicyResult> getLakeContentIamPolicyPlain(GetLakeContentIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeContentIamPolicy", TypeShape.of(GetLakeContentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static Output<GetLakeContentitemIamPolicyResult> getLakeContentitemIamPolicy(GetLakeContentitemIamPolicyArgs args) {
        return getLakeContentitemIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static CompletableFuture<GetLakeContentitemIamPolicyResult> getLakeContentitemIamPolicyPlain(GetLakeContentitemIamPolicyPlainArgs args) {
        return getLakeContentitemIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static Output<GetLakeContentitemIamPolicyResult> getLakeContentitemIamPolicy(GetLakeContentitemIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeContentitemIamPolicy", TypeShape.of(GetLakeContentitemIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a contentitem resource. A NOT_FOUND error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a policy set on it.Caller must have Google IAM dataplex.content.getIamPolicy permission on the resource.
     * 
     */
    public static CompletableFuture<GetLakeContentitemIamPolicyResult> getLakeContentitemIamPolicyPlain(GetLakeContentitemIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeContentitemIamPolicy", TypeShape.of(GetLakeContentitemIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeEnvironmentIamPolicyResult> getLakeEnvironmentIamPolicy(GetLakeEnvironmentIamPolicyArgs args) {
        return getLakeEnvironmentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeEnvironmentIamPolicyResult> getLakeEnvironmentIamPolicyPlain(GetLakeEnvironmentIamPolicyPlainArgs args) {
        return getLakeEnvironmentIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeEnvironmentIamPolicyResult> getLakeEnvironmentIamPolicy(GetLakeEnvironmentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeEnvironmentIamPolicy", TypeShape.of(GetLakeEnvironmentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeEnvironmentIamPolicyResult> getLakeEnvironmentIamPolicyPlain(GetLakeEnvironmentIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeEnvironmentIamPolicy", TypeShape.of(GetLakeEnvironmentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeIamPolicyResult> getLakeIamPolicy(GetLakeIamPolicyArgs args) {
        return getLakeIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeIamPolicyResult> getLakeIamPolicyPlain(GetLakeIamPolicyPlainArgs args) {
        return getLakeIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeIamPolicyResult> getLakeIamPolicy(GetLakeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeIamPolicy", TypeShape.of(GetLakeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeIamPolicyResult> getLakeIamPolicyPlain(GetLakeIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeIamPolicy", TypeShape.of(GetLakeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeTaskIamPolicyResult> getLakeTaskIamPolicy(GetLakeTaskIamPolicyArgs args) {
        return getLakeTaskIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeTaskIamPolicyResult> getLakeTaskIamPolicyPlain(GetLakeTaskIamPolicyPlainArgs args) {
        return getLakeTaskIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeTaskIamPolicyResult> getLakeTaskIamPolicy(GetLakeTaskIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeTaskIamPolicy", TypeShape.of(GetLakeTaskIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeTaskIamPolicyResult> getLakeTaskIamPolicyPlain(GetLakeTaskIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeTaskIamPolicy", TypeShape.of(GetLakeTaskIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeZoneIamPolicyResult> getLakeZoneIamPolicy(GetLakeZoneIamPolicyArgs args) {
        return getLakeZoneIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeZoneIamPolicyResult> getLakeZoneIamPolicyPlain(GetLakeZoneIamPolicyPlainArgs args) {
        return getLakeZoneIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetLakeZoneIamPolicyResult> getLakeZoneIamPolicy(GetLakeZoneIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getLakeZoneIamPolicy", TypeShape.of(GetLakeZoneIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetLakeZoneIamPolicyResult> getLakeZoneIamPolicyPlain(GetLakeZoneIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getLakeZoneIamPolicy", TypeShape.of(GetLakeZoneIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a metadata partition of an entity.
     * 
     */
    public static Output<GetPartitionResult> getPartition(GetPartitionArgs args) {
        return getPartition(args, InvokeOptions.Empty);
    }
    /**
     * Get a metadata partition of an entity.
     * 
     */
    public static CompletableFuture<GetPartitionResult> getPartitionPlain(GetPartitionPlainArgs args) {
        return getPartitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a metadata partition of an entity.
     * 
     */
    public static Output<GetPartitionResult> getPartition(GetPartitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getPartition", TypeShape.of(GetPartitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a metadata partition of an entity.
     * 
     */
    public static CompletableFuture<GetPartitionResult> getPartitionPlain(GetPartitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getPartition", TypeShape.of(GetPartitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get task resource.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args) {
        return getTask(args, InvokeOptions.Empty);
    }
    /**
     * Get task resource.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args) {
        return getTaskPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get task resource.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get task resource.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a zone resource.
     * 
     */
    public static Output<GetZoneResult> getZone(GetZoneArgs args) {
        return getZone(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a zone resource.
     * 
     */
    public static CompletableFuture<GetZoneResult> getZonePlain(GetZonePlainArgs args) {
        return getZonePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a zone resource.
     * 
     */
    public static Output<GetZoneResult> getZone(GetZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dataplex/v1:getZone", TypeShape.of(GetZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a zone resource.
     * 
     */
    public static CompletableFuture<GetZoneResult> getZonePlain(GetZonePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataplex/v1:getZone", TypeShape.of(GetZoneResult.class), args, Utilities.withVersion(options));
    }
}