// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetCryptoKeyArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetCryptoKeyPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetCryptoKeyVersionArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetCryptoKeyVersionPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetEkmConnectionArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetEkmConnectionIamPolicyArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetEkmConnectionIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetEkmConnectionPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetImportJobArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetImportJobPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingCryptoKeyIamPolicyArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingCryptoKeyIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingIamPolicyArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingImportJobIamPolicyArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingImportJobIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.inputs.GetKeyRingPlainArgs;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetCryptoKeyResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetCryptoKeyVersionResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetEkmConnectionIamPolicyResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetEkmConnectionResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetImportJobResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetKeyRingCryptoKeyIamPolicyResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetKeyRingIamPolicyResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetKeyRingImportJobIamPolicyResult;
import com.pulumi.googlenative.cloudkms.v1.outputs.GetKeyRingResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudkms_v1Functions {
    /**
     * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
     * 
     */
    public static Output<GetCryptoKeyResult> getCryptoKey(GetCryptoKeyArgs args) {
        return getCryptoKey(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyResult> getCryptoKeyPlain(GetCryptoKeyPlainArgs args) {
        return getCryptoKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
     * 
     */
    public static Output<GetCryptoKeyResult> getCryptoKey(GetCryptoKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getCryptoKey", TypeShape.of(GetCryptoKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyResult> getCryptoKeyPlain(GetCryptoKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getCryptoKey", TypeShape.of(GetCryptoKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given CryptoKeyVersion.
     * 
     */
    public static Output<GetCryptoKeyVersionResult> getCryptoKeyVersion(GetCryptoKeyVersionArgs args) {
        return getCryptoKeyVersion(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyVersionResult> getCryptoKeyVersionPlain(GetCryptoKeyVersionPlainArgs args) {
        return getCryptoKeyVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given CryptoKeyVersion.
     * 
     */
    public static Output<GetCryptoKeyVersionResult> getCryptoKeyVersion(GetCryptoKeyVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getCryptoKeyVersion", TypeShape.of(GetCryptoKeyVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given CryptoKeyVersion.
     * 
     */
    public static CompletableFuture<GetCryptoKeyVersionResult> getCryptoKeyVersionPlain(GetCryptoKeyVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getCryptoKeyVersion", TypeShape.of(GetCryptoKeyVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given EkmConnection.
     * 
     */
    public static Output<GetEkmConnectionResult> getEkmConnection(GetEkmConnectionArgs args) {
        return getEkmConnection(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given EkmConnection.
     * 
     */
    public static CompletableFuture<GetEkmConnectionResult> getEkmConnectionPlain(GetEkmConnectionPlainArgs args) {
        return getEkmConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given EkmConnection.
     * 
     */
    public static Output<GetEkmConnectionResult> getEkmConnection(GetEkmConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getEkmConnection", TypeShape.of(GetEkmConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given EkmConnection.
     * 
     */
    public static CompletableFuture<GetEkmConnectionResult> getEkmConnectionPlain(GetEkmConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getEkmConnection", TypeShape.of(GetEkmConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicy(GetEkmConnectionIamPolicyArgs args) {
        return getEkmConnectionIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicyPlain(GetEkmConnectionIamPolicyPlainArgs args) {
        return getEkmConnectionIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicy(GetEkmConnectionIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getEkmConnectionIamPolicy", TypeShape.of(GetEkmConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEkmConnectionIamPolicyResult> getEkmConnectionIamPolicyPlain(GetEkmConnectionIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getEkmConnectionIamPolicy", TypeShape.of(GetEkmConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given ImportJob.
     * 
     */
    public static Output<GetImportJobResult> getImportJob(GetImportJobArgs args) {
        return getImportJob(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given ImportJob.
     * 
     */
    public static CompletableFuture<GetImportJobResult> getImportJobPlain(GetImportJobPlainArgs args) {
        return getImportJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given ImportJob.
     * 
     */
    public static Output<GetImportJobResult> getImportJob(GetImportJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getImportJob", TypeShape.of(GetImportJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given ImportJob.
     * 
     */
    public static CompletableFuture<GetImportJobResult> getImportJobPlain(GetImportJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getImportJob", TypeShape.of(GetImportJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given KeyRing.
     * 
     */
    public static Output<GetKeyRingResult> getKeyRing(GetKeyRingArgs args) {
        return getKeyRing(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given KeyRing.
     * 
     */
    public static CompletableFuture<GetKeyRingResult> getKeyRingPlain(GetKeyRingPlainArgs args) {
        return getKeyRingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for a given KeyRing.
     * 
     */
    public static Output<GetKeyRingResult> getKeyRing(GetKeyRingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getKeyRing", TypeShape.of(GetKeyRingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns metadata for a given KeyRing.
     * 
     */
    public static CompletableFuture<GetKeyRingResult> getKeyRingPlain(GetKeyRingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRing", TypeShape.of(GetKeyRingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicy(GetKeyRingCryptoKeyIamPolicyArgs args) {
        return getKeyRingCryptoKeyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicyPlain(GetKeyRingCryptoKeyIamPolicyPlainArgs args) {
        return getKeyRingCryptoKeyIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicy(GetKeyRingCryptoKeyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getKeyRingCryptoKeyIamPolicy", TypeShape.of(GetKeyRingCryptoKeyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingCryptoKeyIamPolicyResult> getKeyRingCryptoKeyIamPolicyPlain(GetKeyRingCryptoKeyIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingCryptoKeyIamPolicy", TypeShape.of(GetKeyRingCryptoKeyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingIamPolicyResult> getKeyRingIamPolicy(GetKeyRingIamPolicyArgs args) {
        return getKeyRingIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingIamPolicyResult> getKeyRingIamPolicyPlain(GetKeyRingIamPolicyPlainArgs args) {
        return getKeyRingIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingIamPolicyResult> getKeyRingIamPolicy(GetKeyRingIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getKeyRingIamPolicy", TypeShape.of(GetKeyRingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingIamPolicyResult> getKeyRingIamPolicyPlain(GetKeyRingIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingIamPolicy", TypeShape.of(GetKeyRingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicy(GetKeyRingImportJobIamPolicyArgs args) {
        return getKeyRingImportJobIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicyPlain(GetKeyRingImportJobIamPolicyPlainArgs args) {
        return getKeyRingImportJobIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicy(GetKeyRingImportJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudkms/v1:getKeyRingImportJobIamPolicy", TypeShape.of(GetKeyRingImportJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetKeyRingImportJobIamPolicyResult> getKeyRingImportJobIamPolicyPlain(GetKeyRingImportJobIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudkms/v1:getKeyRingImportJobIamPolicy", TypeShape.of(GetKeyRingImportJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}