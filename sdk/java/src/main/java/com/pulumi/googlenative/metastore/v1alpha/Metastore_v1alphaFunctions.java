// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetBackupArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetBackupPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetFederationArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetFederationIamPolicyArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetFederationIamPolicyPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetFederationPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetMetadataImportArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetMetadataImportPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceBackupIamPolicyArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceBackupIamPolicyPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceDatabaseIamPolicyArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceDatabaseIamPolicyPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceDatabaseTableIamPolicyArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceDatabaseTableIamPolicyPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceIamPolicyArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServiceIamPolicyPlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.inputs.GetServicePlainArgs;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetBackupResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetFederationIamPolicyResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetFederationResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetMetadataImportResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetServiceBackupIamPolicyResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetServiceDatabaseIamPolicyResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetServiceDatabaseTableIamPolicyResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetServiceIamPolicyResult;
import com.pulumi.googlenative.metastore.v1alpha.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;

public final class Metastore_v1alphaFunctions {
    /**
     * Gets details of a single backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args) {
        return getBackupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a single federation.
     * 
     */
    public static Output<GetFederationResult> getFederation(GetFederationArgs args) {
        return getFederation(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a single federation.
     * 
     */
    public static CompletableFuture<GetFederationResult> getFederationPlain(GetFederationPlainArgs args) {
        return getFederationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a single federation.
     * 
     */
    public static Output<GetFederationResult> getFederation(GetFederationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getFederation", TypeShape.of(GetFederationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a single federation.
     * 
     */
    public static CompletableFuture<GetFederationResult> getFederationPlain(GetFederationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getFederation", TypeShape.of(GetFederationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetFederationIamPolicyResult> getFederationIamPolicy(GetFederationIamPolicyArgs args) {
        return getFederationIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetFederationIamPolicyResult> getFederationIamPolicyPlain(GetFederationIamPolicyPlainArgs args) {
        return getFederationIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetFederationIamPolicyResult> getFederationIamPolicy(GetFederationIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getFederationIamPolicy", TypeShape.of(GetFederationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetFederationIamPolicyResult> getFederationIamPolicyPlain(GetFederationIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getFederationIamPolicy", TypeShape.of(GetFederationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single import.
     * 
     */
    public static Output<GetMetadataImportResult> getMetadataImport(GetMetadataImportArgs args) {
        return getMetadataImport(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single import.
     * 
     */
    public static CompletableFuture<GetMetadataImportResult> getMetadataImportPlain(GetMetadataImportPlainArgs args) {
        return getMetadataImportPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single import.
     * 
     */
    public static Output<GetMetadataImportResult> getMetadataImport(GetMetadataImportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getMetadataImport", TypeShape.of(GetMetadataImportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single import.
     * 
     */
    public static CompletableFuture<GetMetadataImportResult> getMetadataImportPlain(GetMetadataImportPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getMetadataImport", TypeShape.of(GetMetadataImportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a single service.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a single service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a single service.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a single service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceBackupIamPolicyResult> getServiceBackupIamPolicy(GetServiceBackupIamPolicyArgs args) {
        return getServiceBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBackupIamPolicyResult> getServiceBackupIamPolicyPlain(GetServiceBackupIamPolicyPlainArgs args) {
        return getServiceBackupIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceBackupIamPolicyResult> getServiceBackupIamPolicy(GetServiceBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getServiceBackupIamPolicy", TypeShape.of(GetServiceBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBackupIamPolicyResult> getServiceBackupIamPolicyPlain(GetServiceBackupIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceBackupIamPolicy", TypeShape.of(GetServiceBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceDatabaseIamPolicyResult> getServiceDatabaseIamPolicy(GetServiceDatabaseIamPolicyArgs args) {
        return getServiceDatabaseIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceDatabaseIamPolicyResult> getServiceDatabaseIamPolicyPlain(GetServiceDatabaseIamPolicyPlainArgs args) {
        return getServiceDatabaseIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceDatabaseIamPolicyResult> getServiceDatabaseIamPolicy(GetServiceDatabaseIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getServiceDatabaseIamPolicy", TypeShape.of(GetServiceDatabaseIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceDatabaseIamPolicyResult> getServiceDatabaseIamPolicyPlain(GetServiceDatabaseIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceDatabaseIamPolicy", TypeShape.of(GetServiceDatabaseIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceDatabaseTableIamPolicyResult> getServiceDatabaseTableIamPolicy(GetServiceDatabaseTableIamPolicyArgs args) {
        return getServiceDatabaseTableIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceDatabaseTableIamPolicyResult> getServiceDatabaseTableIamPolicyPlain(GetServiceDatabaseTableIamPolicyPlainArgs args) {
        return getServiceDatabaseTableIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceDatabaseTableIamPolicyResult> getServiceDatabaseTableIamPolicy(GetServiceDatabaseTableIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getServiceDatabaseTableIamPolicy", TypeShape.of(GetServiceDatabaseTableIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceDatabaseTableIamPolicyResult> getServiceDatabaseTableIamPolicyPlain(GetServiceDatabaseTableIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceDatabaseTableIamPolicy", TypeShape.of(GetServiceDatabaseTableIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args) {
        return getServiceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args) {
        return getServiceIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:metastore/v1alpha:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}