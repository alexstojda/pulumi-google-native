// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetBackupArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetBackupPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainBackupIamPolicyArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainBackupIamPolicyPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainIamPolicyArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainIamPolicyPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetDomainPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetPeeringArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetPeeringIamPolicyArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetPeeringIamPolicyPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.inputs.GetPeeringPlainArgs;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetBackupResult;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetDomainBackupIamPolicyResult;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetDomainIamPolicyResult;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetDomainResult;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetPeeringIamPolicyResult;
import com.pulumi.googlenative.managedidentities.v1alpha1.outputs.GetPeeringResult;
import java.util.concurrent.CompletableFuture;

public final class Managedidentities_v1alpha1Functions {
    /**
     * Gets details of a single Backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args) {
        return getBackupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Domain.
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args) {
        return getDomainPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Domain.
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args) {
        return getDomainBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicyPlain(GetDomainBackupIamPolicyPlainArgs args) {
        return getDomainBackupIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getDomainBackupIamPolicy", TypeShape.of(GetDomainBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicyPlain(GetDomainBackupIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getDomainBackupIamPolicy", TypeShape.of(GetDomainBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args) {
        return getDomainIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicyPlain(GetDomainIamPolicyPlainArgs args) {
        return getDomainIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getDomainIamPolicy", TypeShape.of(GetDomainIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicyPlain(GetDomainIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getDomainIamPolicy", TypeShape.of(GetDomainIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static Output<GetPeeringResult> getPeering(GetPeeringArgs args) {
        return getPeering(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static CompletableFuture<GetPeeringResult> getPeeringPlain(GetPeeringPlainArgs args) {
        return getPeeringPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static Output<GetPeeringResult> getPeering(GetPeeringArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getPeering", TypeShape.of(GetPeeringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static CompletableFuture<GetPeeringResult> getPeeringPlain(GetPeeringPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getPeering", TypeShape.of(GetPeeringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args) {
        return getPeeringIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicyPlain(GetPeeringIamPolicyPlainArgs args) {
        return getPeeringIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:managedidentities/v1alpha1:getPeeringIamPolicy", TypeShape.of(GetPeeringIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicyPlain(GetPeeringIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getPeeringIamPolicy", TypeShape.of(GetPeeringIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}